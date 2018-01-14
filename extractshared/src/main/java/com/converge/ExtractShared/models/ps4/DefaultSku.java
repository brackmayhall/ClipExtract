
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DefaultSku {

    @SerializedName("amortizeFlag")
    @Expose
    private Boolean amortizeFlag;
    @SerializedName("bundleExclusiveFlag")
    @Expose
    private Boolean bundleExclusiveFlag;
    @SerializedName("chargeImmediatelyFlag")
    @Expose
    private Boolean chargeImmediatelyFlag;
    @SerializedName("charge_type_id")
    @Expose
    private Long chargeTypeId;
    @SerializedName("credit_card_required_flag")
    @Expose
    private Long creditCardRequiredFlag;
    @SerializedName("defaultSku")
    @Expose
    private Boolean defaultSku;
    @SerializedName("display_price")
    @Expose
    private String displayPrice;
    @SerializedName("eligibilities")
    @Expose
    private List<Object> eligibilities = new ArrayList<Object>();
    @SerializedName("entitlements")
    @Expose
    private List<Entitlement> entitlements = new ArrayList<Entitlement>();
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_original")
    @Expose
    private Boolean isOriginal;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("platforms")
    @Expose
    private List<Long> platforms = new ArrayList<Long>();
    @SerializedName("price")
    @Expose
    private Long price;
    @SerializedName("rewards")
    @Expose
    private List<Object> rewards = new ArrayList<Object>();
    @SerializedName("seasonPassExclusiveFlag")
    @Expose
    private Boolean seasonPassExclusiveFlag;
    @SerializedName("skuAvailabilityOverrideFlag")
    @Expose
    private Boolean skuAvailabilityOverrideFlag;
    @SerializedName("sku_type")
    @Expose
    private Long skuType;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * 
     * @return
     *     The amortizeFlag
     */
    public Boolean getAmortizeFlag() {
        return amortizeFlag;
    }

    /**
     * 
     * @param amortizeFlag
     *     The amortizeFlag
     */
    public void setAmortizeFlag(Boolean amortizeFlag) {
        this.amortizeFlag = amortizeFlag;
    }

    public DefaultSku withAmortizeFlag(Boolean amortizeFlag) {
        this.amortizeFlag = amortizeFlag;
        return this;
    }

    /**
     * 
     * @return
     *     The bundleExclusiveFlag
     */
    public Boolean getBundleExclusiveFlag() {
        return bundleExclusiveFlag;
    }

    /**
     * 
     * @param bundleExclusiveFlag
     *     The bundleExclusiveFlag
     */
    public void setBundleExclusiveFlag(Boolean bundleExclusiveFlag) {
        this.bundleExclusiveFlag = bundleExclusiveFlag;
    }

    public DefaultSku withBundleExclusiveFlag(Boolean bundleExclusiveFlag) {
        this.bundleExclusiveFlag = bundleExclusiveFlag;
        return this;
    }

    /**
     * 
     * @return
     *     The chargeImmediatelyFlag
     */
    public Boolean getChargeImmediatelyFlag() {
        return chargeImmediatelyFlag;
    }

    /**
     * 
     * @param chargeImmediatelyFlag
     *     The chargeImmediatelyFlag
     */
    public void setChargeImmediatelyFlag(Boolean chargeImmediatelyFlag) {
        this.chargeImmediatelyFlag = chargeImmediatelyFlag;
    }

    public DefaultSku withChargeImmediatelyFlag(Boolean chargeImmediatelyFlag) {
        this.chargeImmediatelyFlag = chargeImmediatelyFlag;
        return this;
    }

    /**
     * 
     * @return
     *     The chargeTypeId
     */
    public Long getChargeTypeId() {
        return chargeTypeId;
    }

    /**
     * 
     * @param chargeTypeId
     *     The charge_type_id
     */
    public void setChargeTypeId(Long chargeTypeId) {
        this.chargeTypeId = chargeTypeId;
    }

    public DefaultSku withChargeTypeId(Long chargeTypeId) {
        this.chargeTypeId = chargeTypeId;
        return this;
    }

    /**
     * 
     * @return
     *     The creditCardRequiredFlag
     */
    public Long getCreditCardRequiredFlag() {
        return creditCardRequiredFlag;
    }

    /**
     * 
     * @param creditCardRequiredFlag
     *     The credit_card_required_flag
     */
    public void setCreditCardRequiredFlag(Long creditCardRequiredFlag) {
        this.creditCardRequiredFlag = creditCardRequiredFlag;
    }

    public DefaultSku withCreditCardRequiredFlag(Long creditCardRequiredFlag) {
        this.creditCardRequiredFlag = creditCardRequiredFlag;
        return this;
    }

    /**
     * 
     * @return
     *     The defaultSku
     */
    public Boolean getDefaultSku() {
        return defaultSku;
    }

    /**
     * 
     * @param defaultSku
     *     The defaultSku
     */
    public void setDefaultSku(Boolean defaultSku) {
        this.defaultSku = defaultSku;
    }

    public DefaultSku withDefaultSku(Boolean defaultSku) {
        this.defaultSku = defaultSku;
        return this;
    }

    /**
     * 
     * @return
     *     The displayPrice
     */
    public String getDisplayPrice() {
        return displayPrice;
    }

    /**
     * 
     * @param displayPrice
     *     The display_price
     */
    public void setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
    }

    public DefaultSku withDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
        return this;
    }

    /**
     * 
     * @return
     *     The eligibilities
     */
    public List<Object> getEligibilities() {
        return eligibilities;
    }

    /**
     * 
     * @param eligibilities
     *     The eligibilities
     */
    public void setEligibilities(List<Object> eligibilities) {
        this.eligibilities = eligibilities;
    }

    public DefaultSku withEligibilities(List<Object> eligibilities) {
        this.eligibilities = eligibilities;
        return this;
    }

    /**
     * 
     * @return
     *     The entitlements
     */
    public List<Entitlement> getEntitlements() {
        return entitlements;
    }

    /**
     * 
     * @param entitlements
     *     The entitlements
     */
    public void setEntitlements(List<Entitlement> entitlements) {
        this.entitlements = entitlements;
    }

    public DefaultSku withEntitlements(List<Entitlement> entitlements) {
        this.entitlements = entitlements;
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

    public DefaultSku withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The isOriginal
     */
    public Boolean getIsOriginal() {
        return isOriginal;
    }

    /**
     * 
     * @param isOriginal
     *     The is_original
     */
    public void setIsOriginal(Boolean isOriginal) {
        this.isOriginal = isOriginal;
    }

    public DefaultSku withIsOriginal(Boolean isOriginal) {
        this.isOriginal = isOriginal;
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

    public DefaultSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The platforms
     */
    public List<Long> getPlatforms() {
        return platforms;
    }

    /**
     * 
     * @param platforms
     *     The platforms
     */
    public void setPlatforms(List<Long> platforms) {
        this.platforms = platforms;
    }

    public DefaultSku withPlatforms(List<Long> platforms) {
        this.platforms = platforms;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    public DefaultSku withPrice(Long price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The rewards
     */
    public List<Object> getRewards() {
        return rewards;
    }

    /**
     * 
     * @param rewards
     *     The rewards
     */
    public void setRewards(List<Object> rewards) {
        this.rewards = rewards;
    }

    public DefaultSku withRewards(List<Object> rewards) {
        this.rewards = rewards;
        return this;
    }

    /**
     * 
     * @return
     *     The seasonPassExclusiveFlag
     */
    public Boolean getSeasonPassExclusiveFlag() {
        return seasonPassExclusiveFlag;
    }

    /**
     * 
     * @param seasonPassExclusiveFlag
     *     The seasonPassExclusiveFlag
     */
    public void setSeasonPassExclusiveFlag(Boolean seasonPassExclusiveFlag) {
        this.seasonPassExclusiveFlag = seasonPassExclusiveFlag;
    }

    public DefaultSku withSeasonPassExclusiveFlag(Boolean seasonPassExclusiveFlag) {
        this.seasonPassExclusiveFlag = seasonPassExclusiveFlag;
        return this;
    }

    /**
     * 
     * @return
     *     The skuAvailabilityOverrideFlag
     */
    public Boolean getSkuAvailabilityOverrideFlag() {
        return skuAvailabilityOverrideFlag;
    }

    /**
     * 
     * @param skuAvailabilityOverrideFlag
     *     The skuAvailabilityOverrideFlag
     */
    public void setSkuAvailabilityOverrideFlag(Boolean skuAvailabilityOverrideFlag) {
        this.skuAvailabilityOverrideFlag = skuAvailabilityOverrideFlag;
    }

    public DefaultSku withSkuAvailabilityOverrideFlag(Boolean skuAvailabilityOverrideFlag) {
        this.skuAvailabilityOverrideFlag = skuAvailabilityOverrideFlag;
        return this;
    }

    /**
     * 
     * @return
     *     The skuType
     */
    public Long getSkuType() {
        return skuType;
    }

    /**
     * 
     * @param skuType
     *     The sku_type
     */
    public void setSkuType(Long skuType) {
        this.skuType = skuType;
    }

    public DefaultSku withSkuType(Long skuType) {
        this.skuType = skuType;
        return this;
    }

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

    public DefaultSku withType(String type) {
        this.type = type;
        return this;
    }

}
