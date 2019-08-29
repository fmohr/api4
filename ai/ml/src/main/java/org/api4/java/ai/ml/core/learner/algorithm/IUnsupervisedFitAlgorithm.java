package org.api4.java.ai.ml.core.learner.algorithm;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.learner.IMLModel;
import org.api4.java.algorithm.IAlgorithm;

public interface IUnsupervisedFitAlgorithm<X, I extends IInstance, D extends IDataSource<I>, M extends IMLModel> extends IAlgorithm<D, M> {

}
