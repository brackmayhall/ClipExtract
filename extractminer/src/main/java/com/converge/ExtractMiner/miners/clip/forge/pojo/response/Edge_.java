package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge_ {

    @SerializedName("cursor")
    @Expose
    private String cursor;
    @SerializedName("node")
    @Expose
    private Node_ node;

    /**
     * 
     * @return
     *     The cursor
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * 
     * @param cursor
     *     The cursor
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    /**
     * 
     * @return
     *     The node
     */
    public Node_ getNode() {
        return node;
    }

    /**
     * 
     * @param node
     *     The node
     */
    public void setNode(Node_ node) {
        this.node = node;
    }

}
