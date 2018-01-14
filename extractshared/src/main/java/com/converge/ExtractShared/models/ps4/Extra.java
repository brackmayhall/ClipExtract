
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Extra {

    @SerializedName("templateExtraId")
    @Expose
    private Long templateExtraId;
    @SerializedName("width")
    @Expose
    private Long width;
    @SerializedName("height")
    @Expose
    private Long height;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("key")
    @Expose
    private String key;

    /**
     * 
     * @return
     *     The templateExtraId
     */
    public Long getTemplateExtraId() {
        return templateExtraId;
    }

    /**
     * 
     * @param templateExtraId
     *     The templateExtraId
     */
    public void setTemplateExtraId(Long templateExtraId) {
        this.templateExtraId = templateExtraId;
    }

    public Extra withTemplateExtraId(Long templateExtraId) {
        this.templateExtraId = templateExtraId;
        return this;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Long getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Long width) {
        this.width = width;
    }

    public Extra withWidth(Long width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    public Extra withHeight(Long height) {
        this.height = height;
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

    public Extra withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The key
     */
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    public void setKey(String key) {
        this.key = key;
    }

    public Extra withKey(String key) {
        this.key = key;
        return this;
    }

}
