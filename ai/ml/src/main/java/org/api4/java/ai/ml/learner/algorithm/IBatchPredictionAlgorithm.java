package org.api4.java.ai.ml.learner.algorithm;

import java.util.List;

import org.api4.java.ai.ml.dataset.IInstance;

public interface IBatchPredictionAlgorithm<Y, I extends IInstance> extends IGenericPredictionAlgorithm<List<Y>, List<I>> {

}
