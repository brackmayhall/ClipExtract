package com.converge.ExtractMiner.miners.clip.forge.pojo.response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Node_ {

    @SerializedName("id")
    @Expose
    private String id;

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

}
