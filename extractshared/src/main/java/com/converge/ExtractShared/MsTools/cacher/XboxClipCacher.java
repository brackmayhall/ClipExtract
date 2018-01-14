package com.converge.ExtractShared.MsTools.cacher;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;

import org.apache.log4j.Logger;
import org.jsoup.helper.StringUtil;

import com.converge.ExtractShared.MsTools.Resolver.XboxClient;
import com.converge.ExtractShared.db.MongoManager;
import com.converge.ExtractShared.models.MsGameClip;
import com.converge.ExtractShared.models.Microsoft.GameClipUri;
import com.converge.ExtractShared.models.Microsoft.MsClip;
import com.converge.ExtractShared.models.MicrosoftXboxTrending.AuthorInfo;
import com.converge.ExtractShared.models.MicrosoftXboxTrending.Item;
import com.converge.ExtractShared.models.xboxresponse.GameClip;
import com.converge.ExtractShared.models.xboxresponse.XboxClipResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;


public class XboxClipCacher {

	final static Logger logger = Logger.getLogger(XboxClipCacher.class);
	private static final int MAX_NUM_PAGE_TRIES = 1000;
	private String xboxEndpoint = "https://account.xbox.com/%s/gameclips/loadByUser?gamerTag=%s&maxItems=%s&continuationToken=%s";
	private String referrer = "https://account.xbox.com/en-US/Profile";
	private Gson gson = new Gson();
	
	
	public void UpsertMicrosoftClip(Gson gson, Item item,XboxClient xboxClient, MongoManager mongoManager ) throws JsonSyntaxException, ParseException {
		String scid = item.getClipScid();
		String clipId = item.getClipId();
		String uid = item.getAuthorInfo().getId();

		if(!StringUtil.isBlank(scid) && !StringUtil.isBlank(clipId) && !StringUtil.isBlank(uid)) {
			
			String tempClip = xboxClient.getSpecificClip(uid, scid, clipId);
			if(!tempClip.equals("")) {
				MsClip resolvedClip = gson.fromJson(tempClip, MsClip.class);
			
				MsGameClip msClip = new MsGameClip();
				msClip.setExternalId(item.getClipId());
				msClip.setGameNamePretty(item.getContentTitle());
				
				if(item.getUgcCaption() != null) {
		    		msClip.setTagline(item.getUgcCaption());		    			
				} else {
					msClip.setTagline(item.getDescription());	
				}		    		

				msClip.setCreatedDate(item.getDate());
				msClip.setThumbLink(item.getClipThumbnail());
				msClip.setScid(scid);
				
				AuthorInfo author = item.getAuthorInfo();
				if(author != null) {
					msClip.setPostingEntity(author.getName().trim());
					msClip.setUserId(author.getId());
				}

				for(GameClipUri gcUri : resolvedClip.getGameClip().getGameClipUris()){
					if(gcUri.getUriType().equals("Download")){
						msClip.setVideoLink(gcUri.getUri());
						msClip.setExpireDate(gcUri.getExpiration());
						
					}
				}			 
				
				if(msClip.clipGood()) {
		    		mongoManager.upsertSingleMSClip(msClip);	    			
				} else {
					logger.debug("ms clip did not meet upsert criteria");
				}				    						    				    			
			}	    			
		}
	}
	
	
	public GameClip getCurrentClip(String country, String gamerTag, int maxItems, String clipId) {
		return getClip(country, gamerTag, maxItems, clipId);
	}
	
	public String getCurrentClipLink(String country, String gamerTag, int maxItems, String clipId) {
		GameClip gc = getClip(country, gamerTag, maxItems, clipId);
		return gc.getClipUri();
	}

	private GameClip getClip(String country, String gamerTag, int maxItems, String clipId) {
		XboxClipResponse clipResponse = null;
		int numTimesPaged = 0;
		
		GameClip gc = null;		
		do {
			String finalLink = "";
			if(clipResponse == null) {
				finalLink = String.format(xboxEndpoint,country,gamerTag,maxItems,"");	
			} else {
				finalLink = String.format(xboxEndpoint,country,gamerTag,maxItems,clipResponse.getContinuationToken());
			}
			//finalLink = "https://gameclipsmetadata.xboxlive.com/users/me/scids/1370999b-fca2-4c53-8ec5-73493bcb67e5/clips/2712c7e0-83cc-4a0f-8f7b-8030667bb696";
			System.out.println(finalLink);
			try {
				clipResponse = executeXboxGet(finalLink);
			} catch (Exception e) {
				logger.error("could not issue GET to microsoft", e);
			}
			numTimesPaged++;
			
			// need to update new clip links
			
			// need to see if we can set the clip response
			gc  =  tryGetClip(clipResponse,clipId);
			
			// do this while we havent found the clip and we havent tried more than MAX times
		} while(gc == null && numTimesPaged < MAX_NUM_PAGE_TRIES);
		return gc;
	}
	
	private GameClip tryGetClip(XboxClipResponse resp, String desiredId){
		GameClip clip = null;
				
		for(GameClip gc : resp.getGameClips()) {
			if(gc.getId().equals(desiredId)) {
				return gc;
			}
		}		
		return clip;
	}
	
	
	// HTTP GET request
	private XboxClipResponse executeXboxGet(String finalLink) throws Exception {
		XboxClipResponse resp = null;
		String url = finalLink;
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
	    con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36");
	    con.setRequestProperty("Referer", referrer);
		int responseCode = con.getResponseCode();

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		
		resp = gson.fromJson(response.toString(), XboxClipResponse.class);
		//print result
		System.out.println(response.toString());
		return resp;

	}
	
}
