package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation.IEvaluatedPath;
import org.api4.java.algorithm.IOptimizationAlgorithm;

/**
 * This is a template for algorithms that aim at finding paths from a root to
 * goal nodes in a graph. This template does not assume paths to have a score.
 *
 * The output type of this algorithm is fixed to EvaluatedSearchGraphPath<NSrc, ASrc, V>
 *
 * @author fmohr
 *
 * @param <I>
 * @param <N>
 * @param <A>
 * @param <V>
 * @param <NSearch>
 * @param <Asearch>
 */
public interface IOptimalPathInORGraphSearch<I extends IGraphSearchInput<N, A>, O extends IEvaluatedPath<N, A, V>, N, A, V extends Comparable<V>> extends IOptimizationAlgorithm<I, O, V>, IPathInORGraphSearch<I, O, N, A> {

}
