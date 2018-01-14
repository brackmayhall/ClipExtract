
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SceneLayout {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("catalogEntryId")
    @Expose
    private String catalogEntryId;
    @SerializedName("storeFrontId")
    @Expose
    private Long storeFrontId;
    @SerializedName("templateId")
    @Expose
    private Long templateId;
    @SerializedName("subScenes")
    @Expose
    private Object subScenes;
    @SerializedName("storeTypeId")
    @Expose
    private Long storeTypeId;

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public SceneLayout withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The catalogEntryId
     */
    public String getCatalogEntryId() {
        return catalogEntryId;
    }

    /**
     * 
     * @param catalogEntryId
     *     The catalogEntryId
     */
    public void setCatalogEntryId(String catalogEntryId) {
        this.catalogEntryId = catalogEntryId;
    }

    public SceneLayout withCatalogEntryId(String catalogEntryId) {
        this.catalogEntryId = catalogEntryId;
        return this;
    }

    /**
     * 
     * @return
     *     The storeFrontId
     */
    public Long getStoreFrontId() {
        return storeFrontId;
    }

    /**
     * 
     * @param storeFrontId
     *     The storeFrontId
     */
    public void setStoreFrontId(Long storeFrontId) {
        this.storeFrontId = storeFrontId;
    }

    public SceneLayout withStoreFrontId(Long storeFrontId) {
        this.storeFrontId = storeFrontId;
        return this;
    }

    /**
     * 
     * @return
     *     The templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * 
     * @param templateId
     *     The templateId
     */
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public SceneLayout withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 
     * @return
     *     The subScenes
     */
    public Object getSubScenes() {
        return subScenes;
    }

    /**
     * 
     * @param subScenes
     *     The subScenes
     */
    public void setSubScenes(Object subScenes) {
        this.subScenes = subScenes;
    }

    public SceneLayout withSubScenes(Object subScenes) {
        this.subScenes = subScenes;
        return this;
    }

    /**
     * 
     * @return
     *     The storeTypeId
     */
    public Long getStoreTypeId() {
        return storeTypeId;
    }

    /**
     * 
     * @param storeTypeId
     *     The storeTypeId
     */
    public void setStoreTypeId(Long storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public SceneLayout withStoreTypeId(Long storeTypeId) {
        this.storeTypeId = storeTypeId;
        return this;
    }

}
