package org.api4.java.ai.ml.dataset.supervised;

import org.api4.java.ai.ml.dataset.INumericFeatureInstance;

public interface INumericFeatureSupervisedDataSource<Y, I extends INumericFeatureInstance & ILabeledInstance<Y>> extends ISupervisedDataSource<Double, Y, I> {

}
