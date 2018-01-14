
package com.converge.ExtractShared.models.ps4;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Widget {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("tag")
    @Expose
    private Object tag;
    @SerializedName("width")
    @Expose
    private Object width;
    @SerializedName("height")
    @Expose
    private Object height;
    @SerializedName("offsetX")
    @Expose
    private Object offsetX;
    @SerializedName("offsetY")
    @Expose
    private Object offsetY;
    @SerializedName("order")
    @Expose
    private String order;
    @SerializedName("locationWidgetId")
    @Expose
    private Long locationWidgetId;
    @SerializedName("nsx_space")
    @Expose
    private String nsxSpace;

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

    public Widget withName(String name) {
        this.name = name;
        return this;
    }

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

    public Widget withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The tag
     */
    public Object getTag() {
        return tag;
    }

    /**
     * 
     * @param tag
     *     The tag
     */
    public void setTag(Object tag) {
        this.tag = tag;
    }

    public Widget withTag(Object tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Object getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Object width) {
        this.width = width;
    }

    public Widget withWidth(Object width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Object getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Object height) {
        this.height = height;
    }

    public Widget withHeight(Object height) {
        this.height = height;
        return this;
    }

    /**
     * 
     * @return
     *     The offsetX
     */
    public Object getOffsetX() {
        return offsetX;
    }

    /**
     * 
     * @param offsetX
     *     The offsetX
     */
    public void setOffsetX(Object offsetX) {
        this.offsetX = offsetX;
    }

    public Widget withOffsetX(Object offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    /**
     * 
     * @return
     *     The offsetY
     */
    public Object getOffsetY() {
        return offsetY;
    }

    /**
     * 
     * @param offsetY
     *     The offsetY
     */
    public void setOffsetY(Object offsetY) {
        this.offsetY = offsetY;
    }

    public Widget withOffsetY(Object offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    /**
     * 
     * @return
     *     The order
     */
    public String getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    public Widget withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 
     * @return
     *     The locationWidgetId
     */
    public Long getLocationWidgetId() {
        return locationWidgetId;
    }

    /**
     * 
     * @param locationWidgetId
     *     The locationWidgetId
     */
    public void setLocationWidgetId(Long locationWidgetId) {
        this.locationWidgetId = locationWidgetId;
    }

    public Widget withLocationWidgetId(Long locationWidgetId) {
        this.locationWidgetId = locationWidgetId;
        return this;
    }

    /**
     * 
     * @return
     *     The nsxSpace
     */
    public String getNsxSpace() {
        return nsxSpace;
    }

    /**
     * 
     * @param nsxSpace
     *     The nsx_space
     */
    public void setNsxSpace(String nsxSpace) {
        this.nsxSpace = nsxSpace;
    }

    public Widget withNsxSpace(String nsxSpace) {
        this.nsxSpace = nsxSpace;
        return this;
    }

}
