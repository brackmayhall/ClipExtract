
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Location {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("offsetX")
    @Expose
    private String offsetX;
    @SerializedName("offsetY")
    @Expose
    private String offsetY;
    @SerializedName("widgets")
    @Expose
    private List<Widget> widgets = new ArrayList<Widget>();

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public Location withId(Long id) {
        this.id = id;
        return this;
    }

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

    public Location withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The width
     */
    public String getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    public Location withWidth(String width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return
     *     The height
     */
    public String getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    public Location withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 
     * @return
     *     The offsetX
     */
    public String getOffsetX() {
        return offsetX;
    }

    /**
     * 
     * @param offsetX
     *     The offsetX
     */
    public void setOffsetX(String offsetX) {
        this.offsetX = offsetX;
    }

    public Location withOffsetX(String offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    /**
     * 
     * @return
     *     The offsetY
     */
    public String getOffsetY() {
        return offsetY;
    }

    /**
     * 
     * @param offsetY
     *     The offsetY
     */
    public void setOffsetY(String offsetY) {
        this.offsetY = offsetY;
    }

    public Location withOffsetY(String offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    /**
     * 
     * @return
     *     The widgets
     */
    public List<Widget> getWidgets() {
        return widgets;
    }

    /**
     * 
     * @param widgets
     *     The widgets
     */
    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }

    public Location withWidgets(List<Widget> widgets) {
        this.widgets = widgets;
        return this;
    }

}
