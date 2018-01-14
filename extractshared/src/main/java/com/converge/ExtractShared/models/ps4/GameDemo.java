
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GameDemo {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("key")
    @Expose
    private String key;

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

    public GameDemo withName(String name) {
        this.name = name;
        return this;
    }

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

    public GameDemo withCount(Long count) {
        this.count = count;
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

    public GameDemo withKey(String key) {
        this.key = key;
        return this;
    }

}
