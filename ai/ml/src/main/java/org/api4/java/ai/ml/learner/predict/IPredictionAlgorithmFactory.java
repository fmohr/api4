package org.api4.java.ai.ml.learner.predict;

import org.api4.java.ai.ml.dataset.IFeatureInstance;

public interface IPredictionAlgorithmFactory<X, Y, I extends IFeatureInstance<X>> {

	public IPredictionAlgorithm<X, Y, I> getPredictionAlgorithm();

}
