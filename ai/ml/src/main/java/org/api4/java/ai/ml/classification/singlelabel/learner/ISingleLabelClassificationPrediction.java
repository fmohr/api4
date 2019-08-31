package org.api4.java.ai.ml.classification.singlelabel.learner;

import org.api4.java.ai.ml.core.learner.algorithm.IPrediction;

public interface ISingleLabelClassificationPrediction extends IPrediction {

	public String getLabelWithHighestProbability();

	public double[] getClassDistribution();

	public double getProbabilityOfLabel(String label);

}
