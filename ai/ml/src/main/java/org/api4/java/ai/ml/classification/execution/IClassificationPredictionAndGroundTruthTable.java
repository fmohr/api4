package org.api4.java.ai.ml.classification.execution;

import java.util.List;

public interface IClassificationPredictionAndGroundTruthTable {
	
	public int size();
	
	public Object getPrediction(int instance);
	
	public Object getGroundTruth(int instance);
	
	public List<?> getPredictionsAsList();
	
	public Object[] getPredictionsAsArray();
	
	public List<?> getGroundTruthAsList();
	
	public Object[] getGroundTruthAsArray();
}
