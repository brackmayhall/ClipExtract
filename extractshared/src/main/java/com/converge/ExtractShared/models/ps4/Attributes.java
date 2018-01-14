
package com.converge.ExtractShared.models.ps4;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("facets")
    @Expose
    private Facets facets;
    @SerializedName("next")
    @Expose
    private List<Object> next = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The facets
     */
    public Facets getFacets() {
        return facets;
    }

    /**
     * 
     * @param facets
     *     The facets
     */
    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public Attributes withFacets(Facets facets) {
        this.facets = facets;
        return this;
    }

    /**
     * 
     * @return
     *     The next
     */
    public List<Object> getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    public void setNext(List<Object> next) {
        this.next = next;
    }

    public Attributes withNext(List<Object> next) {
        this.next = next;
        return this;
    }

}
