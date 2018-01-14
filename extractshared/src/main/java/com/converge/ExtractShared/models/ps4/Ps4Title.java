
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Ps4Title {

    @SerializedName("age_limit")
    @Expose
    private Long ageLimit;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("container_type")
    @Expose
    private String containerType;
    @SerializedName("content_origin")
    @Expose
    private Long contentOrigin;
    @SerializedName("content_rating")
    @Expose
    private ContentRating contentRating;
    @SerializedName("dob_required")
    @Expose
    private Boolean dobRequired;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("images")
    @Expose
    private List<Object> images = new ArrayList<Object>();
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();
    @SerializedName("metadata")
    @Expose
    private Metadata_ metadata;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("promomedia")
    @Expose
    private List<Object> promomedia = new ArrayList<Object>();
    @SerializedName("restricted")
    @Expose
    private Boolean restricted;
    @SerializedName("revision")
    @Expose
    private Long revision;
    @SerializedName("scene_layout")
    @Expose
    private SceneLayout sceneLayout;
    @SerializedName("size")
    @Expose
    private Long size;
    @SerializedName("sku_links")
    @Expose
    private List<Object> skuLinks = new ArrayList<Object>();
    @SerializedName("sort_default")
    @Expose
    private String sortDefault;
    @SerializedName("sort_default_direction")
    @Expose
    private String sortDefaultDirection;
    @SerializedName("start")
    @Expose
    private Long start;
    @SerializedName("template_def")
    @Expose
    private TemplateDef templateDef;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("total_results")
    @Expose
    private Long totalResults;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("expanded")
    @Expose
    private Boolean expanded;

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

    public Ps4Title withAgeLimit(Long ageLimit) {
        this.ageLimit = ageLimit;
        return this;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Ps4Title withAttributes(Attributes attributes) {
        this.attributes = attributes;
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

    public Ps4Title withContainerType(String containerType) {
        this.containerType = containerType;
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

    public Ps4Title withContentOrigin(Long contentOrigin) {
        this.contentOrigin = contentOrigin;
        return this;
    }

    /**
     * 
     * @return
     *     The contentRating
     */
    public ContentRating getContentRating() {
        return contentRating;
    }

    /**
     * 
     * @param contentRating
     *     The content_rating
     */
    public void setContentRating(ContentRating contentRating) {
        this.contentRating = contentRating;
    }

    public Ps4Title withContentRating(ContentRating contentRating) {
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

    public Ps4Title withDobRequired(Boolean dobRequired) {
        this.dobRequired = dobRequired;
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

    public Ps4Title withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Object> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Object> images) {
        this.images = images;
    }

    public Ps4Title withImages(List<Object> images) {
        this.images = images;
        return this;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Ps4Title withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    public Metadata_ getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata_ metadata) {
        this.metadata = metadata;
    }

    public Ps4Title withMetadata(Metadata_ metadata) {
        this.metadata = metadata;
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

    public Ps4Title withName(String name) {
        this.name = name;
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

    public Ps4Title withPromomedia(List<Object> promomedia) {
        this.promomedia = promomedia;
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

    public Ps4Title withRestricted(Boolean restricted) {
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

    public Ps4Title withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    /**
     * 
     * @return
     *     The sceneLayout
     */
    public SceneLayout getSceneLayout() {
        return sceneLayout;
    }

    /**
     * 
     * @param sceneLayout
     *     The scene_layout
     */
    public void setSceneLayout(SceneLayout sceneLayout) {
        this.sceneLayout = sceneLayout;
    }

    public Ps4Title withSceneLayout(SceneLayout sceneLayout) {
        this.sceneLayout = sceneLayout;
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

    public Ps4Title withSize(Long size) {
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

    public Ps4Title withSkuLinks(List<Object> skuLinks) {
        this.skuLinks = skuLinks;
        return this;
    }

    /**
     * 
     * @return
     *     The sortDefault
     */
    public String getSortDefault() {
        return sortDefault;
    }

    /**
     * 
     * @param sortDefault
     *     The sort_default
     */
    public void setSortDefault(String sortDefault) {
        this.sortDefault = sortDefault;
    }

    public Ps4Title withSortDefault(String sortDefault) {
        this.sortDefault = sortDefault;
        return this;
    }

    /**
     * 
     * @return
     *     The sortDefaultDirection
     */
    public String getSortDefaultDirection() {
        return sortDefaultDirection;
    }

    /**
     * 
     * @param sortDefaultDirection
     *     The sort_default_direction
     */
    public void setSortDefaultDirection(String sortDefaultDirection) {
        this.sortDefaultDirection = sortDefaultDirection;
    }

    public Ps4Title withSortDefaultDirection(String sortDefaultDirection) {
        this.sortDefaultDirection = sortDefaultDirection;
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

    public Ps4Title withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 
     * @return
     *     The templateDef
     */
    public TemplateDef getTemplateDef() {
        return templateDef;
    }

    /**
     * 
     * @param templateDef
     *     The template_def
     */
    public void setTemplateDef(TemplateDef templateDef) {
        this.templateDef = templateDef;
    }

    public Ps4Title withTemplateDef(TemplateDef templateDef) {
        this.templateDef = templateDef;
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

    public Ps4Title withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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

    public Ps4Title withTotalResults(Long totalResults) {
        this.totalResults = totalResults;
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

    public Ps4Title withUrl(String url) {
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

    public Ps4Title withExpanded(Boolean expanded) {
        this.expanded = expanded;
        return this;
    }

}
