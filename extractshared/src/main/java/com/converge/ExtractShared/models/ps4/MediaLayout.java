
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MediaLayout {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("height")
    @Expose
    private Long height;
    @SerializedName("width")
    @Expose
    private Long width;
    @SerializedName("play")
    @Expose
    private Long play;
    @SerializedName("bannerType")
    @Expose
    private String bannerType;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public MediaLayout withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    public MediaLayout withImage(String image) {
        this.image = image;
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

    public MediaLayout withHeight(Long height) {
        this.height = height;
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

    public MediaLayout withWidth(Long width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return
     *     The play
     */
    public Long getPlay() {
        return play;
    }

    /**
     * 
     * @param play
     *     The play
     */
    public void setPlay(Long play) {
        this.play = play;
    }

    public MediaLayout withPlay(Long play) {
        this.play = play;
        return this;
    }

    /**
     * 
     * @return
     *     The bannerType
     */
    public String getBannerType() {
        return bannerType;
    }

    /**
     * 
     * @param bannerType
     *     The bannerType
     */
    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public MediaLayout withBannerType(String bannerType) {
        this.bannerType = bannerType;
        return this;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public MediaLayout withCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * 
     * @return
     *     The action
     */
    public String getAction() {
        return action;
    }

    /**
     * 
     * @param action
     *     The action
     */
    public void setAction(String action) {
        this.action = action;
    }

    public MediaLayout withAction(String action) {
        this.action = action;
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

    public MediaLayout withUrl(String url) {
        this.url = url;
        return this;
    }

}
