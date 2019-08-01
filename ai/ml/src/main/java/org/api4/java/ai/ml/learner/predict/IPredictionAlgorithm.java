package org.api4.java.ai.ml.learner.predict;

import org.api4.java.ai.ml.dataset.IFeatureInstance;

public interface IPredictionAlgorithm<X, Y, I extends IFeatureInstance<X>> extends IGenericPredictionAlgorithm<I, Y> {

}
