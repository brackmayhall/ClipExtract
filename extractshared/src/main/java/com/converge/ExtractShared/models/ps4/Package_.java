
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Package_ {

    @SerializedName("platformId")
    @Expose
    private Long platformId;
    @SerializedName("platformName")
    @Expose
    private String platformName;
    @SerializedName("size")
    @Expose
    private Long size;

    /**
     * 
     * @return
     *     The platformId
     */
    public Long getPlatformId() {
        return platformId;
    }

    /**
     * 
     * @param platformId
     *     The platformId
     */
    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public Package_ withPlatformId(Long platformId) {
        this.platformId = platformId;
        return this;
    }

    /**
     * 
     * @return
     *     The platformName
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * 
     * @param platformName
     *     The platformName
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Package_ withPlatformName(String platformName) {
        this.platformName = platformName;
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

    public Package_ withSize(Long size) {
        this.size = size;
        return this;
    }

}
