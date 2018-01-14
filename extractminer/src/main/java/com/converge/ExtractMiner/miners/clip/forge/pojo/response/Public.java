package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Public {

    @SerializedName("_popularVideosPj4kK")
    @Expose
    private PopularVideosPj4kK PopularVideosPj4kK;

    /**
     * 
     * @return
     *     The PopularVideosPj4kK
     */
    public PopularVideosPj4kK getPopularVideosPj4kK() {
        return PopularVideosPj4kK;
    }

    /**
     * 
     * @param PopularVideosPj4kK
     *     The _popularVideosPj4kK
     */
    public void setPopularVideosPj4kK(PopularVideosPj4kK PopularVideosPj4kK) {
        this.PopularVideosPj4kK = PopularVideosPj4kK;
    }

}
