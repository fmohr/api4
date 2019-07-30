package org.api4.java.ai.ml.dataset.supervised;

import org.api4.java.ai.ml.dataset.INumericFeatureInstance;

public interface INumericFeatureSupervisedDataset<Y, I extends INumericFeatureInstance & ILabeledInstance<Y>> extends ISupervisedDataset<Double, Y, I> {

}
