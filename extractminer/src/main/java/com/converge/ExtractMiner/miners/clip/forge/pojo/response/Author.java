package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("isViewer")
    @Expose
    private Boolean isViewer;
    @SerializedName("viewerDoesFollow")
    @Expose
    private Boolean viewerDoesFollow;
    @SerializedName("staff")
    @Expose
    private Object staff;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("_followers1CuqP8")
    @Expose
    private Followers1CuqP8 Followers1CuqP8;

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
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The isViewer
     */
    public Boolean getIsViewer() {
        return isViewer;
    }

    /**
     * 
     * @param isViewer
     *     The isViewer
     */
    public void setIsViewer(Boolean isViewer) {
        this.isViewer = isViewer;
    }

    /**
     * 
     * @return
     *     The viewerDoesFollow
     */
    public Boolean getViewerDoesFollow() {
        return viewerDoesFollow;
    }

    /**
     * 
     * @param viewerDoesFollow
     *     The viewerDoesFollow
     */
    public void setViewerDoesFollow(Boolean viewerDoesFollow) {
        this.viewerDoesFollow = viewerDoesFollow;
    }

    /**
     * 
     * @return
     *     The staff
     */
    public Object getStaff() {
        return staff;
    }

    /**
     * 
     * @param staff
     *     The staff
     */
    public void setStaff(Object staff) {
        this.staff = staff;
    }

    /**
     * 
     * @return
     *     The avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 
     * @param avatar
     *     The avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 
     * @return
     *     The Followers1CuqP8
     */
    public Followers1CuqP8 getFollowers1CuqP8() {
        return Followers1CuqP8;
    }

    /**
     * 
     * @param Followers1CuqP8
     *     The _followers1CuqP8
     */
    public void setFollowers1CuqP8(Followers1CuqP8 Followers1CuqP8) {
        this.Followers1CuqP8 = Followers1CuqP8;
    }

}
