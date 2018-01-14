package com.converge.ExtractShared.db;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.bson.types.ObjectId;

import com.converge.ExtractShared.config.PropertiesCache;
import com.converge.ExtractShared.constants.ConnectionConstants;
import com.converge.ExtractShared.models.Clip;
import com.converge.ExtractShared.models.Ps4GameClip;
import com.converge.ExtractShared.models.Title;
import com.converge.ExtractShared.models.mongoresponse.ClipResponse;
import com.converge.ExtractShared.models.ps4.Link;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Singleton instance that manager connections to the mongo
 * database instance
 * @author Brackston Mayhall
 */
public class MongoManager {
	final static Logger logger = Logger.getLogger(MongoManager.class);
	private static MongoManager instance;
	private MongoClient mongoClient;
	private DB db;
	
	
	/**
	 * constructor for the singleton instance
	 */
	private MongoManager() {
			this.mongoClient = new MongoClient( ConnectionConstants.MONGO_HOST , ConnectionConstants.MONGO_PORT );
			//TODO: stop using this deprecated method ya dummy
			this.db = mongoClient.getDB(ConnectionConstants.MONGO_GAMECLIP_DB_NAME);
	}
	
	/**
	 * Gets the mongo singleton instance
	 * if it does not exist it is created
	 * @return the instance
	 */
	public static synchronized MongoManager getInstance() {
		if(instance == null) {
			instance = new MongoManager();
		}
		return instance;
	}
	
	/**
	 * inserts a playstation clip if it does not already exist
	 * if it does then it is ignored
	 * @param sonyClip
	 */
	public void insertPlaystationClip(Ps4GameClip playstationClip) {
		try {
			if(connectionGood()) {
				DBCollection clipCollection = db.getCollection(ConnectionConstants.MONGO_CLIP_COLLECTION_NAME);
				
				if(clipCollection != null) {
					BasicDBObject whereQuery = new BasicDBObject();
					whereQuery.put(Clip.DB_VIDEO_VARIANTS+".0", playstationClip.getAltVideoFormatByKey("0"));
					
					DBCursor cursor = clipCollection.find(whereQuery);
					// did not find
					if(!cursor.hasNext()) {
						clipCollection.insert(playstationClip.toBasicDBObject());
					} else {
						logger.debug("Duplicate playstation clip found.");
					}	
				} else {
					logger.error("Could not get mongoclip collection");
				}
			} else {
				// TODO: this is stupid, do something better
				throw new Exception();
			}
		} catch (Exception e){
			logger.error("Exception in insertPlaystationClip.", e);
		}
	}
	
	/**
	 * upserts a microsoft clip
	 * it will update the expiration date and dynamic link of the clip
	 * TODO: the update part is not implemented
	 * @param msClip
	 */
	public void upsertSingleMSClip(Clip msClip) {
		try {
			if(connectionGood()) {
				DBCollection clipCollection = db.getCollection(ConnectionConstants.MONGO_CLIP_COLLECTION_NAME);
				
				BasicDBObject whereQuery = new BasicDBObject();
				whereQuery.put(Clip.DB_EXTERNAL_ID, msClip.getExternalId());
				
				DBCursor cursor = clipCollection.find(whereQuery);
				// did not find
				if(!cursor.hasNext()) {
					clipCollection.insert(msClip.toBasicDBObject());
				} else {
					// TODO: this should be an upsert of the expiration date
					// TODO: and the new dynamic link
					//clipCollection.update(whereQuery, msClip.toBasicDBObject());
					System.out.println("duplicate ms clip. fix the upsert");
				}
			} else {
				// TODO: this is stupid, do something better
				throw new Exception();
			}
		} catch (Exception e){
			logger.error("exception in upsertSingleClipBySonyId.", e);
		}
	}

	
	/**
	 * Method that is used to update an expired microsoft link
	 * when the web service encounters one
	 * @param externalId the external id
	 * @param link the link to the video clip
	 * @param expirationDate the expiration date of the clip
	 */
	public void updateMsClipLink(String externalId, String link, long expirationDate) {
		try {
			if(connectionGood()) {
				DBCollection clipCollection = db.getCollection(ConnectionConstants.MONGO_CLIP_COLLECTION_NAME);
				
				BasicDBObject whereQuery = new BasicDBObject();
				whereQuery.put(Clip.DB_EXTERNAL_ID, externalId);
				
				DBCursor cursor = clipCollection.find(whereQuery);
				// did not find
				if(cursor.hasNext()) {

					// here we update the expired links
					BasicDBObject newDocument = new BasicDBObject();
					newDocument.append("$set", new BasicDBObject().append("video_link", link).append("expire_date", expirationDate));
					
					WriteResult res = clipCollection.update(whereQuery, newDocument);
					System.out.println(res.getUpsertedId());
				} 
				
			} else {
				// TODO: do something better here
				throw new Exception();
			}
		} catch (Exception e){
			logger.error("exception in upsertSingleClipBySonyId.", e);
		} 
	}
	
	
	/**
	 * Inserts a new pc clip once it has been found
	 * @param pcClip the pcClip
	 */
	public void insertPcClip(Clip pcClip) {
		try {
			if(connectionGood()) {
				DBCollection clipCollection = db.getCollection(ConnectionConstants.MONGO_CLIP_COLLECTION_NAME);
				
				BasicDBObject whereQuery = new BasicDBObject();
				whereQuery.put(Clip.DB_EXTERNAL_ID, pcClip.getExternalId());
				
				DBCursor cursor = clipCollection.find(whereQuery);
				// did not find
				if(!cursor.hasNext()) {
					clipCollection.insert(pcClip.toBasicDBObject());
				}
			} else {
				// TODO: do something better here
				throw new Exception();
			}
		} catch (Exception e){
			logger.error("exception in upsertSingleClipBySonyId.", e);
		}
	}


