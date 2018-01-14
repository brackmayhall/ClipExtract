
package com.converge.ExtractShared.models.Microsoft;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameClip {

    @SerializedName("gameClipId")
    @Expose
    private String gameClipId;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("datePublished")
    @Expose
    private String datePublished;
    @SerializedName("dateRecorded")
    @Expose
    private String dateRecorded;
    @SerializedName("lastModified")
    @Expose
    private String lastModified;
    @SerializedName("userCaption")
    @Expose
    private String userCaption;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("durationInSeconds")
    @Expose
    private Integer durationInSeconds;
    @SerializedName("scid")
    @Expose
    private String scid;
    @SerializedName("titleId")
    @Expose
    private Integer titleId;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("ratingCount")
    @Expose
    private Integer ratingCount;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("titleData")
    @Expose
    private String titleData;
    @SerializedName("systemProperties")
    @Expose
    private String systemProperties;
    @SerializedName("savedByUser")
    @Expose
    private Boolean savedByUser;
    @SerializedName("achievementId")
    @Expose
    private String achievementId;
    @SerializedName("greatestMomentId")
    @Expose
    private String greatestMomentId;
    @SerializedName("thumbnails")
    @Expose
    private List<Thumbnail> thumbnails = new ArrayList<Thumbnail>();
    @SerializedName("gameClipUris")
    @Expose
    private List<GameClipUri> gameClipUris = new ArrayList<GameClipUri>();
    @SerializedName("xuid")
    @Expose
    private String xuid;
    @SerializedName("clipName")
    @Expose
    private String clipName;
    @SerializedName("titleName")
    @Expose
    private String titleName;
    @SerializedName("gameClipLocale")
    @Expose
    private String gameClipLocale;
    @SerializedName("clipContentAttributes")
    @Expose
    private String clipContentAttributes;
    @SerializedName("deviceType")
    @Expose
    private String deviceType;
    @SerializedName("commentCount")
    @Expose
    private Integer commentCount;
    @SerializedName("likeCount")
    @Expose
    private Integer likeCount;
    @SerializedName("shareCount")
    @Expose
    private Integer shareCount;
    @SerializedName("partialViews")
    @Expose
    private Integer partialViews;
	public String getGameClipId() {
		return gameClipId;
	}
	public void setGameClipId(String gameClipId) {
		this.gameClipId = gameClipId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDatePublished() {
		return datePublished;
	}
	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}
	public String getDateRecorded() {
		return dateRecorded;
	}
	public void setDateRecorded(String dateRecorded) {
		this.dateRecorded = dateRecorded;
	}
	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public String getUserCaption() {
		return userCaption;
	}
	public void setUserCaption(String userCaption) {
		this.userCaption = userCaption;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getDurationInSeconds() {
		return durationInSeconds;
	}
	public void setDurationInSeconds(Integer durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}
	public String getScid() {
		return scid;
	}
	public void setScid(String scid) {
		this.scid = scid;
	}
	public Integer getTitleId() {
		return titleId;
	}
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getRatingCount() {
		return ratingCount;
	}
	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public String getTitleData() {
		return titleData;
	}
	public void setTitleData(String titleData) {
		this.titleData = titleData;
	}
	public String getSystemProperties() {
		return systemProperties;
	}
	public void setSystemProperties(String systemProperties) {
		this.systemProperties = systemProperties;
	}
	public Boolean getSavedByUser() {
		return savedByUser;
	}
	public void setSavedByUser(Boolean savedByUser) {
		this.savedByUser = savedByUser;
	}
	public String getAchievementId() {
		return achievementId;
	}
	public void setAchievementId(String achievementId) {
		this.achievementId = achievementId;
	}
	public String getGreatestMomentId() {
		return greatestMomentId;
	}
	public void setGreatestMomentId(String greatestMomentId) {
		this.greatestMomentId = greatestMomentId;
	}
	public List<Thumbnail> getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(List<Thumbnail> thumbnails) {
		this.thumbnails = thumbnails;
	}
	public List<GameClipUri> getGameClipUris() {
		return gameClipUris;
	}
	public void setGameClipUris(List<GameClipUri> gameClipUris) {
		this.gameClipUris = gameClipUris;
	}
	public String getXuid() {
		return xuid;
	}
	public void setXuid(String xuid) {
		this.xuid = xuid;
	}
	public String getClipName() {
		return clipName;
	}
	public void setClipName(String clipName) {
		this.clipName = clipName;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getGameClipLocale() {
		return gameClipLocale;
	}
	public void setGameClipLocale(String gameClipLocale) {
		this.gameClipLocale = gameClipLocale;
	}
	public String getClipContentAttributes() {
		return clipContentAttributes;
	}
	public void setClipContentAttributes(String clipContentAttributes) {
		this.clipContentAttributes = clipContentAttributes;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	public Integer getShareCount() {
		return shareCount;
	}
	public void setShareCount(Integer shareCount) {
		this.shareCount = shareCount;
	}
	public Integer getPartialViews() {
		return partialViews;
	}
	public void setPartialViews(Integer partialViews) {
		this.partialViews = partialViews;
	}
}
