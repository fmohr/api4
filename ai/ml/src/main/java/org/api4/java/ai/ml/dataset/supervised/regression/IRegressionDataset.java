package org.api4.java.ai.ml.dataset.supervised.regression;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataset;

public interface IRegressionDataset<X, I extends IFeatureInstance<X> & IRegressionInstance> extends ISupervisedDataset<X, Double, I> {

}
