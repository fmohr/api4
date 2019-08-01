package org.api4.java.ai.ml.learner.regressor;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.regression.IRegressionDataSource;
import org.api4.java.ai.ml.dataset.supervised.regression.IRegressionInstance;
import org.api4.java.ai.ml.learner.ISupervisedLearner;

public interface IRegressor<C extends IRegressorConfig, X, I extends IFeatureInstance<X> & IRegressionInstance, D extends IRegressionDataSource<X, I>> extends ISupervisedLearner<C, X, Double, I, D> {

}
