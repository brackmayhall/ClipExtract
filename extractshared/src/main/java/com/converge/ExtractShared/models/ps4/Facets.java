
package com.converge.ExtractShared.models.ps4;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Facets {

    @SerializedName("platform")
    @Expose
    private List<Platform> platform = new ArrayList<Platform>();
    @SerializedName("game_type")
    @Expose
    private List<GameType> gameType = new ArrayList<GameType>();
    @SerializedName("price")
    @Expose
    private List<Price> price = new ArrayList<Price>();
    @SerializedName("game_demo")
    @Expose
    private List<GameDemo> gameDemo = new ArrayList<GameDemo>();
    @SerializedName("release_date")
    @Expose
    private List<ReleaseDate> releaseDate = new ArrayList<ReleaseDate>();
    @SerializedName("game_content_type")
    @Expose
    private List<GameContentType> gameContentType = new ArrayList<GameContentType>();

    /**
     * 
     * @return
     *     The platform
     */
    public List<Platform> getPlatform() {
        return platform;
    }

    /**
     * 
     * @param platform
     *     The platform
     */
    public void setPlatform(List<Platform> platform) {
        this.platform = platform;
    }

    public Facets withPlatform(List<Platform> platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 
     * @return
     *     The gameType
     */
    public List<GameType> getGameType() {
        return gameType;
    }

    /**
     * 
     * @param gameType
     *     The game_type
     */
    public void setGameType(List<GameType> gameType) {
        this.gameType = gameType;
    }

    public Facets withGameType(List<GameType> gameType) {
        this.gameType = gameType;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    public List<Price> getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(List<Price> price) {
        this.price = price;
    }

    public Facets withPrice(List<Price> price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The gameDemo
     */
    public List<GameDemo> getGameDemo() {
        return gameDemo;
    }

    /**
     * 
     * @param gameDemo
     *     The game_demo
     */
    public void setGameDemo(List<GameDemo> gameDemo) {
        this.gameDemo = gameDemo;
    }

    public Facets withGameDemo(List<GameDemo> gameDemo) {
        this.gameDemo = gameDemo;
        return this;
    }

    /**
     * 
     * @return
     *     The releaseDate
     */
    public List<ReleaseDate> getReleaseDate() {
        return releaseDate;
    }

    /**
     * 
     * @param releaseDate
     *     The release_date
     */
    public void setReleaseDate(List<ReleaseDate> releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Facets withReleaseDate(List<ReleaseDate> releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * 
     * @return
     *     The gameContentType
     */
    public List<GameContentType> getGameContentType() {
        return gameContentType;
    }

    /**
     * 
     * @param gameContentType
     *     The game_content_type
     */
    public void setGameContentType(List<GameContentType> gameContentType) {
        this.gameContentType = gameContentType;
    }

    public Facets withGameContentType(List<GameContentType> gameContentType) {
        this.gameContentType = gameContentType;
        return this;
    }

}
