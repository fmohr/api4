package org.api4.java.ai.ml.classification;

import org.api4.java.ai.ml.core.evaluation.ISupervisedLearnerEvaluator;

public interface IClassifierEvaluator<C extends IClassifier<?, ?>> extends ISupervisedLearnerEvaluator<C> {
}