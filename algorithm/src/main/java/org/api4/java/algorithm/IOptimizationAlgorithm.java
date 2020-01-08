package org.api4.java.algorithm;

import org.api4.java.common.attributedobjects.ScoredItem;

/**
 * Optimizers are special cases of {@link ISolutionCandidateIterator} algorithms that assign a score to each solution candidate.
 * @author Felix Mohr
 *
 * @param <I> type of inputs
 * @param <O> type of outputs
 * @param <V> score assigned to solutions
 */
public interface IOptimizationAlgorithm<I, O extends ScoredItem<V>, V extends Comparable<V>> extends IAlgorithm<I, O>, ISolutionCandidateIterator<I, O> {

}
