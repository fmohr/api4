package org.api4.java.ai.ml.learner.fit;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.learner.IMLModel;
import org.api4.java.algorithm.IAlgorithm;

public interface IUnsupervisedFitAlgorithm<X, I extends IFeatureInstance<X>, D extends IDataSource<X, I>, M extends IMLModel> extends IAlgorithm<D, M> {

}
