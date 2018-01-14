package com.converge.ExtractShared.constants;

/**
 * Class to hold constants
 * These will ultimately be moved to a config file
 * @author Brackston Mayhall
 */
public final class ConnectionConstants {	
	public static final String MONGO_HOST = "192.168.33.10";
	public static final int MONGO_PORT = 27017;
	
	public static final String MONGO_GAMECLIP_DB_NAME = "clips";
	
	/* collections */
	public static final String MONGO_CLIP_COLLECTION_NAME = "clips";
	public static final String MIRROR_COLLECTION = "clip_mirror";
	public static final String TITLES_COLLECTION = "titles";
	public static final String XBOX_CLIPS_GAMES = "xbox_clips_games";
	public static final String XBOX_CLIPS_COM_CLIPS = "xbox_clips_com_clips";
}