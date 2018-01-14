package com.converge.ExtractShared.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.jsoup.helper.StringUtil;

public class MsGameClip extends Clip {

	public MsGameClip() {
		super.setType("ms");
	}
	
	public void setExternalId(String externalId) {
		super.setExternalId(externalId);
	}
	public void addTag(String tag) {
		super.addTag(tag);
	}
	public void addTags(List<String> tags) {
		super.addTags(tags);
	}
	
	public void setExpireDate(String expireDate) throws ParseException {
		SimpleDateFormat format;
		if(expireDate.length() == 20) {
			format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
					format.setTimeZone(TimeZone.getTimeZone("UTC"));
		} else if (expireDate.length() == 28) {
			format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'", Locale.US);
					format.setTimeZone(TimeZone.getTimeZone("UTC"));
		} else if (expireDate.length() == 26) {
			format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'", Locale.US);
					format.setTimeZone(TimeZone.getTimeZone("UTC"));
		}else if (expireDate.length() == 27) {
			format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss.SSSSSSSS'Z'", Locale.US);
					format.setTimeZone(TimeZone.getTimeZone("UTC"));
		}else {
			throw new ParseException("can not parse incoming microsoft date", 0);
		}
				
		Date date = null;
		try {
			date = format.parse(expireDate);
		} catch (ParseException e) {
			logger.error("could not parse date pcgameclip.", e);
		}
		super.setExpireDate(date.getTime());
	}
	
	public void setCreatedDate(String createdDate) throws ParseException {
		SimpleDateFormat format;
		if(createdDate.length() == 20) {
			format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
					format.setTimeZone(TimeZone.getTimeZone("UTC"));
		} else if (createdDate.length() == 28) {
			format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'", Locale.US);
					format.setTimeZone(TimeZone.getTimeZone("UTC"));
		} else {
			throw new ParseException("can not parse incoming microsoft date", 0);
		}
				
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

	// have to have pretty game name
	// tagline
	// video link
	// thumb link
	public boolean clipGood() {
		if(!StringUtil.isBlank(this.getGameNamePretty())
				&& !StringUtil.isBlank(this.getTagline())
				&& this.getCreatedDate() != null
				&& !StringUtil.isBlank(this.getVideoLink())
				&& !StringUtil.isBlank(this.getThumbLink())
				&& !StringUtil.isBlank(this.getPostingEntity())
				&& this.getExpireDate() > 0) {
			return true;
		}
		return false;
	}
}
