package org.api4.java.ai.ml.learner.classifier.multilabel;

import org.api4.java.ai.ml.dataset.supervised.classification.multilabel.IMultiLabelClassificationDataset;
import org.api4.java.ai.ml.dataset.supervised.classification.multilabel.IMultiLabelClassificationInstance;
import org.api4.java.ai.ml.learner.ISupervisedLearner;

public interface IMultiLabelClassifier<C extends IMultiLabelClassifierConfig> extends ISupervisedLearner<C, IMultiLabelClassificationInstance, IMultiLabelClassificationDataset> {

}
