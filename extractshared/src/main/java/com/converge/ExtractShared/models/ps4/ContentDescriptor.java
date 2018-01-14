package com.converge.ExtractShared.models.ps4;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentDescriptor {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public ContentDescriptor withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The url
     */
    public Object getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(Object url) {
        this.url = url;
    }

    public ContentDescriptor withUrl(Object url) {
        this.url = url;
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

    public ContentDescriptor withName(String name) {
        this.name = name;
        return this;
    }

}
