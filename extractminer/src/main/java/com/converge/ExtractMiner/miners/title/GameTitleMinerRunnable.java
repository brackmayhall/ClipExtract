package com.converge.ExtractMiner.miners.title;

import org.apache.log4j.Logger;

import com.converge.ExtractMiner.miners.title.playstation.PlaystationTitleManager;

/**
 * Runnable class that handles gathering and linking
 * video game titles with found clips clips
 * this runs best in a scheduled manner (ScheduledExecutorService)
 * @author Brackston Mayhall
 */
public class GameTitleMinerRunnable implements Runnable {
	
	// currently only gets ps4 titles
	//TODO: need to get computer titles, xbox
	final static Logger logger = Logger.getLogger(GameTitleMinerRunnable.class);
	@Override
	public void run() {
		final PlaystationTitleManager titleManager = new PlaystationTitleManager();
		try {
			titleManager.getTitles();
		} catch (Exception e) {
			logger.error("error in miner runnable: ", e);
		}
	}
}
