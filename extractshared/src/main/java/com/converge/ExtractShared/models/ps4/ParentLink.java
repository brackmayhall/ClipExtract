
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ParentLink {

    @SerializedName("bucket")
    @Expose
    private String bucket;
    @SerializedName("cloud_only_platform")
    @Expose
    private List<String> cloudOnlyPlatform = new ArrayList<String>();
    @SerializedName("container_type")
    @Expose
    private String containerType;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("default_sku")
    @Expose
    private DefaultSku_ defaultSku;
    @SerializedName("game_contentType")
    @Expose
    private String gameContentType;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("images")
    @Expose
    private List<Image_> images = new ArrayList<Image_>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("playable_platform")
    @Expose
    private List<String> playablePlatform = new ArrayList<String>();
    @SerializedName("provider_name")
    @Expose
    private String providerName;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    @SerializedName("restricted")
    @Expose
    private Boolean restricted;
    @SerializedName("revision")
    @Expose
    private Long revision;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("top_category")
    @Expose
    private String topCategory;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The bucket
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * 
     * @param bucket
     *     The bucket
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ParentLink withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 
     * @return
     *     The cloudOnlyPlatform
     */
    public List<String> getCloudOnlyPlatform() {
        return cloudOnlyPlatform;
    }

    /**
     * 
     * @param cloudOnlyPlatform
     *     The cloud_only_platform
     */
    public void setCloudOnlyPlatform(List<String> cloudOnlyPlatform) {
        this.cloudOnlyPlatform = cloudOnlyPlatform;
    }

    public ParentLink withCloudOnlyPlatform(List<String> cloudOnlyPlatform) {
        this.cloudOnlyPlatform = cloudOnlyPlatform;
        return this;
    }

    /**
     * 
     * @return
     *     The containerType
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * 
     * @param containerType
     *     The container_type
     */
    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public ParentLink withContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }

    /**
     * 
     * @return
     *     The contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * 
     * @param contentType
     *     The content_type
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public ParentLink withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultSku
     */
    public DefaultSku_ getDefaultSku() {
        return defaultSku;
    }

    /**
     * 
     * @param defaultSku
     *     The default_sku
     */
    public void setDefaultSku(DefaultSku_ defaultSku) {
        this.defaultSku = defaultSku;
    }

    public ParentLink withDefaultSku(DefaultSku_ defaultSku) {
        this.defaultSku = defaultSku;
        return this;
    }

    /**
     * 
     * @return
     *     The gameContentType
     */
    public String getGameContentType() {
        return gameContentType;
    }

    /**
     * 
     * @param gameContentType
     *     The game_contentType
     */
    public void setGameContentType(String gameContentType) {
        this.gameContentType = gameContentType;
    }

    public ParentLink withGameContentType(String gameContentType) {
        this.gameContentType = gameContentType;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public ParentLink withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image_> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image_> images) {
        this.images = images;
    }

    public ParentLink withImages(List<Image_> images) {
        this.images = images;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public ParentLink withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The playablePlatform
     */
    public List<String> getPlayablePlatform() {
        return playablePlatform;
    }

    /**
     * 
     * @param playablePlatform
     *     The playable_platform
     */
    public void setPlayablePlatform(List<String> playablePlatform) {
        this.playablePlatform = playablePlatform;
    }

    public ParentLink withPlayablePlatform(List<String> playablePlatform) {
        this.playablePlatform = playablePlatform;
        return this;
    }

    /**
     * 
     * @return
     *     The providerName
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * 
     * @param providerName
     *     The provider_name
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ParentLink withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 
     * @return
     *     The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * 
     * @param releaseDate
     *     The release_date
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ParentLink withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * 
     * @return
     *     The restricted
     */
    public Boolean getRestricted() {
        return restricted;
    }

    /**
     * 
     * @param restricted
     *     The restricted
     */
    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    public ParentLink withRestricted(Boolean restricted) {
        this.restricted = restricted;
        return this;
    }

    /**
     * 
     * @return
     *     The revision
     */
    public Long getRevision() {
        return revision;
    }

    /**
     * 
     * @param revision
     *     The revision
     */
    public void setRevision(Long revision) {
        this.revision = revision;
    }

    public ParentLink withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    /**
     * 
     * @return
     *     The shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 
     * @param shortName
     *     The short_name
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public ParentLink withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ParentLink withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 
     * @return
     *     The topCategory
     */
    public String getTopCategory() {
        return topCategory;
    }

    /**
     * 
     * @param topCategory
     *     The top_category
     */
    public void setTopCategory(String topCategory) {
        this.topCategory = topCategory;
    }

    public ParentLink withTopCategory(String topCategory) {
        this.topCategory = topCategory;
        return this;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public ParentLink withUrl(String url) {
        this.url = url;
        return this;
    }

}
