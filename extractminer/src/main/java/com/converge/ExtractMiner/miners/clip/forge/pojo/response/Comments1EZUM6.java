package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comments1EZUM6 {

    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("edges")
    @Expose
    private List<Edge____> edges = new ArrayList<Edge____>();
    @SerializedName("pageInfo")
    @Expose
    private PageInfo____ pageInfo;

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
    public List<Edge____> getEdges() {
        return edges;
    }

    /**
     * 
     * @param edges
     *     The edges
     */
    public void setEdges(List<Edge____> edges) {
        this.edges = edges;
    }

    /**
     * 
     * @return
     *     The pageInfo
     */
    public PageInfo____ getPageInfo() {
        return pageInfo;
    }

    /**
     * 
     * @param pageInfo
     *     The pageInfo
     */
    public void setPageInfo(PageInfo____ pageInfo) {
        this.pageInfo = pageInfo;
    }

}
