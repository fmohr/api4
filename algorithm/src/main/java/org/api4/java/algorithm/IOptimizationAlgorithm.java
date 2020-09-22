package org.api4.java.algorithm;

/**
 * Optimizers are special cases of {@link ISolutionCandidateIterator} algorithms that assign a score to each solution candidate.
 * @author Felix Mohr
 *
 * @param <V> score assigned to solutions
 */
public interface IOptimizationAlgorithm extends IAlgorithm, ISolutionCandidateIterator {

}
