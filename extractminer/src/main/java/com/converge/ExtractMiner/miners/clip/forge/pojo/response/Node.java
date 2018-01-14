package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Node {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("viewerDoesLike")
    @Expose
    private Object viewerDoesLike;
    @SerializedName("viewerDidRepost")
    @Expose
    private Boolean viewerDidRepost;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("game")
    @Expose
    private Game game;
    @SerializedName("_likes1Cl041")
    @Expose
    private Likes1Cl041 Likes1Cl041;
    @SerializedName("_views1NevWj")
    @Expose
    private Views1NevWj Views1NevWj;
    @SerializedName("_comments1EZUM6")
    @Expose
    private Comments1EZUM6 Comments1EZUM6;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

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
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The viewerDoesLike
     */
    public Object getViewerDoesLike() {
        return viewerDoesLike;
    }

    /**
     * 
     * @param viewerDoesLike
     *     The viewerDoesLike
     */
    public void setViewerDoesLike(Object viewerDoesLike) {
        this.viewerDoesLike = viewerDoesLike;
    }

    /**
     * 
     * @return
     *     The viewerDidRepost
     */
    public Boolean getViewerDidRepost() {
        return viewerDidRepost;
    }

    /**
     * 
     * @param viewerDidRepost
     *     The viewerDidRepost
     */
    public void setViewerDidRepost(Boolean viewerDidRepost) {
        this.viewerDidRepost = viewerDidRepost;
    }

    /**
     * 
     * @return
     *     The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The game
     */
    public Game getGame() {
        return game;
    }

    /**
     * 
     * @param game
     *     The game
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * 
     * @return
     *     The Likes1Cl041
     */
    public Likes1Cl041 getLikes1Cl041() {
        return Likes1Cl041;
    }

    /**
     * 
     * @param Likes1Cl041
     *     The _likes1Cl041
     */
    public void setLikes1Cl041(Likes1Cl041 Likes1Cl041) {
        this.Likes1Cl041 = Likes1Cl041;
    }

    /**
     * 
     * @return
     *     The Views1NevWj
     */
    public Views1NevWj getViews1NevWj() {
        return Views1NevWj;
    }

    /**
     * 
     * @param Views1NevWj
     *     The _views1NevWj
     */
    public void setViews1NevWj(Views1NevWj Views1NevWj) {
        this.Views1NevWj = Views1NevWj;
    }

    /**
     * 
     * @return
     *     The Comments1EZUM6
     */
    public Comments1EZUM6 getComments1EZUM6() {
        return Comments1EZUM6;
    }

    /**
     * 
     * @param Comments1EZUM6
     *     The _comments1EZUM6
     */
    public void setComments1EZUM6(Comments1EZUM6 Comments1EZUM6) {
        this.Comments1EZUM6 = Comments1EZUM6;
    }

    /**
     * 
     * @return
     *     The mp4
     */
    public String getMp4() {
        return mp4;
    }

    /**
     * 
     * @param mp4
     *     The mp4
     */
    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    /**
     * 
     * @return
     *     The thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
