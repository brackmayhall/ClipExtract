
package com.converge.ExtractShared.models.MicrosoftXboxTrending;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Color {

    @SerializedName("primaryColor")
    @Expose
    private String primaryColor;
    @SerializedName("secondaryColor")
    @Expose
    private String secondaryColor;
    @SerializedName("tertiaryColor")
    @Expose
    private String tertiaryColor;

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getTertiaryColor() {
        return tertiaryColor;
    }

    public void setTertiaryColor(String tertiaryColor) {
        this.tertiaryColor = tertiaryColor;
    }
}
