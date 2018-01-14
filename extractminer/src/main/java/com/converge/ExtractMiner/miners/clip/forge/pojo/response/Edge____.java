package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge____ {

    @SerializedName("node")
    @Expose
    private Node____ node;
    @SerializedName("cursor")
    @Expose
    private String cursor;

    /**
     * 
     * @return
     *     The node
     */
    public Node____ getNode() {
        return node;
    }

    /**
     * 
     * @param node
     *     The node
     */
    public void setNode(Node____ node) {
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
