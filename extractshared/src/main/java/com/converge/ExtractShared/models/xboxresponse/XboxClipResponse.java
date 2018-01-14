
package com.converge.ExtractShared.models.xboxresponse;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class XboxClipResponse {

    @SerializedName("ContinuationToken")
    @Expose
    private String ContinuationToken;
    @SerializedName("GameClips")
    @Expose
    private List<GameClip> GameClips = new ArrayList<GameClip>();

    /**
     * 
     * @return
     *     The ContinuationToken
     */
    public String getContinuationToken() {
        return ContinuationToken;
    }

    /**
     * 
     * @param ContinuationToken
     *     The ContinuationToken
     */
    public void setContinuationToken(String ContinuationToken) {
        this.ContinuationToken = ContinuationToken;
    }

    /**
     * 
     * @return
     *     The GameClips
     */
    public List<GameClip> getGameClips() {
        return GameClips;
    }

    /**
     * 
     * @param GameClips
     *     The GameClips
     */
    public void setGameClips(List<GameClip> GameClips) {
        this.GameClips = GameClips;
    }

}
