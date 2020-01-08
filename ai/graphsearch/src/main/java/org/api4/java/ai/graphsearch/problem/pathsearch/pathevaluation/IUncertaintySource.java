package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import java.util.List;

import org.api4.java.datastructure.graph.ILabeledPath;

@FunctionalInterface
public interface IUncertaintySource<T, A, V extends Comparable<V>> {

	public double calculateUncertainty(IEvaluatedPath<T, A, V> n, List<ILabeledPath<T, A>> simulationPaths, List<V> simulationEvaluations);

}
