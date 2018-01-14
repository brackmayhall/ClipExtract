package com.converge.ExtractMiner.miners.clip;

/**
 * 
 * Interface used to get the previous running standard 
 * @author Brackston Mayhall
 *
 */
public interface IClipStats {

	public Double getInitialRunningStandardDeviation();
	public Double getInitialRunningMean();
	
}
