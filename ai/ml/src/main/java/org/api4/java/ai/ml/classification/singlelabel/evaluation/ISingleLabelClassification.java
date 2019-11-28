package org.api4.java.ai.ml.classification.singlelabel.evaluation;

import java.util.Map;

import org.api4.java.ai.ml.core.evaluation.IPrediction;

/**
 * Interface for classifier that predict a single label among a constant number.
 *
 * The convention is that labels are integers starting from 0 to n - 1 where n is the number of classes.
 *
 */
public interface ISingleLabelClassification extends IPrediction {

	@Override
	default Integer getPrediction() {
		return this.getIntPrediction();
	}

	public int getIntPrediction();

	@Override
	public Integer getLabelWithHighestProbability();

	@Override
	public Map<Integer, Double> getClassDistribution();

	@Override
	public Map<Integer, Double> getClassConfidence();

	public double getProbabilityOfLabel(int label);
}
