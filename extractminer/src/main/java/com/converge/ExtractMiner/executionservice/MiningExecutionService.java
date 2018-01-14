package com.converge.ExtractMiner.executionservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.converge.ExtractMiner.miners.clip.forge.ForgeRunnable;
import com.converge.ExtractMiner.miners.clip.microsoft.TrendingFileWatcherRunnable;
import com.converge.ExtractMiner.miners.clip.twitter.TwitterMiningRunnable;
import com.converge.ExtractMiner.miners.title.GameTitleMinerRunnable;
import com.converge.ExtractShared.config.PropertiesCache;

/**
 * Class that handles starting all of the runnable mining modules
 * @author Brackston Mayhall
 */
public class MiningExecutionService {
	final static Logger logger = Logger.getLogger(MiningExecutionService.class);

	/**
	 * Main does not take args currently
	 * @param args
	 */
	public static void main(String[] args) {

		if(logger.isDebugEnabled()) {
			logger.debug("executor service started");
		}
		
		//ScheduledExecutorService  titleScheduledService = Executors.newScheduledThreadPool(1);
		//titleScheduledService.scheduleWithFixedDelay(new GameTitleMinerRunnable(),0, 5, TimeUnit.HOURS);
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);	
		executorService.execute(new ForgeRunnable());
		//executorService.execute(new TwitterMiningRunnable());
		
		// CURRENTLY THE TrendingFileWatcherRunnable HAS TO BE RUN ON WINDOWS
		//String xboxTrendingDirectory = PropertiesCache.getInstance().getString("XBOX_TRENDING_DIR","");	
		//String xboxTrendingFile = PropertiesCache.getInstance().getString("XBOX_TRENDING_FILE","");	
		//executorService.execute(new TrendingFileWatcherRunnable(xboxTrendingDirectory,xboxTrendingFile));

		executorService.shutdown();		
	}	
}
