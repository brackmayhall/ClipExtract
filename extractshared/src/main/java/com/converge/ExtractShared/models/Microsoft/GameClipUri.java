
package com.converge.ExtractShared.models.Microsoft;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameClipUri {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("fileSize")
    @Expose
    private Integer fileSize;
    @SerializedName("uriType")
    @Expose
    private String uriType;
    @SerializedName("expiration")
    @Expose
    private String expiration;

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

    public String getUriType() {
        return uriType;
    }

    public void setUriType(String uriType) {
        this.uriType = uriType;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

}
