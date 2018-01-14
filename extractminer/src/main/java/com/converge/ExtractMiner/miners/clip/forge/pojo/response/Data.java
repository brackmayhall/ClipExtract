package com.converge.ExtractMiner.miners.clip.forge.pojo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("public")
    @Expose
    private Public _public;

    /**
     * 
     * @return
     *     The _public
     */
    public Public getPublic() {
        return _public;
    }

    /**
     * 
     * @param _public
     *     The public
     */
    public void setPublic(Public _public) {
        this._public = _public;
    }

}
