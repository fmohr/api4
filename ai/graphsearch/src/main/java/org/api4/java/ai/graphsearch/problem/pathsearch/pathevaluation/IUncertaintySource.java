package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import java.util.List;

@FunctionalInterface
public interface IUncertaintySource<T, A, V extends Comparable<V>> {

	public double calculateUncertainty(IEvaluatedPath<T, A, V> n, List<List<T>> simulationPaths, List<V> simulationEvaluations);

}
