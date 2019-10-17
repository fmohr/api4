package org.api4.java.ai.ml.core.evaluation;

import org.api4.java.ai.ml.core.learner.ISupervisedLearner;
import org.api4.java.common.attributedobjects.IObjectEvaluator;

public interface ISupervisedLearnerEvaluator<L extends ISupervisedLearner<?, ?>> extends IObjectEvaluator<L, Double> {

}
