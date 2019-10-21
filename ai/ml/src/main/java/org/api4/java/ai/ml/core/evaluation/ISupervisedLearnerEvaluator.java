package org.api4.java.ai.ml.core.evaluation;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.learner.ISupervisedLearner;
import org.api4.java.common.attributedobjects.IObjectEvaluator;

/**
 *
 * @author felix
 *
 * There is no special reason to be limited to specific types of learners here
 */
public interface ISupervisedLearnerEvaluator<I extends ILabeledInstance, D extends ILabeledDataset<I>> extends IObjectEvaluator<ISupervisedLearner<I, D>, Double> {

}
