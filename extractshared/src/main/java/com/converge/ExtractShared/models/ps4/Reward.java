
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Reward {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("entitlement_id")
    @Expose
    private String entitlementId;
    @SerializedName("service_provider_id")
    @Expose
    private String serviceProviderId;
    @SerializedName("discount")
    @Expose
    private Long discount;
    @SerializedName("price")
    @Expose
    private Long price;
    @SerializedName("reward_type")
    @Expose
    private Long rewardType;
    @SerializedName("display_price")
    @Expose
    private String displayPrice;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("isPlus")
    @Expose
    private Boolean isPlus;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("reward_source_type_id")
    @Expose
    private Long rewardSourceTypeId;
    @SerializedName("start_date")
    @Expose
    private String startDate;

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

    public Reward withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The entitlementId
     */
    public String getEntitlementId() {
        return entitlementId;
    }

    /**
     * 
     * @param entitlementId
     *     The entitlement_id
     */
    public void setEntitlementId(String entitlementId) {
        this.entitlementId = entitlementId;
    }

    public Reward withEntitlementId(String entitlementId) {
        this.entitlementId = entitlementId;
        return this;
    }

    /**
     * 
     * @return
     *     The serviceProviderId
     */
    public String getServiceProviderId() {
        return serviceProviderId;
    }

    /**
     * 
     * @param serviceProviderId
     *     The service_provider_id
     */
    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public Reward withServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
        return this;
    }

    /**
     * 
     * @return
     *     The discount
     */
    public Long getDiscount() {
        return discount;
    }

    /**
     * 
     * @param discount
     *     The discount
     */
    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Reward withDiscount(Long discount) {
        this.discount = discount;
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

    public Reward withPrice(Long price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The rewardType
     */
    public Long getRewardType() {
        return rewardType;
    }

    /**
     * 
     * @param rewardType
     *     The reward_type
     */
    public void setRewardType(Long rewardType) {
        this.rewardType = rewardType;
    }

    public Reward withRewardType(Long rewardType) {
        this.rewardType = rewardType;
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

    public Reward withDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
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

    public Reward withName(String name) {
        this.name = name;
        return this;
    }

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

    public Reward withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The isPlus
     */
    public Boolean getIsPlus() {
        return isPlus;
    }

    /**
     * 
     * @param isPlus
     *     The isPlus
     */
    public void setIsPlus(Boolean isPlus) {
        this.isPlus = isPlus;
    }

    public Reward withIsPlus(Boolean isPlus) {
        this.isPlus = isPlus;
        return this;
    }

    /**
     * 
     * @return
     *     The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The end_date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Reward withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 
     * @return
     *     The rewardSourceTypeId
     */
    public Long getRewardSourceTypeId() {
        return rewardSourceTypeId;
    }

    /**
     * 
     * @param rewardSourceTypeId
     *     The reward_source_type_id
     */
    public void setRewardSourceTypeId(Long rewardSourceTypeId) {
        this.rewardSourceTypeId = rewardSourceTypeId;
    }

    public Reward withRewardSourceTypeId(Long rewardSourceTypeId) {
        this.rewardSourceTypeId = rewardSourceTypeId;
        return this;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The start_date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Reward withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
