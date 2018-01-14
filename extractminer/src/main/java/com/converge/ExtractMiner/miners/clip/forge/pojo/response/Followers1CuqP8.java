package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Followers1CuqP8 {

    @SerializedName("edges")
    @Expose
    private List<Edge_> edges = new ArrayList<Edge_>();
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("pageInfo")
    @Expose
    private PageInfo_ pageInfo;

    /**
     * 
     * @return
     *     The edges
     */
    public List<Edge_> getEdges() {
        return edges;
    }

    /**
     * 
     * @param edges
     *     The edges
     */
    public void setEdges(List<Edge_> edges) {
        this.edges = edges;
    }

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
     *     The pageInfo
     */
    public PageInfo_ getPageInfo() {
        return pageInfo;
    }

    /**
     * 
     * @param pageInfo
     *     The pageInfo
     */
    public void setPageInfo(PageInfo_ pageInfo) {
        this.pageInfo = pageInfo;
    }

}
