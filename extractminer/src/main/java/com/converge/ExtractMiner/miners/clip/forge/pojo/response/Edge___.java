package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge___ {

    @SerializedName("node")
    @Expose
    private Node___ node;
    @SerializedName("cursor")
    @Expose
    private String cursor;

    /**
     * 
     * @return
     *     The node
     */
    public Node___ getNode() {
        return node;
    }

    /**
     * 
     * @param node
     *     The node
     */
    public void setNode(Node___ node) {
        this.node = node;
    }

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

}
