package org.api4.java.ai.ml.classification;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.evaluation.ISupervisedLearnerEvaluator;

public interface IClassifierEvaluator<I extends ILabeledInstance, D extends ILabeledDataset<I>> extends ISupervisedLearnerEvaluator<I, D> {
}