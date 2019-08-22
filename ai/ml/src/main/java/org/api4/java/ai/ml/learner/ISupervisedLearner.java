package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.supervised.ILabeledDataSource;
import org.api4.java.ai.ml.dataset.supervised.ILabeledInstance;

/**
 *
 * @author mwever
 *
 * @param <C>
 * @param <X>
 * @param <Y>
 * @param <I>
 * @param <D>
 */
public interface ISupervisedLearner<C, I extends ILabeledInstance, D extends ILabeledDataSource<I>> extends IFittablePredictor<I, D>, ILearnerConfigHandler<C> {

}