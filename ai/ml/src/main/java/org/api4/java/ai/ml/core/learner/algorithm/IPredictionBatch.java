package org.api4.java.ai.ml.core.learner.algorithm;

import java.util.List;

public interface IPredictionBatch {
	public List<? extends IPrediction> getPredictions();

	public int getNumPredictions();
}
