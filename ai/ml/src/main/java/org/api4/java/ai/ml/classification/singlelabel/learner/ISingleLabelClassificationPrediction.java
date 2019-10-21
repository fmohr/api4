package org.api4.java.ai.ml.classification.singlelabel.learner;

import java.util.Map;

import org.api4.java.ai.ml.core.learner.algorithm.IPrediction;

public interface ISingleLabelClassificationPrediction extends IPrediction {

	@Override
	public String getPrediction();

	public String getLabelWithHighestProbability();

	public Map<String, Double> getClassDistribution();

	public double getProbabilityOfLabel(String label);

}
