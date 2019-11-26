package org.api4.java.ai.ml.classification;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.evaluation.ISupervisedLearnerEvaluator;

public interface IClassifierEvaluator extends ISupervisedLearnerEvaluator<ILabeledInstance, ILabeledDataset<?>> {
}