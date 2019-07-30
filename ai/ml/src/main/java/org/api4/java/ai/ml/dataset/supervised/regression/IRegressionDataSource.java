package org.api4.java.ai.ml.dataset.supervised.regression;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataSource;

public interface IRegressionDataSource<X, I extends IFeatureInstance<X> & IRegressionInstance> extends ISupervisedDataSource<X, Double, I> {

}
