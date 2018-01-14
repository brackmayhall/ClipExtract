package com.converge.ExtractShared.models.MicrosoftXboxTrending;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthorInfo {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("secondName")
    @Expose
    private String secondName;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("color")
    @Expose
    private Color color;
    @SerializedName("showAsAvatar")
    @Expose
    private String showAsAvatar;
    @SerializedName("authorType")
    @Expose
    private String authorType;
    @SerializedName("id")
    @Expose
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getShowAsAvatar() {
        return showAsAvatar;
    }

    public void setShowAsAvatar(String showAsAvatar) {
        this.showAsAvatar = showAsAvatar;
    }

    public String getAuthorType() {
        return authorType;
    }

    public void setAuthorType(String authorType) {
        this.authorType = authorType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
