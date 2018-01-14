package com.converge.ExtractMiner.miners.clip.forge.pojo.payload;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Class used to crate the payload sent in a POST to the forge API (forge.gg // api.forge.gg)
 * the end payload will be a json string (hence serialized / expose)
 * @author Brackston Mayhall
 */
public class ForgePayload {

	// the query string sent to the forge api
	public static String BODY_PAYLOAD_STRING = "query Index{public{...Fj}} fragment F0 on User{staff,id} fragment F1 on User{avatar,id} fragment F2 on User{id,_followers1CuqP8:followers(first:1){edges{cursor,node{id}},totalCount,pageInfo{hasNextPage,hasPreviousPage}}} fragment F3 on User{id} fragment F4 on User{username,id,...F1} fragment F5 on LikeConnection{edges{node{id,author{id,...F4}},cursor},pageInfo{hasNextPage,hasPreviousPage}} fragment F6 on ViewConnection{edges{node{id,author{id,...F4}},cursor},pageInfo{hasNextPage,hasPreviousPage}} fragment F7 on Comment{id,body} fragment F8 on Comment{body,id,...F7} fragment F9 on Comment{id} fragment Fa on Comment{author{username,isViewer,id,...F1,...F0},body,createdAt,id,...F8,...F9} fragment Fb on CommentConnection{totalCount,edges{node{id,...Fa},cursor},pageInfo{hasNextPage,hasPreviousPage}} fragment Fc on Video{id} fragment Fd on Video{id,viewerDidRepost} fragment Fe on Video{id,mp4,thumbnail} fragment Ff on Video{id,...Fc} fragment Fg on Video{id,...Ff} fragment Fh on Video{id,title,author{id,username},game{id,name},...Fc} fragment Fi on Video{id,title,createdAt,author{id,username,...F0,...F1,...F2,...F3},game{name,slug,id},_likes1Cl041:likes(first:20){totalCount,...F5},_views1NevWj:views(first:20){totalCount,...F6},_comments1EZUM6:comments(last:3){totalCount,...Fb},...Fc,...Fd,...Fe,...Fg,...Fh} fragment Fj on Public{_popularVideosPj4kK: %1s ( %2s last:%3$d){pageInfo{hasPreviousPage,hasNextPage},edges{node{createdAt,id,...Fi},cursor}}}";
    
	/* properties that are serialized into json */
	@SerializedName("query")
    @Expose
    private String query;
    @SerializedName("variables")
    @Expose
    private Variables variables;

    // the size of the query (defualted to 50)
    private transient int takeCount = 50;
    // the cursor for paging
    private transient String nextId = "";
    // our mining direction
    private transient boolean mineHistorical = false;
    
    /**
     * constructs an initial payload to query forge.gg
     */
    public ForgePayload(int takeCount) {
    	this.takeCount = takeCount;
    	this.query = String.format(BODY_PAYLOAD_STRING,"popularVideos"," ", this.getTakeCount());
    }
    
    /**
     * gets the query of the payload
     * @return
     */
    public String getQuery() {
        return query;
    }

    /**
     * sets the query of the payload
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * gets the variables that are sent in with the payload
     * @return the variables
     */
    public Variables getVariables() {
        return variables;
    }

    /**
     * the varaibles to sent in with the payload
     * @param variables varaibles to be sent in with the payload
     */
    public void setVariables(Variables variables) {
        this.variables = variables;
    }

	/**
	 * the amount the query will take
	 * this follows the skip take principle (paging)
	 * @return the take count
	 */
	public int getTakeCount() {
		return takeCount;
	}

	/**
	 * sets the take count on the payload
	 * @param takeCount the take count on the payload
	 */
	public void setTakeCount(int takeCount) {
		this.takeCount = takeCount;
		resetQueryString();
	}

	/**
	 * the next id found in the previous query
	 * this is like a cursor for the skip/take paging
	 * @return
	 */
	public String getNextId() {
		return nextId;
	}

	/**
	 * sets the next id (cursor) for paging
	 * @param nextId the next id (cursor) for paging
	 */
	public void setNextId(String nextId) {
		this.nextId = nextId;
		resetQueryString();
	}

	/**
	 * used to set if we are going to mine backwards
	 * or only get the incoming clips
	 * @param mineHistorical
	 */
	public void setMineHistorical(boolean mineHistorical) {
		this.mineHistorical = mineHistorical;
		resetQueryString();
	}

	/**
	 * used to represent our mining direction
	 * @return the mining direction
	 */
	public boolean isMineHistorical() {
		return mineHistorical;
	}

	/**
	 * internal method used to reset the query string
	 * based on cursor or direction
	 */
	private void resetQueryString() {
		// popularVideos
		String typeOfQuery = "popularVideos";
		String direction = "after";
		if(mineHistorical) {
			direction = "before";
		}
		
		if(!this.getNextId().equals("")){
			String nextIdPayloadString = direction+":\""+this.getNextId()+"\",";
			this.setQuery(String.format(BODY_PAYLOAD_STRING,
					typeOfQuery,nextIdPayloadString, this.getTakeCount()));
		} else {
			this.setQuery(String.format(BODY_PAYLOAD_STRING,
					typeOfQuery,"", this.getTakeCount()));
		}
	}

}
