
package com.converge.ExtractShared.models.ps4;

import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Link {
	
	/*
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
	*/
	
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
    private DefaultSku defaultSku;
    @SerializedName("gameContentTypesList")
    @Expose
    private List<GameContentTypesList> gameContentTypesList = new ArrayList<GameContentTypesList>();
    @SerializedName("game_contentType")
    @Expose
    private String gameContentType;
    
    @SerializedName("tid")
    @Expose
    private String tid;
    
    @SerializedName("id")
    @Expose
    private String id;
    
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
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
    @SerializedName("expanded")
    @Expose
    private Boolean expanded;
    @SerializedName("age_limit")
    @Expose
    private Long ageLimit;
    @SerializedName("attributes")
    @Expose
    private Attributes_ attributes;
    @SerializedName("content_descriptors")
    @Expose
    private List<ContentDescriptor> contentDescriptors = new ArrayList<ContentDescriptor>();
    @SerializedName("content_origin")
    @Expose
    private Long contentOrigin;
    @SerializedName("content_rating")
    @Expose
    private ContentRating_ contentRating;
    @SerializedName("dob_required")
    @Expose
    private Boolean dobRequired;
    @SerializedName("links")
    @Expose
    private List<Object> links = new ArrayList<Object>();
    @SerializedName("long_desc")
    @Expose
    private String longDesc;
    @SerializedName("media_layouts")
    @Expose
    private List<MediaLayout> mediaLayouts = new ArrayList<MediaLayout>();
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("pageTypeId")
    @Expose
    private Long pageTypeId;
    @SerializedName("promomedia")
    @Expose
    private List<Object> promomedia = new ArrayList<Object>();
    @SerializedName("relationships")
    @Expose
    private List<Relationship_> relationships = new ArrayList<Relationship_>();
    @SerializedName("size")
    @Expose
    private Long size;
    @SerializedName("sku_links")
    @Expose
    private List<Object> skuLinks = new ArrayList<Object>();
    @SerializedName("skus")
    @Expose
    private List<Sku> skus = new ArrayList<Sku>();
    @SerializedName("sort")
    @Expose
    private String sort;
    @SerializedName("star_rating")
    @Expose
    private StarRating starRating;
    @SerializedName("start")
    @Expose
    private Long start;
    @SerializedName("title_name")
    @Expose
    private String titleName;
    @SerializedName("total_results")
    @Expose
    private Long totalResults;
    @SerializedName("depth")
    @Expose
    private Long depth;
    @SerializedName("skuFound")
    @Expose
    private Boolean skuFound;
    @SerializedName("parent_links")
    @Expose
    private List<ParentLink> parentLinks = new ArrayList<ParentLink>();

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

    public Link withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /*
    public void addTag(String tag) {
    	this.tags.add(tag);
    }
    */
    
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

    public Link withCloudOnlyPlatform(List<String> cloudOnlyPlatform) {
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

    public Link withContainerType(String containerType) {
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

    public Link withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultSku
     */
    public DefaultSku getDefaultSku() {
        return defaultSku;
    }

    /**
     * 
     * @param defaultSku
     *     The default_sku
     */
    public void setDefaultSku(DefaultSku defaultSku) {
        this.defaultSku = defaultSku;
    }

    public Link withDefaultSku(DefaultSku defaultSku) {
        this.defaultSku = defaultSku;
        return this;
    }

    /**
     * 
     * @return
     *     The gameContentTypesList
     */
    public List<GameContentTypesList> getGameContentTypesList() {
        return gameContentTypesList;
    }

    /**
     * 
     * @param gameContentTypesList
     *     The gameContentTypesList
     */
    public void setGameContentTypesList(List<GameContentTypesList> gameContentTypesList) {
        this.gameContentTypesList = gameContentTypesList;
    }

    public Link withGameContentTypesList(List<GameContentTypesList> gameContentTypesList) {
        this.gameContentTypesList = gameContentTypesList;
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

    public Link withGameContentType(String gameContentType) {
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

    public Link withId(String id) {
        this.id = id;
        return this;
    }
    

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Link withImages(List<Image> images) {
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

    public Link withName(String name) {
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

    public Link withPlayablePlatform(List<String> playablePlatform) {
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

    public Link withProviderName(String providerName) {
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

    public Link withReleaseDate(String releaseDate) {
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

    public Link withRestricted(Boolean restricted) {
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

    public Link withRevision(Long revision) {
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

    public Link withShortName(String shortName) {
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

    public Link withTimestamp(Long timestamp) {
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

    public Link withTopCategory(String topCategory) {
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

    public Link withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 
     * @return
     *     The expanded
     */
    public Boolean getExpanded() {
        return expanded;
    }

    /**
     * 
     * @param expanded
     *     The expanded
     */
    public void setExpanded(Boolean expanded) {
        this.expanded = expanded;
    }

    public Link withExpanded(Boolean expanded) {
        this.expanded = expanded;
        return this;
    }

    /**
     * 
     * @return
     *     The ageLimit
     */
    public Long getAgeLimit() {
        return ageLimit;
    }

    /**
     * 
     * @param ageLimit
     *     The age_limit
     */
    public void setAgeLimit(Long ageLimit) {
        this.ageLimit = ageLimit;
    }

    public Link withAgeLimit(Long ageLimit) {
        this.ageLimit = ageLimit;
        return this;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public Attributes_ getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(Attributes_ attributes) {
        this.attributes = attributes;
    }

    public Link withAttributes(Attributes_ attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 
     * @return
     *     The contentDescriptors
     */
    public List<ContentDescriptor> getContentDescriptors() {
        return contentDescriptors;
    }

    /**
     * 
     * @param contentDescriptors
     *     The content_descriptors
     */
    public void setContentDescriptors(List<ContentDescriptor> contentDescriptors) {
        this.contentDescriptors = contentDescriptors;
    }

    public Link withContentDescriptors(List<ContentDescriptor> contentDescriptors) {
        this.contentDescriptors = contentDescriptors;
        return this;
    }

    /**
     * 
     * @return
     *     The contentOrigin
     */
    public Long getContentOrigin() {
        return contentOrigin;
    }

    /**
     * 
     * @param contentOrigin
     *     The content_origin
     */
    public void setContentOrigin(Long contentOrigin) {
        this.contentOrigin = contentOrigin;
    }

    public Link withContentOrigin(Long contentOrigin) {
        this.contentOrigin = contentOrigin;
        return this;
    }

    /**
     * 
     * @return
     *     The contentRating
     */
    public ContentRating_ getContentRating() {
        return contentRating;
    }

    /**
     * 
     * @param contentRating
     *     The content_rating
     */
    public void setContentRating(ContentRating_ contentRating) {
        this.contentRating = contentRating;
    }

    public Link withContentRating(ContentRating_ contentRating) {
        this.contentRating = contentRating;
        return this;
    }

    /**
     * 
     * @return
     *     The dobRequired
     */
    public Boolean getDobRequired() {
        return dobRequired;
    }

    /**
     * 
     * @param dobRequired
     *     The dob_required
     */
    public void setDobRequired(Boolean dobRequired) {
        this.dobRequired = dobRequired;
    }

    public Link withDobRequired(Boolean dobRequired) {
        this.dobRequired = dobRequired;
        return this;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Object> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public Link withLinks(List<Object> links) {
        this.links = links;
        return this;
    }

    /**
     * 
     * @return
     *     The longDesc
     */
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * 
     * @param longDesc
     *     The long_desc
     */
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public Link withLongDesc(String longDesc) {
        this.longDesc = longDesc;
        return this;
    }

    /**
     * 
     * @return
     *     The mediaLayouts
     */
    public List<MediaLayout> getMediaLayouts() {
        return mediaLayouts;
    }

    /**
     * 
     * @param mediaLayouts
     *     The media_layouts
     */
    public void setMediaLayouts(List<MediaLayout> mediaLayouts) {
        this.mediaLayouts = mediaLayouts;
    }

    public Link withMediaLayouts(List<MediaLayout> mediaLayouts) {
        this.mediaLayouts = mediaLayouts;
        return this;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Link withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 
     * @return
     *     The pageTypeId
     */
    public Long getPageTypeId() {
        return pageTypeId;
    }

    /**
     * 
     * @param pageTypeId
     *     The pageTypeId
     */
    public void setPageTypeId(Long pageTypeId) {
        this.pageTypeId = pageTypeId;
    }

    public Link withPageTypeId(Long pageTypeId) {
        this.pageTypeId = pageTypeId;
        return this;
    }

    /**
     * 
     * @return
     *     The promomedia
     */
    public List<Object> getPromomedia() {
        return promomedia;
    }

    /**
     * 
     * @param promomedia
     *     The promomedia
     */
    public void setPromomedia(List<Object> promomedia) {
        this.promomedia = promomedia;
    }

    public Link withPromomedia(List<Object> promomedia) {
        this.promomedia = promomedia;
        return this;
    }

    /**
     * 
     * @return
     *     The relationships
     */
    public List<Relationship_> getRelationships() {
        return relationships;
    }

    /**
     * 
     * @param relationships
     *     The relationships
     */
    public void setRelationships(List<Relationship_> relationships) {
        this.relationships = relationships;
    }

    public Link withRelationships(List<Relationship_> relationships) {
        this.relationships = relationships;
        return this;
    }

    /**
     * 
     * @return
     *     The size
     */
    public Long getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(Long size) {
        this.size = size;
    }

    public Link withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The skuLinks
     */
    public List<Object> getSkuLinks() {
        return skuLinks;
    }

    /**
     * 
     * @param skuLinks
     *     The sku_links
     */
    public void setSkuLinks(List<Object> skuLinks) {
        this.skuLinks = skuLinks;
    }

    public Link withSkuLinks(List<Object> skuLinks) {
        this.skuLinks = skuLinks;
        return this;
    }

    /**
     * 
     * @return
     *     The skus
     */
    public List<Sku> getSkus() {
        return skus;
    }

    /**
     * 
     * @param skus
     *     The skus
     */
    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public Link withSkus(List<Sku> skus) {
        this.skus = skus;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    public Link withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 
     * @return
     *     The starRating
     */
    public StarRating getStarRating() {
        return starRating;
    }

    /**
     * 
     * @param starRating
     *     The star_rating
     */
    public void setStarRating(StarRating starRating) {
        this.starRating = starRating;
    }

    public Link withStarRating(StarRating starRating) {
        this.starRating = starRating;
        return this;
    }

    /**
     * 
     * @return
     *     The start
     */
    public Long getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    public void setStart(Long start) {
        this.start = start;
    }

    public Link withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 
     * @return
     *     The titleName
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * 
     * @param titleName
     *     The title_name
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public Link withTitleName(String titleName) {
        this.titleName = titleName;
        return this;
    }

    /**
     * 
     * @return
     *     The totalResults
     */
    public Long getTotalResults() {
        return totalResults;
    }

    /**
     * 
     * @param totalResults
     *     The total_results
     */
    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Link withTotalResults(Long totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * 
     * @return
     *     The depth
     */
    public Long getDepth() {
        return depth;
    }

    /**
     * 
     * @param depth
     *     The depth
     */
    public void setDepth(Long depth) {
        this.depth = depth;
    }

    public Link withDepth(Long depth) {
        this.depth = depth;
        return this;
    }

    /**
     * 
     * @return
     *     The skuFound
     */
    public Boolean getSkuFound() {
        return skuFound;
    }

    /**
     * 
     * @param skuFound
     *     The skuFound
     */
    public void setSkuFound(Boolean skuFound) {
        this.skuFound = skuFound;
    }

    public Link withSkuFound(Boolean skuFound) {
        this.skuFound = skuFound;
        return this;
    }

    /**
     * 
     * @return
     *     The parentLinks
     */
    public List<ParentLink> getParentLinks() {
        return parentLinks;
    }

    /**
     * 
     * @param parentLinks
     *     The parent_links
     */
    public void setParentLinks(List<ParentLink> parentLinks) {
        this.parentLinks = parentLinks;
    }

    public Link withParentLinks(List<ParentLink> parentLinks) {
        this.parentLinks = parentLinks;
        return this;
    }
    
    public String toJsonString() {
    	this.tid = ripTid(this.id);
    	Gson gson = new Gson();
    	return gson.toJson(this);
    }
    
    public String ripTid(String id) {
    	String[] parts = id.split("-");
    	if(parts[1] != null) {
    		return parts[1].trim();
    	}
    	return "";
    }
    
    public String getTid() {
    	if(this.tid == null || this.tid.equals("")){
    		return ripTid(this.id);
    	} else {
    		return null;
    	}
    }

}
