package com.converge.ExtractMiner.miners.clip.forge;

import org.apache.log4j.Logger;

import com.converge.ExtractMiner.miners.clip.IClipStats;
import com.converge.ExtractShared.config.PropertiesCache;

/**
 * Runnable class that implements the clip stats interface
 * it will first grab the latest stats in order to maintain
 * a runnning standard dev and mean
 * it then queries forge.gg to get new and exiting video game clips
 * @author Brackston Mayhall
 */
public class ForgeRunnable implements Runnable, IClipStats {
	
	final static Logger logger = Logger.getLogger(ForgeRunnable.class);
	
    public void run() {
    	//TODO: these will need to be passed into the clip manager
    	Double initialStandardDeviation = getInitialRunningStandardDeviation();
    	Double initialMean = getInitialRunningMean();
		ForgeClipManager forgeClipManager = new ForgeClipManager();
		
		// this is a sleep time default in the case it is not found in the properties file
		int forgeSleepTime = 300000;
		try{
			String forgeSleepTimeString = PropertiesCache.getInstance().getProperty("forgeSleepTime");
			forgeSleepTime = Integer.parseInt(forgeSleepTimeString);			
		} catch(Exception e){
			logger.error("Error getting forgeSleepTime from miner.properties file.", e);
		}

		// keep looking for clips that meet criteria
		while(true){	
			try {
				forgeClipManager.getNewClips();
				Thread.sleep(forgeSleepTime);
			} catch (InterruptedException e) {
				logger.error("Error during forge mining.",e);
			}
		}
    }

	@Override
	public Double getInitialRunningStandardDeviation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getInitialRunningMean() {
		// TODO Auto-generated method stub
		return null;
	}
}