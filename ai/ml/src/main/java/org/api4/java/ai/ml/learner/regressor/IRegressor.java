package org.api4.java.ai.ml.learner.regressor;

import org.api4.java.ai.ml.dataset.supervised.regression.IRegressionDataset;
import org.api4.java.ai.ml.dataset.supervised.regression.IRegressionInstance;
import org.api4.java.ai.ml.learner.ISupervisedLearner;

public interface IRegressor<C extends IRegressorConfig> extends ISupervisedLearner<C, IRegressionInstance, IRegressionDataset> {

}
