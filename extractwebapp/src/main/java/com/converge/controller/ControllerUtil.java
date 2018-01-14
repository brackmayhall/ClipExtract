package com.converge.controller;

import java.text.ParseException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.converge.ExtractShared.MsTools.Resolver.XboxClient;
import com.converge.ExtractShared.dateutil.DateUtil;
import com.converge.ExtractShared.db.MongoManager;
import com.converge.ExtractShared.models.Microsoft.GameClip;
import com.converge.ExtractShared.models.Microsoft.GameClipUri;
import com.converge.ExtractShared.models.Microsoft.MsClip;
import com.converge.ExtractShared.models.mongoresponse.ClipResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class ControllerUtil {
		
	private static XboxClient xboxClient = new XboxClient("mayhall1024@gmail.com", "testing12345");

	public static String recacheMsClip(ClipResponse clip, Gson gson, MongoManager mongoManager) throws JsonSyntaxException {
		// need to reach out and get new clip
		if(!xboxClient.isAuthenticated()){
			xboxClient.login();
		}
		
		String clipJson = xboxClient.getSpecificClip(clip.getUserId(), clip.getScid(), clip.getExternalId());
		MsClip msClip = gson.fromJson(clipJson, MsClip.class);
		GameClip gc = msClip.getGameClip();
		if(gc != null) {
			List<GameClipUri> clipUris = gc.getGameClipUris();
			
			for(GameClipUri uris : clipUris) {
				if(uris.getUriType().equals("Download")){
					String uri = uris.getUri();
					String newExpireDate = uris.getExpiration();
					
					if(newExpireDate == null) {
						// handle error
					}
					
					long newExpireDateInt = 0;
					
					try {
						newExpireDateInt = DateUtil.msDateStringToMillis(newExpireDate);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(newExpireDateInt == 0  ) {
						// handle error here
					}					
					
					if(StringUtils.isNotBlank(uri)){
						mongoManager.updateMsClipLink(gc.getGameClipId(), uri, newExpireDateInt);
						return uri;
					}					
				}
			}			
		}
		return null;
	}
}
