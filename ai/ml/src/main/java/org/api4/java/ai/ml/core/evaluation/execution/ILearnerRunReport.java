package org.api4.java.ai.ml.core.evaluation.execution;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface ILearnerRunReport {
	public int getTrainingTimeInMS();
	
	public int getTestTimeInMS();
	
	public String getTrainSetDescriptor();
	
	public String getTestSetDescriptor();
	
	public IPredictionAndGroundTruthTable getPredictionDiffList();
}
