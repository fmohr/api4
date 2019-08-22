package org.api4.java.ai.ml.learner.algorithm;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IInstance;
import org.api4.java.ai.ml.learner.IMLModel;
import org.api4.java.algorithm.IAlgorithm;

public interface IUnsupervisedFitAlgorithm<X, I extends IInstance, D extends IDataSource<I>, M extends IMLModel> extends IAlgorithm<D, M> {

}