	/**
	 * Inserts a game title
	 * @param title the game title
	 */
	public void insertSingleTitle(Title title) {
		try {
			if(connectionGood()) {
				DBCollection clipCollection = db.getCollection(ConnectionConstants.TITLES_COLLECTION);
				BasicDBObject whereQuery = new BasicDBObject();
				whereQuery.put("external", title.getExternalId());
				DBCursor cursor = clipCollection.find(whereQuery);
				// did not find
				if(!cursor.hasNext()) {
					clipCollection.insert(title.toBasicDBObject());
				}							
			} else {
				throw new Exception();
			}
		} catch (Exception e){
			logger.error("exception in upsertSingleTitle.", e);
		} finally {
			//mongoClient.close();
		}
	}
	
	public String findPlaystationTitleByTid(String tid) {
		Gson gson = new Gson();
		Link link = null;
		DBCollection clipCollection = db.getCollection(ConnectionConstants.TITLES_COLLECTION);

		DBObject whereQuery = new BasicDBObject();
		whereQuery.put("tid", tid.trim());
		DBCursor cursor = clipCollection.find(whereQuery);
		if(cursor.hasNext()) {
			String json = cursor.next().toString();
			link = gson.fromJson(json, Link.class);
			//break;
		} else {
			return "";
		}
		// need to retrieve the title here
		String title = null;
		if(link != null) {
			title = link.getTitleName();
		} else {
			if(logger.isDebugEnabled()) {
				logger.debug("link is null, check findPlaystationTitleByTid function.");	
			}
		}
		
		if(title != null) {
			return title;
		} else {
			return "";
		}
	}
	
	public List<ClipResponse> getFeedClips(String type, String count, String id) {
		List<ClipResponse> clipList = new ArrayList<ClipResponse>();
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
	
		int queryCount = PropertiesCache.getInstance().getInt("feedQueryCount",50);
		if(count != null) {
			try {
				queryCount = Integer.parseInt(count);	
			} catch (NumberFormatException nfe) {
				logger.debug("could not parse count", nfe);
			}	
		}
		
		DBCollection clipCollection = db.getCollection(ConnectionConstants.MONGO_CLIP_COLLECTION_NAME);
		
		BasicDBObject q = new BasicDBObject();
		if(id != null && !id.equals("")) {
			ObjectId oid = new ObjectId(id);
			q.put("_id", new BasicDBObject("$lt", oid));	
		}
		if(type.equals("pc") || type.equals("ps")){
			q.put("type", type);			
		}

		DBCursor cursor = clipCollection.find(q)
				.sort(new BasicDBObject("_id",-1))
				.limit(queryCount);
		
		while(cursor.hasNext()) {
			try {
				String clipJsonString = cursor.next().toString();
				ClipResponse clip = mapper.readValue(clipJsonString, ClipResponse.class);
				clipList.add(clip);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(cursor.next());
		}
		
		return clipList;
	}
	
	public ClipResponse getSingleClipById(String id) {
		ClipResponse clip = new ClipResponse();
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally

		DBCollection clipCollection = db.getCollection(ConnectionConstants.MONGO_CLIP_COLLECTION_NAME);
				
		try {
		    BasicDBObject query = new BasicDBObject();
		    query.put("_id", new ObjectId(id));
		    DBObject dbObj = clipCollection.findOne(query);
		    String clipJsonString = dbObj.toString();
		    clip = mapper.readValue(clipJsonString, ClipResponse.class);
		} catch (JsonParseException e) {
			logger.error(e);
		} catch (JsonMappingException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}
		
		return clip;
	}
	
	/**
	 * Checks to make sure the mongo connection is good
	 * @return true if the conection is good, false otherwise
	 */
	private boolean connectionGood() {
		if(instance != null && this.mongoClient != null && db != null) {
			return true;
		} else {
			return false;
		}
	}
	
}
