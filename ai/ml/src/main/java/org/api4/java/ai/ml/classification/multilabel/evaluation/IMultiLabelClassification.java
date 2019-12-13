package org.api4.java.ai.ml.classification.multilabel.evaluation;

import org.api4.java.ai.ml.core.evaluation.IPrediction;

public interface IMultiLabelClassification extends IPrediction {

	@Override
	public double[] getPrediction();

	public int[] getThresholdedPrediction();

	public int[] getPrediction(double threshold);

	public int[] getPrediction(final double[] threshold);

	public int[] getRelevantLabels(double threshold);

	public int[] getIrrelevantLabels(double threshold);

}
