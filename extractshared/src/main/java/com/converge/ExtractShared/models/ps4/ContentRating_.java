package com.converge.ExtractShared.models.ps4;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ContentRating_ {

    @SerializedName("rating_system")
    @Expose
    private String ratingSystem;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The ratingSystem
     */
    public String getRatingSystem() {
        return ratingSystem;
    }

    /**
     * 
     * @param ratingSystem
     *     The rating_system
     */
    public void setRatingSystem(String ratingSystem) {
        this.ratingSystem = ratingSystem;
    }

    public ContentRating_ withRatingSystem(String ratingSystem) {
        this.ratingSystem = ratingSystem;
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

    public ContentRating_ withUrl(String url) {
        this.url = url;
        return this;
    }

}
