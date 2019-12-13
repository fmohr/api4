package org.api4.java.ai.ml.core.evaluation.supervised.loss;

/**
 * This interface is for performance measures applied to deterministic predictions (the learner has to commit to one label).
 *
 * @author Felix Mohr
 *
 * @param <O> the class of objects representing the labels
 */
public interface IDeterministicHomogeneousPredictionPerformanceMeasure<O> extends IDeterministicPredictionPerformanceMeasure<O, O> {


}
