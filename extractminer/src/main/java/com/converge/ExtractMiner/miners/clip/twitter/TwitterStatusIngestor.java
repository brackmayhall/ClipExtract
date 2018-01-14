package com.converge.ExtractMiner.miners.clip.twitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jsoup.helper.StringUtil;

import com.converge.ExtractMiner.miners.title.playstation.PlaystationTitleManager;
import com.converge.ExtractShared.db.MongoManager;
import com.converge.ExtractShared.models.Ps4GameClip;

import twitter4j.ExtendedMediaEntity;
import twitter4j.ExtendedMediaEntity.Variant;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.Status;
import twitter4j.URLEntity;

/**
 * Class that handles ingestion and further filtering
 * Twitter statuses to meet a useful criteria
 * @author Brackston Mayhall
 */
public class TwitterStatusIngestor {

	final static Logger logger = Logger.getLogger(TwitterStatusIngestor.class);
	
	// trigger keyword to search for a video clip
	private static final String PS_SITE_TRIGGER = "store.playstation.com";
	// used to construct final video clip
	private static final String finalUrlFirst = "https://twitter.com/i/cards/tfw/v1/";
	private static final String finalUrlSecond = "?cardname=__entity_video&hide_attribution=true&earned=true";
	// used to query the playstation store for titles
	private static final PlaystationTitleManager psTitleManager = new PlaystationTitleManager();
	
	/**
	 * Ingests a twitter status (this is where the magic happens)
	 * if the status meets a specific criteria
	 * it will be pushed through the ranking algorithm
	 * and then ultimately inserted into the database
	 * @param status a twitter status
	 */
	public void ingest(Status status) {	
		// singleton instance of the mongoDb database manager
		MongoManager mongoManager = MongoManager.getInstance();
		if(mongoManager == null) {
			logger.error("MongoManager is null. Twitter status ingestion will not occur.");
		} else {
			// if the status is null we just keep moving along with ingestion
			if(status != null){
				try {
					// grab the items from the tweets that are media related
					MediaEntity[] mediaEntities = status.getMediaEntities();			
					
					if(mediaEntities != null && mediaEntities.length > 0) {
						for(MediaEntity me :  mediaEntities) {
							
							// keep going until we find a good entry
							if(me == null) {
								continue;
							}
							
							String expandedUrl = me.getExpandedURL();
							
							if(expandedUrl == null) {
								continue;
							}
							
							// check to see if the status contains a video
							if(ExpandedUrlContainsTrigger(expandedUrl)) {
								// currently we only mine twitter for playstation videos
								// this means we found a video clip
								Ps4GameClip ps4Clip = new Ps4GameClip();
								ExtendedMediaEntity[] mediaEnts = status.getExtendedMediaEntities();

								// if we have entities traverse down to grab the
								// video variants
								// these are video links that can be used
								// to play on different devices (ie mobile, desktop, etc)
								if(mediaEnts != null && mediaEnts.length > 0) {
									List<ExtendedMediaEntity> meList = Arrays.asList(mediaEnts);
									if(meList != null) {
										for(ExtendedMediaEntity eme : meList ) {
											List<Variant> videoVariants = Arrays.asList(eme.getVideoVariants());
											if(videoVariants != null) {
												for(Variant vari : videoVariants) {			
													int bitrate = vari.getBitrate();
													String url = vari.getUrl();
													if(StringUtils.isNotBlank(url)) {
														ps4Clip.addNewVideoFormat(String.valueOf(bitrate),url);	
													}													
												}	
											}
										}	
									}
								}
								
								// set the thumb
								String mediaTye = me.getType();
								if(mediaTye != null && mediaTye.trim().equals("photo")) {
									ps4Clip.setThumbLink(me.getMediaURL());
								}						
								
								// find out what the game title is so we can do fuzzy word matching on it
								URLEntity[] urlEntities = status.getURLEntities();
								String gameTag = null;
								
								if(urlEntities != null && urlEntities.length > 0) {
									for(URLEntity urlEntity : urlEntities) {
										
										String url = urlEntity.getExpandedURL();
										// we check the url for "store.playstation.com"
										// and if it contains this then we can match this to a 
										// title in our database
										boolean hasPsTrigger = url.toLowerCase().contains(PS_SITE_TRIGGER);
										
										if(hasPsTrigger) {
											// then lookup in db
											String tid = getSanitizedTid(url);
											String[] countries = getCountries(url);
											ps4Clip.setExternalId(tid);
											
											// here we look up the title by the ID we grabbed from the url
											gameTag = mongoManager.findPlaystationTitleByTid(tid.trim());
											
											// if we didnt find it in our database
											// then we ask the playstation store for it
											if(StringUtil.isBlank(gameTag) || gameTag == null) {
												// lets try to ask for it from playstation
												// have to be aware of country codes
												if(countries != null && countries.length > 1 && !StringUtil.isBlank(tid)) {
													gameTag = psTitleManager.getSingleTitle(countries, tid);
												} else if (!StringUtil.isBlank(tid)){
													countries[0] = "en";
													countries[1] = "us";
													gameTag = psTitleManager.getSingleTitle(countries, tid);
												}												
											}
											ps4Clip.setGameNamePretty(gameTag);
										}
									}
								}
								
								// here we construct the final video link
								String finalClipLink = finalUrlFirst + status.getId() +finalUrlSecond;
								
								// add tags here
								if(StringUtils.isNotBlank(gameTag)) {
									ps4Clip.addTag(gameTag);
									ps4Clip.setGameNamePretty(gameTag);
								}
								
								// set the tag line
								if(StringUtils.isNotBlank(status.getText())) {
									ps4Clip.setTagline(status.getText());
								}
								
								// set other stuff
								ps4Clip.setVideoLink(finalClipLink);
								ps4Clip.addTags(getSanitizedTags(status.getHashtagEntities()));
								ps4Clip.setCreatedDate(status.getCreatedAt().getTime());
								ps4Clip.setExternalId(String.valueOf(status.getId()));

								if(logger.isDebugEnabled()) {
									logger.debug("ps4 clip link " + finalClipLink);
								}
								
								// now that we have constructed a playstation clip
								// we make sure that it meets the accepted criteria
								// for its type of clip.
								// if it does then we insert it into the database
								if(ps4Clip.clipGood()) {
									mongoManager.insertPlaystationClip(ps4Clip);					
								} else {
									logger.debug("ps4 clip did not meet correct criteria.");
								}
							}
						}
					}	
				} catch (NullPointerException ex) {
					logger.error("null pointer exception ", ex);
				}				
			}
		}
	}
	
