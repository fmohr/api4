package org.api4.java.ai.ml.learner.classifier;

import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.dataset.supervised.classification.ISingleLabelClassificationDataSource;
import org.api4.java.ai.ml.dataset.supervised.classification.ISingleLabelClassificationInstance;
import org.api4.java.ai.ml.learner.ISupervisedLearner;

/**
 *
 * @author mwever
 *
 * @param <C>
 * @param <X>
 * @param <I>
 * @param <D>
 * @param <M>
 */
public interface ISingleLabelClassifier<C extends ISingleLabelClassifierConfig, X, I extends IFeatureInstance<X> & ISingleLabelClassificationInstance, D extends ISingleLabelClassificationDataSource<X, I>>
		extends ISupervisedLearner<C, X, String, I, D> {

}
