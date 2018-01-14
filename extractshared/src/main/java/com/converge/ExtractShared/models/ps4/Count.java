
package com.converge.ExtractShared.models.ps4;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Count {

    @SerializedName("star")
    @Expose
    private Long star;
    @SerializedName("count")
    @Expose
    private Long count;

    /**
     * 
     * @return
     *     The star
     */
    public Long getStar() {
        return star;
    }

    /**
     * 
     * @param star
     *     The star
     */
    public void setStar(Long star) {
        this.star = star;
    }

    public Count withStar(Long star) {
        this.star = star;
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

    public Count withCount(Long count) {
        this.count = count;
        return this;
    }

}
