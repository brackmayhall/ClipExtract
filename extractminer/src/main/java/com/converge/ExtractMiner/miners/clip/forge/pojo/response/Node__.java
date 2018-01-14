package com.converge.ExtractMiner.miners.clip.forge.pojo.response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Node__ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("author")
    @Expose
    private Author_ author;

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

    /**
     * 
     * @return
     *     The author
     */
    public Author_ getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(Author_ author) {
        this.author = author;
    }

}
