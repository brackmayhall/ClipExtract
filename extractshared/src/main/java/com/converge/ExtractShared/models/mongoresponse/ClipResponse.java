package com.converge.ExtractShared.models.mongoresponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "tags",
    "external_id",
    "video_link",
    "created_date",
    "thumb_link",
    "external_game_id",
    "game_name_pretty",
    "game_name_slug",
    "type",
    "didTrend",
    "found_date",
    "tagline",
    "expire_date",
    "scid",
    "userId"
})
public class ClipResponse {

    @JsonProperty("_id")
    private Id myId;
    @JsonProperty("tags")
    private List<List<String>> tags = new ArrayList<List<String>>();
    @JsonProperty("external_id")
    private String externalId;
    @JsonProperty("video_link")
    private String videoLink;
    @JsonProperty("created_date")
    private String createdDate;
    @JsonProperty("thumb_link")
    private String thumbLink;
    @JsonProperty("external_game_id")
    private String externalGameId;
    @JsonProperty("game_name_pretty")
    private String gameNamePretty;
    @JsonProperty("game_name_slug")
    private String gameNameSlug;
    @JsonProperty("type")
    private String type;
    @JsonProperty("didTrend")
    private Boolean didTrend;
    @JsonProperty("found_date")
    private String foundDate;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("expire_date")
    private String expireDate;    
    @JsonProperty("scid")
    private String scid;    
    @JsonProperty("userId")
    private String userId;    
    
    public String getScid() {
		return scid;
	}

	public void setScid(String scid) {
		this.scid = scid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	/**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("_id")
    public Id getId() {
        return myId;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(Id Id) {
        this.myId = Id;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<List<String>> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<List<String>> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The externalId
     */
    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    /**
     * 
     * @param externalId
     *     The external_id
     */
    @JsonProperty("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * 
     * @return
     *     The videoLink
     */
    @JsonProperty("video_link")
    public String getVideoLink() {
        return videoLink;
    }

    /**
     * 
     * @param videoLink
     *     The video_link
     */
    @JsonProperty("video_link")
    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    /**
     * 
     * @return
     *     The createdDate
     */
    @JsonProperty("created_date")
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * 
     * @param createdDate
     *     The created_date
     */
    @JsonProperty("created_date")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 
     * @return
     *     The thumbLink
     */
    @JsonProperty("thumb_link")
    public String getThumbLink() {
        return thumbLink;
    }

    /**
     * 
     * @param thumbLink
     *     The thumb_link
     */
    @JsonProperty("thumb_link")
    public void setThumbLink(String thumbLink) {
        this.thumbLink = thumbLink;
    }

    /**
     * 
     * @return
     *     The externalGameId
     */
    @JsonProperty("external_game_id")
    public String getExternalGameId() {
        return externalGameId;
    }

    /**
     * 
     * @param externalGameId
     *     The external_game_id
     */
    @JsonProperty("external_game_id")
    public void setExternalGameId(String externalGameId) {
        this.externalGameId = externalGameId;
    }

    /**
     * 
     * @return
     *     The gameNamePretty
     */
    @JsonProperty("game_name_pretty")
    public String getGameNamePretty() {
        return gameNamePretty;
    }

    /**
     * 
     * @param gameNamePretty
     *     The game_name_pretty
     */
    @JsonProperty("game_name_pretty")
    public void setGameNamePretty(String gameNamePretty) {
        this.gameNamePretty = gameNamePretty;
    }

    /**
     * 
     * @return
     *     The gameNameSlug
     */
    @JsonProperty("game_name_slug")
    public String getGameNameSlug() {
        return gameNameSlug;
    }

    /**
     * 
     * @param gameNameSlug
     *     The game_name_slug
     */
    @JsonProperty("game_name_slug")
    public void setGameNameSlug(String gameNameSlug) {
        this.gameNameSlug = gameNameSlug;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The didTrend
     */
    @JsonProperty("didTrend")
    public Boolean getDidTrend() {
        return didTrend;
    }

    /**
     * 
     * @param didTrend
     *     The didTrend
     */
    @JsonProperty("didTrend")
    public void setDidTrend(Boolean didTrend) {
        this.didTrend = didTrend;
    }

    /**
     * 
     * @return
     *     The foundDate
     */
    @JsonProperty("found_date")
    public String getFoundDate() {
        return foundDate;
    }

    /**
     * 
     * @param foundDate
     *     The found_date
     */
    @JsonProperty("found_date")
    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }

    
    @JsonProperty("tagline")
    public String getTagline() {
		return tagline;
	}
    @JsonProperty("tagline")
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	@JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
