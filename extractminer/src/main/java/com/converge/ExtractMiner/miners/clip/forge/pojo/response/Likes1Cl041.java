package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Likes1Cl041 {

    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("edges")
    @Expose
    private List<Edge__> edges = new ArrayList<Edge__>();
    @SerializedName("pageInfo")
    @Expose
    private PageInfo__ pageInfo;

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
    public List<Edge__> getEdges() {
        return edges;
    }

    /**
     * 
     * @param edges
     *     The edges
     */
    public void setEdges(List<Edge__> edges) {
        this.edges = edges;
    }

    /**
     * 
     * @return
     *     The pageInfo
     */
    public PageInfo__ getPageInfo() {
        return pageInfo;
    }

    /**
     * 
     * @param pageInfo
     *     The pageInfo
     */
    public void setPageInfo(PageInfo__ pageInfo) {
        this.pageInfo = pageInfo;
    }

}
