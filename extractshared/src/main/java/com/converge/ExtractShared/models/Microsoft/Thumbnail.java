package com.converge.ExtractShared.models.Microsoft;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("fileSize")
    @Expose
    private Integer fileSize;
    @SerializedName("thumbnailType")
    @Expose
    private String thumbnailType;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getThumbnailType() {
        return thumbnailType;
    }

    public void setThumbnailType(String thumbnailType) {
        this.thumbnailType = thumbnailType;
    }
}
