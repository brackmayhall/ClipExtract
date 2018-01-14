
package com.converge.ExtractShared.models.xboxresponse;

import org.jsoup.helper.StringUtil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameClip {

    @SerializedName("Id")
    @Expose
    private String Id;
    @SerializedName("Scid")
    @Expose
    private String Scid;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("ClipUri")
    @Expose
    private String ClipUri;
    @SerializedName("Preview")
    @Expose
    private String Preview;
    @SerializedName("Thumbnail")
    @Expose
    private String Thumbnail;
    @SerializedName("Expiration")
    @Expose
    private String Expiration;
    @SerializedName("Duration")
    @Expose
    private Integer Duration;
    @SerializedName("UploadTime")
    @Expose
    private String UploadTime;
    @SerializedName("Views")
    @Expose
    private String Views;
    @SerializedName("TitleId")
    @Expose
    private Integer TitleId;
    @SerializedName("TitleName")
    @Expose
    private String TitleName;
    @SerializedName("TitleDetails")
    @Expose
    private String TitleDetails;
    @SerializedName("OwnerGamerTag")
    @Expose
    private String OwnerGamerTag;
    @SerializedName("GamerProfile")
    @Expose
    private String GamerProfile;

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Scid
     */
    public String getScid() {
        return Scid;
    }

    /**
     * 
     * @param Scid
     *     The Scid
     */
    public void setScid(String Scid) {
        this.Scid = Scid;
    }

    /**
     * 
     * @return
     *     The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 
     * @param Name
     *     The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 
     * @return
     *     The ClipUri
     */
    public String getClipUri() {
        return ClipUri;
    }

    /**
     * 
     * @param ClipUri
     *     The ClipUri
     */
    public void setClipUri(String ClipUri) {
        this.ClipUri = ClipUri;
    }

    /**
     * 
     * @return
     *     The Preview
     */
    public String getPreview() {
        return Preview;
    }

    /**
     * 
     * @param Preview
     *     The Preview
     */
    public void setPreview(String Preview) {
        this.Preview = Preview;
    }

    /**
     * 
     * @return
     *     The Thumbnail
     */
    public String getThumbnail() {
        return Thumbnail;
    }

    /**
     * 
     * @param Thumbnail
     *     The Thumbnail
     */
    public void setThumbnail(String Thumbnail) {
        this.Thumbnail = Thumbnail;
    }

    /**
     * 
     * @return
     *     The Expiration
     */
    public String getExpiration() {
        return Expiration;
    }

    /**
     * 
     * @param Expiration
     *     The Expiration
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
    }
    
    public long expirationToLong() {
    	if(!StringUtil.isBlank(this.Expiration)) {
    		return 0;
    	}
    	
    	return 0;
    }

    /**
     * 
     * @return
     *     The Duration
     */
    public Integer getDuration() {
        return Duration;
    }

    /**
     * 
     * @param Duration
     *     The Duration
     */
    public void setDuration(Integer Duration) {
        this.Duration = Duration;
    }

    /**
     * 
     * @return
     *     The UploadTime
     */
    public String getUploadTime() {
        return UploadTime;
    }

    /**
     * 
     * @param UploadTime
     *     The UploadTime
     */
    public void setUploadTime(String UploadTime) {
        this.UploadTime = UploadTime;
    }

    /**
     * 
     * @return
     *     The Views
     */
    public String getViews() {
        return Views;
    }

    /**
     * 
     * @param Views
     *     The Views
     */
    public void setViews(String Views) {
        this.Views = Views;
    }

    /**
     * 
     * @return
     *     The TitleId
     */
    public Integer getTitleId() {
        return TitleId;
    }

    /**
     * 
     * @param TitleId
     *     The TitleId
     */
    public void setTitleId(Integer TitleId) {
        this.TitleId = TitleId;
    }

    /**
     * 
     * @return
     *     The TitleName
     */
    public String getTitleName() {
        return TitleName;
    }

    /**
     * 
     * @param TitleName
     *     The TitleName
     */
    public void setTitleName(String TitleName) {
        this.TitleName = TitleName;
    }

    /**
     * 
     * @return
     *     The TitleDetails
     */
    public String getTitleDetails() {
        return TitleDetails;
    }

    /**
     * 
     * @param TitleDetails
     *     The TitleDetails
     */
    public void setTitleDetails(String TitleDetails) {
        this.TitleDetails = TitleDetails;
    }

    /**
     * 
     * @return
     *     The OwnerGamerTag
     */
    public String getOwnerGamerTag() {
        return OwnerGamerTag;
    }

    /**
     * 
     * @param OwnerGamerTag
     *     The OwnerGamerTag
     */
    public void setOwnerGamerTag(String OwnerGamerTag) {
        this.OwnerGamerTag = OwnerGamerTag;
    }

    /**
     * 
     * @return
     *     The GamerProfile
     */
    public String getGamerProfile() {
        return GamerProfile;
    }

    /**
     * 
     * @param GamerProfile
     *     The GamerProfile
     */
    public void setGamerProfile(String GamerProfile) {
        this.GamerProfile = GamerProfile;
    }

}
