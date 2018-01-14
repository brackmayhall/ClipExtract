package com.converge.ExtractShared.models;

import java.util.List;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

public class Title {
	
	public static final String DB_EXTERNAL_ID = "external_id";
	public static final String DB_GAME_NAME_PRETTY = "game_name_pretty";
	public static final String DB_GAME_NAME_SLUG = "game_name_slug";
	public static final String DB_TID = "tid";
	public static final String DB_PLATFORM = "platform";
	public static final String DB_BLURB = "blurb";
	public static final String DB_TAGS = "tags";
	public static final String DB_GENRE = "genre";
	
	private String externalId;
	private String gameNamePretty;
	private String gameNameSlug;
	private String tid;
	private String platform;
	private String blurb;
	private List<String> tags;
	private String genre;
	
	public String getExternalId() {
		return externalId;
	}
	
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	public String getGameNamePretty() {
		return gameNamePretty;
	}
	
	public void setGameNamePretty(String gameNamePretty) {
		this.gameNamePretty = gameNamePretty;
	}

	public String getGameNameSlug() {
		return gameNameSlug;
	}

	public void setGameNameSlug(String gameNameSlug) {
		this.gameNameSlug = slugPrettyName(gameNameSlug);
	}

	public String getTid() {
		return tid;
	}
	
	public void setTid(String tid) {
		this.tid = tid;
	}
	
	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public String getBlurb() {
		return blurb;
	}

	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public BasicDBObject toBasicDBObject() {

		BasicDBList tagList = new BasicDBList();
		tagList.add(this.tags);
		
		BasicDBObject doc = new BasicDBObject()
				.append(DB_EXTERNAL_ID, this.getExternalId())
		        .append(DB_GAME_NAME_PRETTY, this.getGameNamePretty())
		        .append(DB_GAME_NAME_SLUG, this.getGameNameSlug())
		        .append(DB_TID, this.getTid())
		        .append(DB_PLATFORM, this.getPlatform())
		        .append(DB_BLURB, this.getBlurb())
		        .append(DB_TAGS, tagList)
		        .append(DB_GENRE, this.getGenre());

		return doc;
	}
	
	private String slugPrettyName(String name){
		return "";
	}
}
