package com.converge.ExtractShared.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;

public class PcGameClip extends Clip {
	
	public PcGameClip() {
		super.setType("pc");
	}
	
	public void setExternalId(String externalId) {
		String combinedExternalId = "pc-" + externalId;
		super.setExternalId(combinedExternalId);
	}
	
	public void addTag(String tag) {
		super.addTag(tag);
	}
	public void addTags(List<String> tags) {
		super.addTags(tags);
	}
	
	public void setCreatedDate(String createdDate) {
		SimpleDateFormat format = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
			format.setTimeZone(TimeZone.getTimeZone("UTC"));
			
		Date date = null;
		try {
			date = format.parse(createdDate);
		} catch (ParseException e) {
			logger.error("could not parse date pcgameclip.", e);
		}
		super.setCreatedDate(date.getTime());
	}
	
	public void setVideoLink(String videoLink) {
		super.setVideoLink(videoLink);
	}
	public void setThumbLink(String thumbLink) {
		super.setThumbLink(thumbLink);
	}
	public void setExternalGameId(String externalGameId) {
		super.setExternalGameId(externalGameId);
	}
	public void setGameNamePretty(String gameNamePretty) {
		super.setGameNamePretty(gameNamePretty);
	}
	public void setGameNameSlug(String gameNameSlug) {
		super.setGameNameSlug(gameNameSlug);
	}
	public void setDidTrend(boolean didTrend) {
		super.setDidTrend(didTrend);
	}
	
	// have to have pretty game name
	// tagline
	// video link
	// thumb link
	public boolean clipGood(){
		if(StringUtils.isNotBlank(this.getTagline())
				&& StringUtils.isNotBlank( this.getVideoLink())
				&& StringUtils.isNotBlank( this.getThumbLink())
				&& StringUtils.isNotBlank( this.getGameNamePretty())){
			return true;
		}
		return false;
	}
}
