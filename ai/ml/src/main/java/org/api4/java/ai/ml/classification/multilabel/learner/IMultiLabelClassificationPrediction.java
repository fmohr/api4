package org.api4.java.ai.ml.classification.multilabel.learner;

import java.util.Map;

import org.api4.java.ai.ml.core.learner.algorithm.IPrediction;

public interface IMultiLabelClassificationPrediction extends IPrediction {

	public Map<String, Double> getLabelScores();

}
