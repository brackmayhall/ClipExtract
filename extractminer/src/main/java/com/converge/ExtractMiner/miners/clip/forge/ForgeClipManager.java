package com.converge.ExtractMiner.miners.clip.forge;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.converge.ExtractMiner.miners.clip.forge.pojo.payload.ForgePayload;
import com.converge.ExtractMiner.miners.clip.forge.pojo.response.Edge;
import com.converge.ExtractMiner.miners.clip.forge.pojo.response.ForgeResponse;
import com.converge.ExtractMiner.miners.clip.forge.pojo.response.Game;
import com.converge.ExtractMiner.miners.clip.forge.pojo.response.Node;
import com.converge.ExtractShared.config.PropertiesCache;
import com.converge.ExtractShared.db.MongoManager;
import com.converge.ExtractShared.models.PcGameClip;
import com.google.gson.Gson;

/**
 * Manager gathering clips from forge.gg api.
 * @author Brackston Mayhall
 */
public class ForgeClipManager {
	
	static final Logger LOGGER = Logger.getLogger(ForgeClipManager.class);
	private Gson gson = new Gson();
	private ForgePayload forgePayload;
	private Edge latestFoundEdgeCursor = null;
    private List<Edge> lastClipBatch = null;	
	private MongoManager mongoManager;

	
	/**
	 * Manages mining clips from forge.gg.
	 */
	public ForgeClipManager() {
		// singleton mongodb instance
		mongoManager = MongoManager.getInstance();
		
		// this is a sleep time default in the case it is not found in the properties file
		int forgeTakeCount = 50;
		try{
			String forgeTakeCountString = PropertiesCache.getInstance().getProperty("forgeTakeCount");
			forgeTakeCount = Integer.parseInt(forgeTakeCountString);			
		} catch(Exception e){
			LOGGER.error("Error getting forgeSleepTime from miner.properties file.", e);
		}
		
		this.forgePayload = new ForgePayload(forgeTakeCount);
	}

