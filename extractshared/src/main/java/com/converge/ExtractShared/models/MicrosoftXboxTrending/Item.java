package com.converge.ExtractShared.models.MicrosoftXboxTrending;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("clipId")
    @Expose
    private String clipId;
    @SerializedName("clipThumbnail")
    @Expose
    private String clipThumbnail;
    @SerializedName("downloadUri")
    @Expose
    private String downloadUri;
    @SerializedName("clipName")
    @Expose
    private String clipName;
    @SerializedName("clipCaption")
    @Expose
    private String clipCaption;
    @SerializedName("clipScid")
    @Expose
    private String clipScid;
    @SerializedName("dateRecorded")
    @Expose
    private String dateRecorded;
    @SerializedName("viewCount")
    @Expose
    private Integer viewCount;
    @SerializedName("contentImageUri")
    @Expose
    private String contentImageUri;
    @SerializedName("bingId")
    @Expose
    private String bingId;
    @SerializedName("contentTitle")
    @Expose
    private String contentTitle;
    @SerializedName("vuiDisplayName")
    @Expose
    private String vuiDisplayName;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("titleId")
    @Expose
    private String titleId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("hasUgc")
    @Expose
    private Boolean hasUgc;
    @SerializedName("activityItemType")
    @Expose
    private String activityItemType;
    @SerializedName("contentType")
    @Expose
    private String contentType;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("ugcCaption")
    @Expose
    private String ugcCaption;
    @SerializedName("itemText")
    @Expose
    private String itemText;
    @SerializedName("itemImage")
    @Expose
    private String itemImage;
    @SerializedName("shareRoot")
    @Expose
    private String shareRoot;
    @SerializedName("feedItemId")
    @Expose
    private String feedItemId;
    @SerializedName("itemRoot")
    @Expose
    private String itemRoot;
    @SerializedName("numLikes")
    @Expose
    private Integer numLikes;
    @SerializedName("numComments")
    @Expose
    private Integer numComments;
    @SerializedName("numShares")
    @Expose
    private Integer numShares;
    @SerializedName("hasLiked")
    @Expose
    private Boolean hasLiked;
    @SerializedName("authorInfo")
    @Expose
    private AuthorInfo authorInfo;
    @SerializedName("userXuid")
    @Expose
    private String userXuid;
    @SerializedName("sourceId")
    @Expose
    private String sourceId;
    @SerializedName("screenshotId")
    @Expose
    private String screenshotId;
    @SerializedName("screenshotThumbnail")
    @Expose
    private String screenshotThumbnail;
    @SerializedName("screenshotScid")
    @Expose
    private String screenshotScid;
    @SerializedName("screenshotName")
    @Expose
    private String screenshotName;
    @SerializedName("screenshotUri")
    @Expose
    private String screenshotUri;
	public String getClipId() {
		return clipId;
	}
	public void setClipId(String clipId) {
		this.clipId = clipId;
	}
	public String getClipThumbnail() {
		return clipThumbnail;
	}
	public void setClipThumbnail(String clipThumbnail) {
		this.clipThumbnail = clipThumbnail;
	}
	public String getDownloadUri() {
		return downloadUri;
	}
	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}
	public String getClipName() {
		return clipName;
	}
	public void setClipName(String clipName) {
		this.clipName = clipName;
	}
	public String getClipCaption() {
		return clipCaption;
	}
	public void setClipCaption(String clipCaption) {
		this.clipCaption = clipCaption;
	}
	public String getClipScid() {
		return clipScid;
	}
	public void setClipScid(String clipScid) {
		this.clipScid = clipScid;
	}
	public String getDateRecorded() {
		return dateRecorded;
	}
	public void setDateRecorded(String dateRecorded) {
		this.dateRecorded = dateRecorded;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	public String getContentImageUri() {
		return contentImageUri;
	}
	public void setContentImageUri(String contentImageUri) {
		this.contentImageUri = contentImageUri;
	}
	public String getBingId() {
		return bingId;
	}
	public void setBingId(String bingId) {
		this.bingId = bingId;
	}
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	public String getVuiDisplayName() {
		return vuiDisplayName;
	}
	public void setVuiDisplayName(String vuiDisplayName) {
		this.vuiDisplayName = vuiDisplayName;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getTitleId() {
		return titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Boolean getHasUgc() {
		return hasUgc;
	}
	public void setHasUgc(Boolean hasUgc) {
		this.hasUgc = hasUgc;
	}
	public String getActivityItemType() {
		return activityItemType;
	}
	public void setActivityItemType(String activityItemType) {
		this.activityItemType = activityItemType;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getUgcCaption() {
		return ugcCaption;
	}
	public void setUgcCaption(String ugcCaption) {
		this.ugcCaption = ugcCaption;
	}
	public String getItemText() {
		return itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	public String getShareRoot() {
		return shareRoot;
	}
	public void setShareRoot(String shareRoot) {
		this.shareRoot = shareRoot;
	}
	public String getFeedItemId() {
		return feedItemId;
	}
	public void setFeedItemId(String feedItemId) {
		this.feedItemId = feedItemId;
	}
	public String getItemRoot() {
		return itemRoot;
	}
	public void setItemRoot(String itemRoot) {
		this.itemRoot = itemRoot;
	}
	public Integer getNumLikes() {
		return numLikes;
	}
	public void setNumLikes(Integer numLikes) {
		this.numLikes = numLikes;
	}
	public Integer getNumComments() {
		return numComments;
	}
	public void setNumComments(Integer numComments) {
		this.numComments = numComments;
	}
	public Integer getNumShares() {
		return numShares;
	}
	public void setNumShares(Integer numShares) {
		this.numShares = numShares;
	}
	public Boolean getHasLiked() {
		return hasLiked;
	}
	public void setHasLiked(Boolean hasLiked) {
		this.hasLiked = hasLiked;
	}
	public AuthorInfo getAuthorInfo() {
		return authorInfo;
	}
	public void setAuthorInfo(AuthorInfo authorInfo) {
		this.authorInfo = authorInfo;
	}
	public String getUserXuid() {
		return userXuid;
	}
	public void setUserXuid(String userXuid) {
		this.userXuid = userXuid;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getScreenshotId() {
		return screenshotId;
	}
	public void setScreenshotId(String screenshotId) {
		this.screenshotId = screenshotId;
	}
	public String getScreenshotThumbnail() {
		return screenshotThumbnail;
	}
	public void setScreenshotThumbnail(String screenshotThumbnail) {
		this.screenshotThumbnail = screenshotThumbnail;
	}
	public String getScreenshotScid() {
		return screenshotScid;
	}
	public void setScreenshotScid(String screenshotScid) {
		this.screenshotScid = screenshotScid;
	}
	public String getScreenshotName() {
		return screenshotName;
	}
	public void setScreenshotName(String screenshotName) {
		this.screenshotName = screenshotName;
	}
	public String getScreenshotUri() {
		return screenshotUri;
	}
	public void setScreenshotUri(String screenshotUri) {
		this.screenshotUri = screenshotUri;
	}

}
