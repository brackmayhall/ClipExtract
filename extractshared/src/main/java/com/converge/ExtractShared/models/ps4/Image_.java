
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Image_ {

    @SerializedName("type")
    @Expose
    private Long type;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The type
     */
    public Long getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Long type) {
        this.type = type;
    }

    public Image_ withType(Long type) {
        this.type = type;
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

    public Image_ withUrl(String url) {
        this.url = url;
        return this;
    }

}
