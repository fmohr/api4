package org.api4.java.ai.ml.regression.learner;

import org.api4.java.ai.ml.core.learner.ISupervisedLearner;
import org.api4.java.ai.ml.regression.dataset.IRegressionDataset;
import org.api4.java.ai.ml.regression.dataset.IRegressionInstance;

public interface IRegressor extends ISupervisedLearner<IRegressionInstance, IRegressionDataset> {

}
