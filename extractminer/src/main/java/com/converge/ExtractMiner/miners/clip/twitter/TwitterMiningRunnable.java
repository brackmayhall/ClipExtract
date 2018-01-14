package com.converge.ExtractMiner.miners.clip.twitter;

import org.apache.log4j.Logger;

import com.converge.ExtractMiner.miners.clip.IClipStats;

import twitter4j.FilterQuery;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Class that retrieves video clips from the Twitter data source
 * @author Brackston Mayhall
 */
public class TwitterMiningRunnable implements Runnable, IClipStats {
			
	final static Logger logger = Logger.getLogger(TwitterMiningRunnable.class);
	
	@Override
	public void run() {		
		// the status handler to take status hand-offs from the
		// twitter event based stream
		final TwitterStatusIngestor statusManager = new TwitterStatusIngestor();
		
		// Twitter4j status listener
	    StatusListener listener = new StatusListener(){
	    	
	    	// fired when a status is received from twitter
	        public void onStatus(Status status) {
	        	// pass the status to the status handler
	        	statusManager.ingest(status);
	        }
	        
	        public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
				if(logger.isDebugEnabled()) {
					logger.debug("onDeletionNotice was called ");
				}
	        }
	        
	        public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
				if(logger.isDebugEnabled()) {
					logger.debug("onTrackLimitationNotice was called " + numberOfLimitedStatuses);
				}
	        }
	        
	        public void onException(Exception ex) {
	        	logger.error("twitter status error: ", ex);
	        }
	        
			@Override
			public void onScrubGeo(long arg0, long arg1) {
				if(logger.isDebugEnabled()) {
					logger.debug("onScrubGeo was called.");
				}
			}
			
			@Override
			public void onStallWarning(StallWarning arg0) {
				if(logger.isDebugEnabled()) {
					logger.debug("onStallWarning was called");
				}
			}
	    };
	    
	    // used to initially set up all twitter access configuration upon module load
		ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setJSONStoreEnabled(true)
        .setDebugEnabled(false)
        .setOAuthConsumerKey("IgkpX0ppMwlW5En8JvPupRqlP")
        .setOAuthConsumerSecret("XM4LrDQZPX0yk2eEmEEOZuuwAJ6PO2SFQq0w8bKqLSniSDNw0o")
        .setOAuthAccessToken("19091675-mE3a96bwT34OwgDGOdChL2SI8wS3bwONDb7S5A6ZX")
        .setOAuthAccessTokenSecret("22bO5hJC9enlalSSd9fmebQKy5GydOr0yIPyAetlZc0Fr");
        
        // twitter stream singleton 
	    TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
	    twitterStream.addListener(listener);
	    
	    // create a query that search for the keyword "ps4share" in twitter
	    // this currently only supports English
        FilterQuery filterQuery = new FilterQuery();        
        String keywords[] = {"ps4share"};
        filterQuery.track(keywords);
        filterQuery.language(new String[]{"en"});
        twitterStream.addListener(listener);
        twitterStream.filter(filterQuery); 
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

