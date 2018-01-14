package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author___ {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("isViewer")
    @Expose
    private Boolean isViewer;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("staff")
    @Expose
    private Boolean staff;

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
     *     The staff
     */
    public Boolean getStaff() {
        return staff;
    }

    /**
     * 
     * @param staff
     *     The staff
     */
    public void setStaff(Boolean staff) {
        this.staff = staff;
    }

}
