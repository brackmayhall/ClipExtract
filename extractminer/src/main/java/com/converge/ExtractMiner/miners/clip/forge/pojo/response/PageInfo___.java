package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PageInfo___ {

    @SerializedName("hasNextPage")
    @Expose
    private Boolean hasNextPage;
    @SerializedName("hasPreviousPage")
    @Expose
    private Boolean hasPreviousPage;

    /**
     * 
     * @return
     *     The hasNextPage
     */
    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    /**
     * 
     * @param hasNextPage
     *     The hasNextPage
     */
    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    /**
     * 
     * @return
     *     The hasPreviousPage
     */
    public Boolean getHasPreviousPage() {
        return hasPreviousPage;
    }

    /**
     * 
     * @param hasPreviousPage
     *     The hasPreviousPage
     */
    public void setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

}
