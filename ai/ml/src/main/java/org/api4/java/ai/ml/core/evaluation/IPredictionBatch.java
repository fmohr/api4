package org.api4.java.ai.ml.core.evaluation;

import java.util.List;

public interface IPredictionBatch {
	public List<? extends IPrediction> getPredictions();

	public int getNumPredictions();
}
