package org.api4.java.ai.ml.dataset.supervised;

import org.api4.java.ai.ml.dataset.IDataset;
import org.api4.java.ai.ml.dataset.IFeatureInstance;

public interface ISupervisedDataset<X, Y, I extends IFeatureInstance<X> & ILabeledInstance<Y>> extends ISupervisedDataSource<X, Y, I>, IDataset<X, I> {

}
