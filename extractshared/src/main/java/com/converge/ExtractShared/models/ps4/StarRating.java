
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class StarRating {

    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("score")
    @Expose
    private String score;
    @SerializedName("count")
    @Expose
    private List<Count> count = new ArrayList<Count>();

    /**
     * 
     * @return
     *     The total
     */
    public String getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    public StarRating withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     * 
     * @return
     *     The score
     */
    public String getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(String score) {
        this.score = score;
    }

    public StarRating withScore(String score) {
        this.score = score;
        return this;
    }

    /**
     * 
     * @return
     *     The count
     */
    public List<Count> getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(List<Count> count) {
        this.count = count;
    }

    public StarRating withCount(List<Count> count) {
        this.count = count;
        return this;
    }

}
