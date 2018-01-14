
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Facets_ {

    @SerializedName("relationship")
    @Expose
    private List<Relationship> relationship = new ArrayList<Relationship>();
    @SerializedName("platform")
    @Expose
    private List<Platform_> platform = new ArrayList<Platform_>();
    @SerializedName("release_date")
    @Expose
    private List<ReleaseDate_> releaseDate = new ArrayList<ReleaseDate_>();
    @SerializedName("top_category")
    @Expose
    private List<TopCategory> topCategory = new ArrayList<TopCategory>();

    /**
     * 
     * @return
     *     The relationship
     */
    public List<Relationship> getRelationship() {
        return relationship;
    }

    /**
     * 
     * @param relationship
     *     The relationship
     */
    public void setRelationship(List<Relationship> relationship) {
        this.relationship = relationship;
    }

    public Facets_ withRelationship(List<Relationship> relationship) {
        this.relationship = relationship;
        return this;
    }

    /**
     * 
     * @return
     *     The platform
     */
    public List<Platform_> getPlatform() {
        return platform;
    }

    /**
     * 
     * @param platform
     *     The platform
     */
    public void setPlatform(List<Platform_> platform) {
        this.platform = platform;
    }

    public Facets_ withPlatform(List<Platform_> platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 
     * @return
     *     The releaseDate
     */
    public List<ReleaseDate_> getReleaseDate() {
        return releaseDate;
    }

    /**
     * 
     * @param releaseDate
     *     The release_date
     */
    public void setReleaseDate(List<ReleaseDate_> releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Facets_ withReleaseDate(List<ReleaseDate_> releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * 
     * @return
     *     The topCategory
     */
    public List<TopCategory> getTopCategory() {
        return topCategory;
    }

    /**
     * 
     * @param topCategory
     *     The top_category
     */
    public void setTopCategory(List<TopCategory> topCategory) {
        this.topCategory = topCategory;
    }

    public Facets_ withTopCategory(List<TopCategory> topCategory) {
        this.topCategory = topCategory;
        return this;
    }

}
