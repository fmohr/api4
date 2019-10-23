package org.api4.java.ai.ml.classification.multilabel.evaluation;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPrediction;

public interface IMultiLabelClassification extends IPrediction {

	@Override
	public List<String> getPrediction();

	public List<String> getLabelSet();

	public List<String> getIrrelevantLabels();

	public double[] getLabelRelevanceVector();

	public int[] getLabelRelevanceVector(double threshold);

}
