
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TemplateDef {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("storeTypeId")
    @Expose
    private Long storeTypeId;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("locations")
    @Expose
    private List<Location> locations = new ArrayList<Location>();
    @SerializedName("extras")
    @Expose
    private List<Extra> extras = new ArrayList<Extra>();

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

    public TemplateDef withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public TemplateDef withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The storeTypeId
     */
    public Long getStoreTypeId() {
        return storeTypeId;
    }

    /**
     * 
     * @param storeTypeId
     *     The storeTypeId
     */
    public void setStoreTypeId(Long storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public TemplateDef withStoreTypeId(Long storeTypeId) {
        this.storeTypeId = storeTypeId;
        return this;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public TemplateDef withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The locations
     */
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * 
     * @param locations
     *     The locations
     */
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public TemplateDef withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * 
     * @return
     *     The extras
     */
    public List<Extra> getExtras() {
        return extras;
    }

    /**
     * 
     * @param extras
     *     The extras
     */
    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }

    public TemplateDef withExtras(List<Extra> extras) {
        this.extras = extras;
        return this;
    }

}
