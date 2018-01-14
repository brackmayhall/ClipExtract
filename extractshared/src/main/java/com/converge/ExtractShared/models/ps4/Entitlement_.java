
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Entitlement_ {

    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("drms")
    @Expose
    private List<Object> drms = new ArrayList<Object>();
    @SerializedName("duration")
    @Expose
    private Long duration;
    @SerializedName("exp_after_first_use")
    @Expose
    private Long expAfterFirstUse;
    @SerializedName("feature_type_id")
    @Expose
    private Long featureTypeId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("license_type")
    @Expose
    private Long licenseType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("packages")
    @Expose
    private List<Package_> packages = new ArrayList<Package_>();
    @SerializedName("preorder_placeholder_flag")
    @Expose
    private Boolean preorderPlaceholderFlag;
    @SerializedName("size")
    @Expose
    private Long size;
    @SerializedName("subType")
    @Expose
    private Long subType;
    @SerializedName("subtitle_language_codes")
    @Expose
    private Object subtitleLanguageCodes;
    @SerializedName("type")
    @Expose
    private Long type;
    @SerializedName("use_count")
    @Expose
    private Long useCount;
    @SerializedName("voice_language_codes")
    @Expose
    private Object voiceLanguageCodes;

    /**
     * 
     * @return
     *     The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    public Entitlement_ withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The drms
     */
    public List<Object> getDrms() {
        return drms;
    }

    /**
     * 
     * @param drms
     *     The drms
     */
    public void setDrms(List<Object> drms) {
        this.drms = drms;
    }

    public Entitlement_ withDrms(List<Object> drms) {
        this.drms = drms;
        return this;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Entitlement_ withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 
     * @return
     *     The expAfterFirstUse
     */
    public Long getExpAfterFirstUse() {
        return expAfterFirstUse;
    }

    /**
     * 
     * @param expAfterFirstUse
     *     The exp_after_first_use
     */
    public void setExpAfterFirstUse(Long expAfterFirstUse) {
        this.expAfterFirstUse = expAfterFirstUse;
    }

    public Entitlement_ withExpAfterFirstUse(Long expAfterFirstUse) {
        this.expAfterFirstUse = expAfterFirstUse;
        return this;
    }

    /**
     * 
     * @return
     *     The featureTypeId
     */
    public Long getFeatureTypeId() {
        return featureTypeId;
    }

    /**
     * 
     * @param featureTypeId
     *     The feature_type_id
     */
    public void setFeatureTypeId(Long featureTypeId) {
        this.featureTypeId = featureTypeId;
    }

    public Entitlement_ withFeatureTypeId(Long featureTypeId) {
        this.featureTypeId = featureTypeId;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Entitlement_ withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The licenseType
     */
    public Long getLicenseType() {
        return licenseType;
    }

    /**
     * 
     * @param licenseType
     *     The license_type
     */
    public void setLicenseType(Long licenseType) {
        this.licenseType = licenseType;
    }

    public Entitlement_ withLicenseType(Long licenseType) {
        this.licenseType = licenseType;
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

    public Entitlement_ withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The packages
     */
    public List<Package_> getPackages() {
        return packages;
    }

    /**
     * 
     * @param packages
     *     The packages
     */
    public void setPackages(List<Package_> packages) {
        this.packages = packages;
    }

    public Entitlement_ withPackages(List<Package_> packages) {
        this.packages = packages;
        return this;
    }

    /**
     * 
     * @return
     *     The preorderPlaceholderFlag
     */
    public Boolean getPreorderPlaceholderFlag() {
        return preorderPlaceholderFlag;
    }

    /**
     * 
     * @param preorderPlaceholderFlag
     *     The preorder_placeholder_flag
     */
    public void setPreorderPlaceholderFlag(Boolean preorderPlaceholderFlag) {
        this.preorderPlaceholderFlag = preorderPlaceholderFlag;
    }

    public Entitlement_ withPreorderPlaceholderFlag(Boolean preorderPlaceholderFlag) {
        this.preorderPlaceholderFlag = preorderPlaceholderFlag;
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

    public Entitlement_ withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The subType
     */
    public Long getSubType() {
        return subType;
    }

    /**
     * 
     * @param subType
     *     The subType
     */
    public void setSubType(Long subType) {
        this.subType = subType;
    }

    public Entitlement_ withSubType(Long subType) {
        this.subType = subType;
        return this;
    }

    /**
     * 
     * @return
     *     The subtitleLanguageCodes
     */
    public Object getSubtitleLanguageCodes() {
        return subtitleLanguageCodes;
    }

    /**
     * 
     * @param subtitleLanguageCodes
     *     The subtitle_language_codes
     */
    public void setSubtitleLanguageCodes(Object subtitleLanguageCodes) {
        this.subtitleLanguageCodes = subtitleLanguageCodes;
    }

    public Entitlement_ withSubtitleLanguageCodes(Object subtitleLanguageCodes) {
        this.subtitleLanguageCodes = subtitleLanguageCodes;
        return this;
    }

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

    public Entitlement_ withType(Long type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The useCount
     */
    public Long getUseCount() {
        return useCount;
    }

    /**
     * 
     * @param useCount
     *     The use_count
     */
    public void setUseCount(Long useCount) {
        this.useCount = useCount;
    }

    public Entitlement_ withUseCount(Long useCount) {
        this.useCount = useCount;
        return this;
    }

    /**
     * 
     * @return
     *     The voiceLanguageCodes
     */
    public Object getVoiceLanguageCodes() {
        return voiceLanguageCodes;
    }

    /**
     * 
     * @param voiceLanguageCodes
     *     The voice_language_codes
     */
    public void setVoiceLanguageCodes(Object voiceLanguageCodes) {
        this.voiceLanguageCodes = voiceLanguageCodes;
    }

    public Entitlement_ withVoiceLanguageCodes(Object voiceLanguageCodes) {
        this.voiceLanguageCodes = voiceLanguageCodes;
        return this;
    }

}
