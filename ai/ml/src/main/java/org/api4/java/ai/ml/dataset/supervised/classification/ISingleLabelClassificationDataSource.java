package org.api4.java.ai.ml.dataset.supervised.classification;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.ISupervisedDataSource;

public interface ISingleLabelClassificationDataSource<X, I extends IFeatureInstance<X> & ISingleLabelClassificationInstance> extends ISupervisedDataSource<X, String, I> {

}
