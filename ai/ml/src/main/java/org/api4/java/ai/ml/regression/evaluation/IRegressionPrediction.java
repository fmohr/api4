package org.api4.java.ai.ml.regression.evaluation;

import org.api4.java.ai.ml.core.evaluation.IPrediction;

public interface IRegressionPrediction extends IPrediction {

	@Override
	default Double getPrediction() {
		return this.getDoublePrediction();
	}

	public double getDoublePrediction();

}
