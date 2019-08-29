package org.api4.java.ai.ml.core.learner.algorithm;

import java.util.List;

import org.api4.java.ai.ml.core.dataset.IInstance;

public interface IBatchPredictionAlgorithm<Y, I extends IInstance> extends IGenericPredictionAlgorithm<List<Y>, List<I>> {

}
