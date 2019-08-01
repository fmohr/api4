package org.api4.java.ai.ml.learner.predict;

import java.util.List;

import org.api4.java.ai.ml.dataset.IFeatureInstance;

public interface IBatchPredictionAlgorithm<X, Y, I extends IFeatureInstance<X>> extends IGenericPredictionAlgorithm<List<I>, List<Y>> {

}
