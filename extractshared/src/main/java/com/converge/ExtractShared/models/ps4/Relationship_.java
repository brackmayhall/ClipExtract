
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Relationship_ {

    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("key_name")
    @Expose
    private String keyName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The count
     */
    public Long getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    public Relationship_ withCount(Long count) {
        this.count = count;
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

    public Relationship_ withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The keyName
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * 
     * @param keyName
     *     The key_name
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Relationship_ withKeyName(String keyName) {
        this.keyName = keyName;
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

    public Relationship_ withName(String name) {
        this.name = name;
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

    public Relationship_ withUrl(String url) {
        this.url = url;
        return this;
    }

}
