package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataSource;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;

/**
 *
 * @author mwever
 *
 * @param <X>
 * @param <Y>
 * @param <I>
 * @param <D>
 */
public interface ISupervisedLearner<I extends ILabeledInstance, D extends ILabeledDataSource<? extends I>> extends IFittablePredictor<I, D>, ILearnerConfigHandler {

}