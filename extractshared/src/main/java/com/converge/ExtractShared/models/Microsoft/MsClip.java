package com.converge.ExtractShared.models.Microsoft;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MsClip {

    @SerializedName("gameClip")
    @Expose
    private GameClip gameClip;

    public GameClip getGameClip() {
        return gameClip;
    }

    public void setGameClip(GameClip gameClip) {
        this.gameClip = gameClip;
    }

}
