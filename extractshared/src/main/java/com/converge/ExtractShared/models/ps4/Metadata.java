
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Metadata {

    @SerializedName("cn_vrRequired")
    @Expose
    private CnVrRequired cnVrRequired;
    @SerializedName("tertiary_classification")
    @Expose
    private TertiaryClassification tertiaryClassification;
    @SerializedName("playable_platform")
    @Expose
    private PlayablePlatform playablePlatform;
    @SerializedName("cn_remotePlay")
    @Expose
    private CnRemotePlay cnRemotePlay;
    @SerializedName("cn_dualshockVibration")
    @Expose
    private CnDualshockVibration cnDualshockVibration;
    @SerializedName("cn_crossPlatformPSVita")
    @Expose
    private CnCrossPlatformPSVita cnCrossPlatformPSVita;
    @SerializedName("cn_vrEnabled")
    @Expose
    private CnVrEnabled cnVrEnabled;
    @SerializedName("secondary_classification")
    @Expose
    private SecondaryClassification secondaryClassification;
    @SerializedName("cloud_only_platform")
    @Expose
    private CloudOnlyPlatform cloudOnlyPlatform;
    @SerializedName("primary_classification")
    @Expose
    private PrimaryClassification primaryClassification;

    /**
     * 
     * @return
     *     The cnVrRequired
     */
    public CnVrRequired getCnVrRequired() {
        return cnVrRequired;
    }

    /**
     * 
     * @param cnVrRequired
     *     The cn_vrRequired
     */
    public void setCnVrRequired(CnVrRequired cnVrRequired) {
        this.cnVrRequired = cnVrRequired;
    }

    public Metadata withCnVrRequired(CnVrRequired cnVrRequired) {
        this.cnVrRequired = cnVrRequired;
        return this;
    }

    /**
     * 
     * @return
     *     The tertiaryClassification
     */
    public TertiaryClassification getTertiaryClassification() {
        return tertiaryClassification;
    }

    /**
     * 
     * @param tertiaryClassification
     *     The tertiary_classification
     */
    public void setTertiaryClassification(TertiaryClassification tertiaryClassification) {
        this.tertiaryClassification = tertiaryClassification;
    }

    public Metadata withTertiaryClassification(TertiaryClassification tertiaryClassification) {
        this.tertiaryClassification = tertiaryClassification;
        return this;
    }

    /**
     * 
     * @return
     *     The playablePlatform
     */
    public PlayablePlatform getPlayablePlatform() {
        return playablePlatform;
    }

    /**
     * 
     * @param playablePlatform
     *     The playable_platform
     */
    public void setPlayablePlatform(PlayablePlatform playablePlatform) {
        this.playablePlatform = playablePlatform;
    }

    public Metadata withPlayablePlatform(PlayablePlatform playablePlatform) {
        this.playablePlatform = playablePlatform;
        return this;
    }

    /**
     * 
     * @return
     *     The cnRemotePlay
     */
    public CnRemotePlay getCnRemotePlay() {
        return cnRemotePlay;
    }

    /**
     * 
     * @param cnRemotePlay
     *     The cn_remotePlay
     */
    public void setCnRemotePlay(CnRemotePlay cnRemotePlay) {
        this.cnRemotePlay = cnRemotePlay;
    }

    public Metadata withCnRemotePlay(CnRemotePlay cnRemotePlay) {
        this.cnRemotePlay = cnRemotePlay;
        return this;
    }

    /**
     * 
     * @return
     *     The cnDualshockVibration
     */
    public CnDualshockVibration getCnDualshockVibration() {
        return cnDualshockVibration;
    }

    /**
     * 
     * @param cnDualshockVibration
     *     The cn_dualshockVibration
     */
    public void setCnDualshockVibration(CnDualshockVibration cnDualshockVibration) {
        this.cnDualshockVibration = cnDualshockVibration;
    }

    public Metadata withCnDualshockVibration(CnDualshockVibration cnDualshockVibration) {
        this.cnDualshockVibration = cnDualshockVibration;
        return this;
    }

    /**
     * 
     * @return
     *     The cnCrossPlatformPSVita
     */
    public CnCrossPlatformPSVita getCnCrossPlatformPSVita() {
        return cnCrossPlatformPSVita;
    }

    /**
     * 
     * @param cnCrossPlatformPSVita
     *     The cn_crossPlatformPSVita
     */
    public void setCnCrossPlatformPSVita(CnCrossPlatformPSVita cnCrossPlatformPSVita) {
        this.cnCrossPlatformPSVita = cnCrossPlatformPSVita;
    }

    public Metadata withCnCrossPlatformPSVita(CnCrossPlatformPSVita cnCrossPlatformPSVita) {
        this.cnCrossPlatformPSVita = cnCrossPlatformPSVita;
        return this;
    }

    /**
     * 
     * @return
     *     The cnVrEnabled
     */
    public CnVrEnabled getCnVrEnabled() {
        return cnVrEnabled;
    }

    /**
     * 
     * @param cnVrEnabled
     *     The cn_vrEnabled
     */
    public void setCnVrEnabled(CnVrEnabled cnVrEnabled) {
        this.cnVrEnabled = cnVrEnabled;
    }

    public Metadata withCnVrEnabled(CnVrEnabled cnVrEnabled) {
        this.cnVrEnabled = cnVrEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The secondaryClassification
     */
    public SecondaryClassification getSecondaryClassification() {
        return secondaryClassification;
    }

    /**
     * 
     * @param secondaryClassification
     *     The secondary_classification
     */
    public void setSecondaryClassification(SecondaryClassification secondaryClassification) {
        this.secondaryClassification = secondaryClassification;
    }

    public Metadata withSecondaryClassification(SecondaryClassification secondaryClassification) {
        this.secondaryClassification = secondaryClassification;
        return this;
    }

    /**
     * 
     * @return
     *     The cloudOnlyPlatform
     */
    public CloudOnlyPlatform getCloudOnlyPlatform() {
        return cloudOnlyPlatform;
    }

    /**
     * 
     * @param cloudOnlyPlatform
     *     The cloud_only_platform
     */
    public void setCloudOnlyPlatform(CloudOnlyPlatform cloudOnlyPlatform) {
        this.cloudOnlyPlatform = cloudOnlyPlatform;
    }

    public Metadata withCloudOnlyPlatform(CloudOnlyPlatform cloudOnlyPlatform) {
        this.cloudOnlyPlatform = cloudOnlyPlatform;
        return this;
    }

    /**
     * 
     * @return
     *     The primaryClassification
     */
    public PrimaryClassification getPrimaryClassification() {
        return primaryClassification;
    }

    /**
     * 
     * @param primaryClassification
     *     The primary_classification
     */
    public void setPrimaryClassification(PrimaryClassification primaryClassification) {
        this.primaryClassification = primaryClassification;
    }

    public Metadata withPrimaryClassification(PrimaryClassification primaryClassification) {
        this.primaryClassification = primaryClassification;
        return this;
    }

}