	/**
	 * queries forge.gg api to gather news clips
	 * and insert them into the database.
	 * will use a cursor/paging mechanism
	 * to get new clips
	 */
	public final void getNewClips() {
		// if the lastest edge cursor exists
		// we alter the payload query to contain
		// the correct paging bounds
		if (latestFoundEdgeCursor != null) {
			forgePayload.setNextId(latestFoundEdgeCursor.getCursor());
		}
		
		// the query response before deserialization
		String responseString = this.excutePost("http://api.forge.gg/",
				gson.toJson(forgePayload));
		
		if (StringUtils.isNotBlank(responseString)) {
		
			// the query response
			ForgeResponse forgeResponse = gson.fromJson(responseString,
					ForgeResponse.class);
			
			if (forgeResponse != null) {
				List<Edge> tempClips = null;
				// try to get the edges (these contain the clips)
				try {
					tempClips = forgeResponse.getData().getPublic()
							.getPopularVideosPj4kK().getEdges();	
				} catch (Exception e) {
					LOGGER.error("Could not get forge edges", e);
				}
				
				if (tempClips != null && tempClips.size() > 0) {

					for (Edge edge : tempClips) {
						if (edge != null) {
							// need to see if DO NOT have next or previous
							// then set it to latestFoundEdge
							if (lastClipBatch != null) {
								boolean alreadyContainsEdge =  
										lastBatchAlreadyContains(lastClipBatch,
												edge.getCursor());
								
								if (alreadyContainsEdge) {
									continue;
								} // if not we are going to save
							}
							
							// create our pcgame clip that we will save
							PcGameClip pcgc = new PcGameClip();
							
							Node node = edge.getNode();
							Game game = null;
							if (node != null) {
								game = node.getGame();
							} else {
								LOGGER.error("forge game was null");
								continue;
							}
							
							String createdAt = node.getCreatedAt();
							//TODO: we need to convert this to millis since epcoh
							pcgc.setCreatedDate(createdAt);
							pcgc.setExternalGameId(game.getId());
							pcgc.setExternalId(node.getId());
							pcgc.setGameNamePretty(game.getName());
							pcgc.setGameNameSlug(game.getSlug());
							pcgc.setThumbLink(node.getThumbnail());
							pcgc.setVideoLink(node.getMp4());
							pcgc.setDidTrend(true);
							pcgc.addTag(game.getName());
							pcgc.setTagline(node.getTitle());
							
							if (LOGGER.isDebugEnabled()) {
								LOGGER.debug("saving forge clip popular: "
							    + pcgc.getGameNamePretty() + " : " 
								+ pcgc.getVideoLink());
							}
							
							// if clip meets criteria we will insert
							if (pcgc.clipGood()) {
								mongoManager.insertPcClip(pcgc);	
							}
							
						} else {
							LOGGER.error("forge edge is null");
						}
					}
					// if we found clips we then set the cursor
					// depending on the direction we would like
					// to mine (future / historical)
					int tempClipSize = tempClips.size();
					if (tempClipSize > 0) {
						lastClipBatch = tempClips;
						// this gets the top
						if (forgePayload.isMineHistorical()) {
							latestFoundEdgeCursor = tempClips.get(0);
						} else {
							latestFoundEdgeCursor = tempClips.get(tempClipSize - 1);
						}						
					} else {
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("nothing new on forge popular");
						}		
					}
				} else {
					LOGGER.debug("no new forge clips found");
				}
				
			}						
		} else {
			LOGGER.error("forge response string was empty");
		}	
	}
	
	/**
	 * checks if the last batch of edges from the forge graph api already contain.
	 * the items that we just retrieved.
	 * @param batch teh batch to check
	 * @param cursor the cursor
	 * @return true or false if the last batch we queried contains cursor
	 */
	private boolean lastBatchAlreadyContains(final List<Edge> batch,
			final String cursor) {
		
		// check if we already have this cursor
		if (batch != null && batch.size() > 0 && StringUtils.isNotBlank(cursor)) {
		    for (Edge edge : batch) {
		    	String edgeCursor = edge.getCursor();
		    	if (StringUtils.isNotBlank(edgeCursor)) {
			        if (cursor.trim().equals(edgeCursor.trim())) {
			            return true;
			        }	
		    	}
		    }
		    return false;	
		} else {
			return false;
		}		
	}
	
	/**
	 * Sends a post to the forge API.
	 * @param targetURL the forge api endpoint
	 * @param urlParameters he json payload
	 * @return returns the query reponse
	 */
	private String excutePost(final String targetURL, String urlParameters) {
		  //urlParameters = "query Index{public{...Fj}} fragment F0 on User{staff,id} fragment F1 on User{avatar,id} fragment F2 on User{id,_followers1CuqP8:followers(first:1){edges{cursor,node{id}},totalCount,pageInfo{hasNextPage,hasPreviousPage}}} fragment F3 on User{id} fragment F4 on User{username,id,...F1} fragment F5 on LikeConnection{edges{node{id,author{id,...F4}},cursor},pageInfo{hasNextPage,hasPreviousPage}} fragment F6 on ViewConnection{edges{node{id,author{id,...F4}},cursor},pageInfo{hasNextPage,hasPreviousPage}} fragment F7 on Comment{id,body} fragment F8 on Comment{body,id,...F7} fragment F9 on Comment{id} fragment Fa on Comment{author{username,isViewer,id,...F1,...F0},body,createdAt,id,...F8,...F9} fragment Fb on CommentConnection{totalCount,edges{node{id,...Fa},cursor},pageInfo{hasNextPage,hasPreviousPage}} fragment Fc on Video{id} fragment Fd on Video{id,viewerDidRepost} fragment Fe on Video{id,mp4,thumbnail} fragment Ff on Video{id,...Fc} fragment Fg on Video{id,...Ff} fragment Fh on Video{id,title,author{id,username},game{id,name},...Fc} fragment Fi on Video{id,title,createdAt,author{id,username,...F0,...F1,...F2,...F3},game{name,slug,id},_likes1Cl041:likes(first:20){totalCount,...F5},_views1NevWj:views(first:20){totalCount,...F6},_comments1EZUM6:comments(last:3){totalCount,...Fb},...Fc,...Fd,...Fe,...Fg,...Fh} fragment Fj on Public{_popularVideosPj4kK: popularVideos (    last:50){pageInfo{hasPreviousPage,hasNextPage},edges{node{createdAt,id,...Fi},cursor}}}";
		  HttpURLConnection connection = null;  
		  try {
			  
		    //Create connection
		    URL url = new URL(targetURL);
		    connection = (HttpURLConnection) url.openConnection();
		    connection.setRequestMethod("POST");
		    connection.setRequestProperty("Content-Type", "application/json");
		    connection.setRequestProperty("Content-Length",
		    		Integer.toString(urlParameters.getBytes().length));
		    connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36");
		    connection.setRequestProperty("Accept", "*/*");
		    connection.setUseCaches(false);
		    connection.setDoOutput(true);

		    //Send request and close resources
		    DataOutputStream wr = new DataOutputStream(
		        connection.getOutputStream());
		    wr.writeBytes(urlParameters);
		    wr.close();

		    //Get Response  and close resources
		    InputStream is = connection.getInputStream();
		    BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		    StringBuilder response = new StringBuilder();
		    String line;
		    while ((line = rd.readLine()) != null) {
		      response.append(line);
		      response.append('\r');
		    }
		    rd.close();
		    return response.toString();
		  } catch (Exception e) {
			  LOGGER.error("exception in excutePost.", e);
		    return null;
		  } finally {
		    if (connection != null) {
		      connection.disconnect(); 
		    }
		  }
		}
}
