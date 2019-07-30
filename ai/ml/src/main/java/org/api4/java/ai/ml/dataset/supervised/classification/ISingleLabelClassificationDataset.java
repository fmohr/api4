package org.api4.java.ai.ml.dataset.supervised.classification;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataset;

public interface ISingleLabelClassificationDataset<X, I extends IFeatureInstance<X> & ISingleLabelClassificationInstance> extends ISupervisedDataset<X, String, I> {

}
