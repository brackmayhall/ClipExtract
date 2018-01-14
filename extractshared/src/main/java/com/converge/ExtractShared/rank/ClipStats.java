package com.converge.ExtractShared.rank;

/**
 * Class used to keep a rolling standard deviation
 * and mean as new clips are found
 * this uses zscore so dataset are normalized
 * @author Brackston Mayhall
 */
public class ClipStats {

	private MeanVarianceSampler meanVar = new MeanVarianceSampler();
	
	public ClipStats(Double firstItem){
		meanVar.add(firstItem);
	}
	
	public Double addNewClip(int likeCount, long createTime, long foundTime){
		Double doubleLikeCount = Double.valueOf(likeCount);
		Double zScore = getZScore(doubleLikeCount);
		Double rank = getRank(zScore, createTime, foundTime);
		meanVar.add(likeCount);
		return rank;
	}	

	private Double getZScore(Double x){
		Double zScore = (x- meanVar.getMean() )/ meanVar.getStdDev();
		return zScore;
	}
	
	private Double getRank(Double zScore, long createTime, long foundTime){
		Double rank = ( zScore / ( (foundTime - createTime) / zScore) ) * foundTime;
		return rank;
	}
}