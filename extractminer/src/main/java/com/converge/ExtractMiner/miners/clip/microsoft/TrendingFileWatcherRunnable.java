package com.converge.ExtractMiner.miners.clip.microsoft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.text.ParseException;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.converge.ExtractMiner.miners.clip.IClipStats;
import com.converge.ExtractShared.MsTools.Resolver.XboxClient;
import com.converge.ExtractShared.MsTools.cacher.XboxClipCacher;
import com.converge.ExtractShared.config.PropertiesCache;
import com.converge.ExtractShared.db.MongoManager;
import com.converge.ExtractShared.models.MicrosoftXboxTrending.Item;
import com.converge.ExtractShared.models.MicrosoftXboxTrending.MicrosoftTrendingList;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * Class that watches monitors the trending file(Global-Posts--0-0.xml)
 * that the xbox windows 10 application updates
 * This particular module need to only be run on windows
 * this also implements the IClipStats interface that is used
 * to get the latest stats so the rolling stat ranking
 * algorithm can run as new clips are found
 * @author Brackston Mayhall
 */
public class TrendingFileWatcherRunnable implements Runnable, IClipStats {

	private final static Logger logger = Logger.getLogger(TrendingFileWatcherRunnable.class);
	
	// this updates updates expired microsoft video links
	// all microsoft clips have an expiration date
	private XboxClipCacher xboxClipCacher = new XboxClipCacher();
	
	private String directory = "";
	private String file = "";
	MongoManager mongoManager;
	private XboxClient xboxClient;
	
	
	/**
	 * Constructor for the class that watches a directory/file for changes
	 * @param directory the directory that contains the file that may change
	 * @param file the file that may change (the one we are watching)
	 */
	public TrendingFileWatcherRunnable(String directory, String file) {
		
		if(StringUtils.isBlank(directory)) {
			throw new IllegalArgumentException("TrendingFileWatcherRunnable requires valid directory param.");
		}
		
		if(StringUtils.isBlank(file)) {
			throw new IllegalArgumentException("TrendingFileWatcherRunnable requires valid file param.");
		}
		
		// the file and directory that are being watched
		this.directory = directory;
		this.file = file;
		
		// singleton mongodb manager instance
		mongoManager = MongoManager.getInstance();
		
		// This logs into the microsoft service without a browser
		// a microsoft silver test account
		// so in the case it is banned it is not a big loss
		// I could create a lot of these accounts and have some
		//type of "ban" monitor and then when one is banned i coudl start using another	
		try {
			// TODO: i have to figure out a way to make the login service refresh its
			// login creds on expiration
			xboxClient = new XboxClient("mayhall1024@gmail.com", "testing12345");
			xboxClient.login();			
		} catch (Exception e) {
			logger.error("Error connecting the the microsoft xbox service");
		}

	}	
	
	@Override
	public void run() {
		Gson gson = new Gson();
        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();
            Path dir = Paths.get(directory);
            dir.register(watcher,
            		StandardWatchEventKinds.ENTRY_CREATE,
            		StandardWatchEventKinds.ENTRY_DELETE,
            		StandardWatchEventKinds.ENTRY_MODIFY);
             
			if(logger.isDebugEnabled()) {
				logger.debug("Watch Service registered for dir: " + dir.getFileName());
			}
			
            // on startup going to try and upsert everything that is in the file
			// it doesnt hurt to be up to date
            onStartUpsertAll();
            
            // now we just watch the file system
            while (true) {
                WatchKey key;
                try {
                    key = watcher.take();
                } catch (InterruptedException ex) {
                    return;
                }               
                
                // loop through the events
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                     
                    @SuppressWarnings("unchecked")
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fileName = ev.context();                    
                     
                    // if we find an event on the directory that is associated with the
                    // file then we know it has changed and we try to upsert it
                    if (kind == StandardWatchEventKinds.ENTRY_MODIFY && fileName.toString().equals(file)) {
                    	String json = readTrendingFile();
                    	if(StringUtils.isNotBlank(json)){
                    		// convert the json from the file over to an object so we can handle it
                        	MicrosoftTrendingList msTrendingList = gson.fromJson(json, MicrosoftTrendingList.class);
                        	if(msTrendingList != null) {
                        		// now we run through the list of trending items
                        		// and we try to insert them into the database
                            	IterateTrendingList(gson,msTrendingList);		
                        	}
                    	} else {
                    		logger.error("Trending xbox file was blank.");
                    	}
                    }
                }
                 
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }           
        } catch (IOException ex) {
        	logger.error("IOException while trying to watch trending xbox file.", ex);
        } catch (JsonSyntaxException e) {
        	logger.error("Json exception while trying to parse trending xbox file.", e);
		} catch (ParseException e) {
			logger.error("Json exception while trying to parse trending xbox file.", e);
		}
	}
	
	/**
	 * When we start up this module we want to
	 * try and grab all of the current items
	 * before starting our "watch" ha ha jon snow ref
	 */
	private void onStartUpsertAll(){
		try {
			Gson gson = new Gson();
	    	String json = readTrendingFile();
	    	if(StringUtils.isNotBlank(json)){
        		// convert the json from the file over to an object so we can handle it
            	MicrosoftTrendingList msTrendingList = gson.fromJson(json, MicrosoftTrendingList.class);
            	if(msTrendingList != null) {
            		// now we run through the list of trending items
            		// and we try to insert them into the database
                	IterateTrendingList(gson,msTrendingList);		
            	}
	    	}
		} catch(Exception e) {
			logger.error("error reading trending ms file.",e);
		}

	}

	/**
	 * Method to iterate through the trending xbox file
	 * @param gson the gson serialization object
	 * @param msTrendingList the list of trending items
	 * @throws JsonSyntaxException will throw a json exception if it cannot parse the json
	 * @throws ParseException the json parsing exception
	 */
	private void IterateTrendingList(Gson gson, MicrosoftTrendingList msTrendingList)
			throws JsonSyntaxException, ParseException {		
		for(Item item : msTrendingList.getItems()) {			
			// now we run through each item and try to upsert it into our database
			xboxClipCacher.UpsertMicrosoftClip(gson,item,this.xboxClient, this.mongoManager);
		}
	}
	
	/**
	 * Reads the trending xbox json file
	 * @return returns the json contents of the file
	 */
	public String readTrendingFile() {
		String trendingJson = "";
		
		String xboxTrendingDirectory = PropertiesCache.getInstance().getString("XBOX_TRENDING_DIR","");			
		String xboxTrendingFile = PropertiesCache.getInstance().getString("XBOX_TRENDING_FILE","");	
		
		// this reads the trendings file and
		// automatically closes the buffer itself
		try (BufferedReader br = new BufferedReader(
				new FileReader(xboxTrendingDirectory+xboxTrendingFile))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				trendingJson += sCurrentLine;
			}
		} catch (IOException e) {
			logger.error("IOExceptions while reading the trending xbox file.",e);
		}
		return trendingJson;
	}

	@Override
	public Double getInitialRunningStandardDeviation() {
		// TODO IMPLEMENT RUNNING STANDARD DEVIATION FOR TrendingFileWatcherRunnable
		return null;
	}

	@Override
	public Double getInitialRunningMean() {
		// TODO IMPLEMENT RUNNING STANDARD MEAN FOR TrendingFileWatcherRunnable
		return null;
	}
	
}
