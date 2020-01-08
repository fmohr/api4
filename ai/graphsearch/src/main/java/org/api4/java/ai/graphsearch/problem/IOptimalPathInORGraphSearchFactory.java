package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation.IEvaluatedPath;
import org.api4.java.algorithm.IOptimizationAlgorithmFactory;

public interface IOptimalPathInORGraphSearchFactory<I extends IPathSearchInput<N, A>, O extends IEvaluatedPath<N, A, V>, N, A, V extends Comparable<V>, A2 extends IOptimalPathInORGraphSearch<I, O, N, A, V>> extends IOptimizationAlgorithmFactory<I, O, V, A2> {

}