	/**
	 * Method to check if a url contains
	 * a video keyword trigger
	 * @param urlStr the url to check for the video trigger keyword
	 * @return return true if trigger word if found and false otherwise
	 * returns false is the url is null or empty
	 */
	private boolean ExpandedUrlContainsTrigger(String urlStr) {
		try {
			if(urlStr != null && !urlStr.isEmpty()) {
				String[] urlParts = urlStr.split("/");
				if(urlParts.length > 2) {
					int secondLastIndex = urlParts.length - 2;
					String triggerWord = urlParts[secondLastIndex].trim().toLowerCase();
					return triggerWord.equalsIgnoreCase("video");	
				}
			}
			return false;			
		} catch(Exception e) {
			logger.error("exception in ExpandedUrlContainsTrigger ", e);
			return false;
		}
	}
	
	
	/**
	 * Converts hashtag entries to lowercase and returns a list
	 * of them. This will ignore the entry "ps4share"
	 * @param hashtagEntities hashtags found in a twitter status
	 * @return returns hashtag entries that are not "ps4share"
	 */
	private List<String> getSanitizedTags(HashtagEntity[] hashtagEntities) {
		List<String> tags = new ArrayList<String>();
		if(hashtagEntities != null) {
			for(HashtagEntity hte : hashtagEntities) {
				String tag = hte.getText().trim().toLowerCase();
				if(StringUtils.isNotBlank(tag) && !tag.equalsIgnoreCase("ps4share")) {
					tags.add(tag);
				}
			}	
		}
		return tags;
	}
	
	/** 
	 * Takes a string and gets and TID (playstation twitter id) from it
	 * EXAMPLE: https://store.playstation.com/#!/en-gb/tid=CUSA02126_00
	 * @param url string to be parsed to look for the id
	 * @return a string that represents the id
	 */
	private String getSanitizedTid(String url) {
		String tid = "";
		if(StringUtils.isNotBlank(url)){
	    	String[] parts = url.split("tid=");
	    	if(parts[1] != null) {
	    		tid = parts[1].trim();
	    	}			
		}
		return tid;
	}
	
	/**
	 * Gets country code from a playstation store url
	 * @param url the playstation url
	 * @return and array of countries in the order they were found
	 */
	private String[] getCountries(String url) {
		// https://store.playstation.com/#!/en-gb/tid=CUSA02126_00
		try {
			String countries = "";
			if(StringUtils.isNotBlank(url)){
		    	String[] parts = url.split("/");
		    	if(parts[5] != null) {
		    		countries = parts[4].trim();
		    	}

		    	String[] countriesArr = countries.split("-");
		    	if(countriesArr[1] != null) {
		    		return countriesArr;
		    	}	
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}
}
