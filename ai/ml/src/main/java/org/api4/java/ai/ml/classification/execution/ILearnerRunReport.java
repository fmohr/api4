package org.api4.java.ai.ml.classification.execution;

public interface ILearnerRunReport {
	public int getTrainingTimeInMS();
	
	public int getTestTimeInMS();
	
	public String getTrainSetDescriptor();
	
	public String getTestSetDescriptor();
	
	public IClassificationPredictionAndGroundTruthTable getPredictionDiffList();
}
