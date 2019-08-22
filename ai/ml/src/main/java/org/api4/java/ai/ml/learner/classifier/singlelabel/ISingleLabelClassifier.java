package org.api4.java.ai.ml.learner.classifier.singlelabel;

import org.api4.java.ai.ml.dataset.supervised.classification.singlelabel.ISingleLabelClassificationDataset;
import org.api4.java.ai.ml.dataset.supervised.classification.singlelabel.ISingleLabelClassificationInstance;
import org.api4.java.ai.ml.learner.ISupervisedLearner;

/**
 *
 * @author mwever
 *
 * @param <C>
 * @param <X>
 * @param <I>
 * @param <D>
 */
public interface ISingleLabelClassifier<C extends ISingleLabelClassifierConfig> extends ISupervisedLearner<C, ISingleLabelClassificationInstance, ISingleLabelClassificationDataset> {

}
