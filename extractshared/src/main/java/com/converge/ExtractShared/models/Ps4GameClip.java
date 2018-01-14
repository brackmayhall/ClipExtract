package com.converge.ExtractShared.models;

import java.util.List;

import org.jsoup.helper.StringUtil;

public class Ps4GameClip extends Clip{

	public Ps4GameClip() {
		super.setType("ps");
	}
	
	public void setExternalId(String externalId) {
		String combinedExternalId = "ps-" + externalId;
		super.setExternalId(combinedExternalId);
	}
	public void addTag(String tag) {
		super.addTag(tag);
	}
	public void addTags(List<String> tags) {
		super.addTags(tags);
	}
	public void setCreatedDate(Long createdDate) {
		super.setCreatedDate(createdDate);
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
	public void setType(String type) {
		super.setType(type);
	}
	
	// have to have pretty game name
	// tagline
	// created date
	// alt video format
	// thumb link
	public boolean clipGood() {
		if(!StringUtil.isBlank(this.getGameNamePretty())
				&& !StringUtil.isBlank(this.getTagline())
				&& this.getCreatedDate() != null
				&& this.getAltVideoFormatMap().size() > 0
				&& !StringUtil.isBlank(this.getThumbLink())) {
			return true;
		}
		return false;
	}
}
