package org.api4.java.ai.ml.core.evaluation;

import org.api4.java.ai.ml.core.learner.ISupervisedLearner;
import org.api4.java.common.attributedobjects.IObjectEvaluator;

/**
 *
 * @author Felix Mohr
 *
 * There is no special reason to be limited to specific types of learners here
 */
public interface ISupervisedLearnerEvaluator extends IObjectEvaluator<ISupervisedLearner, Double> {

}
