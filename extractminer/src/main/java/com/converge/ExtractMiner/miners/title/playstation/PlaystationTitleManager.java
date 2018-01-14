package com.converge.ExtractMiner.miners.title.playstation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;

import com.converge.ExtractShared.db.MongoManager;
import com.converge.ExtractShared.models.Title;
import com.converge.ExtractShared.models.ps4.Link;
import com.converge.ExtractShared.models.ps4.Ps4Title;
import com.google.gson.Gson;

/**
 * This class mines the playstation network for playstation titles.
 * @author Brackston Mayhall
 */
public class PlaystationTitleManager {
	final static Logger LOGGER = Logger.getLogger(PlaystationTitleManager.class);
	private Gson gson = new Gson();
	
	private final String USER_AGENT = "Mozilla/5.0";
	private static final int WINDOW_SIZE = 100;

	/**
	 * Gets playstations titles through a standard HTTP GET request
	 * uses a window so the request doesnt block as bad
	 * @throws Exception throws a generic exception (TODO: handle this better)
	 */
	public void getTitles() throws Exception {
		MongoManager mongoManager = MongoManager.getInstance();
		Integer gamePointer = WINDOW_SIZE;
		boolean haveMore = true;
		while(haveMore) {
			
			String url = "https://store.playstation.com/chihiro-api/viewfinder/US/en/999/STORE-MSF77008-ALLGAMES?platform=ps4&size="+WINDOW_SIZE+"&gkb=1&geoCountry=US&facets=release_date%3Acoming_soon%2Crelease_date%3Alast_7_days%2Crelease_date%3Alast_30_days%2Cgame_content_type%3Agames%2Cgame_content_type%3Abundles%2Cgame_content_type%3Aaddons%2Cgame_content_type%3Asubscriptions%2Cgame_content_type%3Aonline_passes%2Cgame_content_type%3Ademos%2Cgame_content_type%3Abetas%2Cgame_content_type%3Atimed_trials%2Cgame_content_type%3Aapps%2Cgame_content_type%3Athemes%2Cgame_content_type%3Aavatars%2Cgame_content_type%3Aother_extras%2Cgame_type%3Aps4_full_games%2Cgame_type%3Aps3_full_games%2Cgame_type%3Apsn_games%2Cgame_type%3Abundles%2Cgame_type%3Adisc_only%2Cgame_type%3Apsone_classics%2Cgame_type%3Aps2_classics%2Cgame_type%3Aps_vita_games%2Cgame_type%3Apsp_games%2Cgame_type%3Aminis%2Cgame_type%3Apc_engine_archives%2Cgame_type%3Aumd_passport_compatible%2Cplatform%3Aps4%2Cplatform%3Aps3%2Cplatform%3Apsp%2Cplatform%3Avita%2Cgame_demo%2Cprice%3A0-0%2Cprice%3A*-199%2Cprice%3A200-499%2Cprice%3A500-999%2Cprice%3A1000-1999%2Cprice%3A2000-*%2Caccessories%3A3d%2Caccessories%3Adrum_kit%2Caccessories%3Aguitar%2Caccessories%3Amicrophone%2Caccessories%3Aplaystation_eye%2Caccessories%3Aplaystation_move%2Caccessories%3Aracing_wheel%2Cplay_type%3Aonline%2Cplay_type%3Asingle_player%2Cplay_type%3Avoice_chat_support%2Cplay_type%3Amultiplayer&start="+gamePointer;
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();

			if(LOGGER.isDebugEnabled()) {
				LOGGER.debug("\nSending 'GET' request to URL : " + url);
				LOGGER.debug("Response Code : " + responseCode);
			}
			
			// get input stream and then close resources
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// convert the respone to playstations title objects
			Ps4Title titles = gson.fromJson(response.toString(), Ps4Title.class);
					
			List<Link> links = titles.getLinks();
			if (links.size() <= 0) {
				haveMore = false; // this will allow us to break out of the loop
			} else { // do insertion
				for (Link link : links) {
					Title title = new Title();
					title.setExternalId(link.getId());
					title.setGameNamePretty(link.getName());
					title.setGameNameSlug(link.getShortName());
					title.setTid(link.getTid());
					title.setPlatform("ps");
					//upsert the title that was found
					mongoManager.insertSingleTitle(title);
				}
				gamePointer = gamePointer + WINDOW_SIZE; 
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(titles.getId());
				}					
			}		
		}
	}
	
	/**
	 * Method that can be used to query for a single playstation title
	 * this is useful while mining and encounter a new id that is not in the database
	 * @param countries the country code used to query
	 * @param tid the title id
	 * @return returns the title name
	 */
	public String getSingleTitle(String[] countries, String tid) {
		MongoManager mongoManager = MongoManager.getInstance();
		String url = "https://store.playstation.com/store/api/chihiro/00_09_000/titlecontainer/"+countries[1]+"/"+countries[0]+"/999/"+tid;
		String retTitle = "";
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("\nSending 'GET' request to URL : " + url);
				LOGGER.debug("Response Code : " + responseCode);
			}
			
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			Ps4Title titles = gson.fromJson(response.toString(), Ps4Title.class);
			
			List<Link> links = titles.getLinks();
			
			for (Link link : links) {
				Title title = new Title();
				title.setExternalId(link.getId());
				retTitle = link.getShortName();
				title.setGameNamePretty(link.getShortName());
				title.setGameNameSlug(link.getShortName());
				title.setTid(link.getTid());
				title.setPlatform("ps");
				mongoManager.insertSingleTitle(title);
			}
		} catch (MalformedURLException e) {
			LOGGER.error("MalformedURLException when getting single title",e);
		} catch (IOException e) {
			LOGGER.error("IOException when getting single title",e);
		}
		return retTitle;
	}	
}
