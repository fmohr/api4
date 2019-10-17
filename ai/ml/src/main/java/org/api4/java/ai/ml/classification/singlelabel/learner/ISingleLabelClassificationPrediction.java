package org.api4.java.ai.ml.classification.singlelabel.learner;

import org.api4.java.ai.ml.core.learner.algorithm.IPrediction;

/**
 * Interface for classifier that predict a single label among a constant number.
 * 
 * The convention is that labels are integers starting from 0 to n - 1 where n is the number of classes.
 *
 */
public interface ISingleLabelClassificationPrediction extends IPrediction {

	@Override
	default Integer getPrediction() {
		return getIntPrediction();
	}

	public int getIntPrediction();

	public int getLabelWithHighestProbability();

	public double[] getClassDistribution();

	public double getProbabilityOfLabel(int label);

}
