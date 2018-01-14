
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PrimaryClassification {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("values")
    @Expose
    private List<String> values = new ArrayList<String>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public PrimaryClassification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The values
     */
    public List<String> getValues() {
        return values;
    }

    /**
     * 
     * @param values
     *     The values
     */
    public void setValues(List<String> values) {
        this.values = values;
    }

    public PrimaryClassification withValues(List<String> values) {
        this.values = values;
        return this;
    }

}
