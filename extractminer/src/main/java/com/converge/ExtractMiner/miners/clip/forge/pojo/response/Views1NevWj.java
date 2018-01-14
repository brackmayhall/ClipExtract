package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Views1NevWj {

    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("edges")
    @Expose
    private List<Edge___> edges = new ArrayList<Edge___>();
    @SerializedName("pageInfo")
    @Expose
    private PageInfo___ pageInfo;

    /**
     * 
     * @return
     *     The totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 
     * @param totalCount
     *     The totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 
     * @return
     *     The edges
     */
    public List<Edge___> getEdges() {
        return edges;
    }

    /**
     * 
     * @param edges
     *     The edges
     */
    public void setEdges(List<Edge___> edges) {
        this.edges = edges;
    }

    /**
     * 
     * @return
     *     The pageInfo
     */
    public PageInfo___ getPageInfo() {
        return pageInfo;
    }

    /**
     * 
     * @param pageInfo
     *     The pageInfo
     */
    public void setPageInfo(PageInfo___ pageInfo) {
        this.pageInfo = pageInfo;
    }

}
