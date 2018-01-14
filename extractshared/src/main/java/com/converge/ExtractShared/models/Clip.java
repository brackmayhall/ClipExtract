
package com.converge.ExtractShared.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.jsoup.helper.StringUtil;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

public abstract class Clip {
	
	final static transient Logger logger = Logger.getLogger(Clip.class);
	
	// string that ident how this is inserted in mongo
	public static final String DB_EXTERNAL_ID = "external_id";
	public static final String DB_TAGS = "tags";
	public static final String DB_VIDEO_LINK = "video_link";
	public static final String DB_CREATED_DATE = "created_date";
	public static final String DB_THUMB_LINK = "thumb_link";
	public static final String DB_EXTERNAL_GAME_ID = "external_game_id";
	public static final String DB_GAME_NAME_PRETTY = "game_name_pretty";
	public static final String DB_GAME_NAME_SLUG = "game_name_slug";
	public static final String DB_TYPE = "type";
	public static final String DB_DID_TREND = "didTrend";
	public static final String DB_FOUND_DATE = "found_date";
	public static final String DB_VIDEO_VARIANTS = "video_variants";
	public static final String DB_TAGLINE = "tagline";
	public static final String DB_POSTING_ENTITY = "posting_entity";
	public static final String DB_EXPIRE_DATE = "expire_date";
	public static final String DB_SCID = "scid";
	public static final String DB_USER_ID = "userId";
	
	private String externalId;
	private List<String> tags = new ArrayList<String>();
	private String videoLink;
	private Long createdDate;
	private String thumbLink;
	private String externalGameId;
	private String gameNamePretty;
	private String gameNameSlug;
	private String type;
	private boolean didTrend = false;
	private Long foundDate;
	private Map<String,String> altVideoFormats = new HashMap<String,String>();
	private String tagline;
	private String postingEntity;
	private Long expireDate;
	private String scid;
	private String userId;
	
	
	public String getScid() {
		return scid;
	}

	public void setScid(String scid) {
		this.scid = scid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(long expireDate) {
		this.expireDate = expireDate;
	}

	public String getPostingEntity() {
		return postingEntity;
	}

	public void setPostingEntity(String postingEntity) {
		this.postingEntity = postingEntity;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		if(tagline != null && !StringUtil.isBlank(tagline)) {
			this.tagline = removeUrl(tagline).trim();	
		}
	}
	
	public String getAltVideoFormatByKey(String key) {
		return this.altVideoFormats.get(key);
	}
	
	public void addNewVideoFormat(String format, String url) {
		try {
			this.altVideoFormats.put(format, url);
		} catch (Exception e) {
			logger.warn("Could not add entry to alt video format.",e);
		}		
	}
	
	public Map<String,String> getAltVideoFormatMap(){
		return this.altVideoFormats;
	}
	
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public List<String> getTags() {
		return tags;
	}

	public String getVideoLink() {
		return videoLink;
	}
	public void setVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}
	public Long getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}
	
	public void addTag(String tag) {
		if(tag != null && tag.length() > 2) {
			// need to check if it already contains the tag
			if (!this.tags.contains(tag.trim())) {
				this.tags.add(tag.trim());
	        } else {
	    		if(logger.isDebugEnabled()) {
	    			logger.debug("duplicate tag located in tags list.");
	    		}
	        }
			
		}
	}
	
	public void addTags(List<String> allTags) {
		if(allTags != null) {
			for(String tag : allTags) {
				this.tags.add(tag);
			}
		}
	}
	
	public String getThumbLink() {
		return thumbLink;
	}
	public void setThumbLink(String thumbLink) {
		this.thumbLink = thumbLink;
	}
	public String getExternalGameId() {
		return externalGameId;
	}
	public void setExternalGameId(String externalGameId) {
		this.externalGameId = externalGameId;
	}
	public String getGameNamePretty() {
		return gameNamePretty;
	}
	public void setGameNamePretty(String gameNamePretty) {
		this.gameNamePretty = sanitizePrettyGameName(gameNamePretty);
	}
	public String getGameNameSlug() {
		return gameNameSlug;
	}
	public void setGameNameSlug(String gameNameSlug) {
		this.gameNameSlug = gameNameSlug;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public boolean isDidTrend() {
		return didTrend;
	}
	public void setDidTrend(boolean didTrend) {
		this.didTrend = didTrend;
	}
	
	public Long getFoundDate() {
		return foundDate;
	}
	public BasicDBObject toBasicDBObject() {
		// just gets the currnet time GMT and adds to to the json document for insertion
		Date date = new Date();
		this.foundDate = date.getTime();
		
		BasicDBList dbl = new BasicDBList();
		dbl.add(this.tags);
		
		BasicDBObject videoVariantMapHolder = new BasicDBObject();
		videoVariantMapHolder.putAll(this.getAltVideoFormatMap());
		
		BasicDBObject doc = new BasicDBObject()
				.append(DB_TAGS, dbl)
		        .append(DB_EXTERNAL_ID, this.getExternalId())
		        .append(DB_VIDEO_LINK, this.getVideoLink())
		        .append(DB_CREATED_DATE, this.getCreatedDate())
		        .append(DB_THUMB_LINK, this.getThumbLink())
		        .append(DB_EXTERNAL_GAME_ID, this.getExternalGameId())
		        .append(DB_GAME_NAME_PRETTY, this.getGameNamePretty())
		        .append(DB_GAME_NAME_SLUG, this.getGameNameSlug())
		        .append(DB_TYPE, this.getType())
		        .append(DB_DID_TREND, this.isDidTrend())
        		.append(DB_FOUND_DATE, this.getFoundDate())
				.append(DB_VIDEO_VARIANTS, videoVariantMapHolder)
				.append(DB_TAGLINE, this.tagline)
				.append(DB_POSTING_ENTITY, this.postingEntity)
				.append(DB_EXPIRE_DATE, this.expireDate)
				.append(DB_SCID, this.scid)
				.append(DB_USER_ID, this.userId);

		return doc;
	}
	
	private String sanitizePrettyGameName(String name){
		return name.replaceAll("[^A-Za-z0-9 ]","");
	}

	private String removeUrl(String commentstr)
    {
        String urlPattern = "((https?|ftp|gopher|telnet|file|Unsure|http):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
        Pattern p = Pattern.compile(urlPattern,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(commentstr);
        int i = 0;
        while (m.find()) {
            commentstr = commentstr.replaceAll(m.group(i),"").trim();
            i++;
        }
        return commentstr;
    }
	
	
}
