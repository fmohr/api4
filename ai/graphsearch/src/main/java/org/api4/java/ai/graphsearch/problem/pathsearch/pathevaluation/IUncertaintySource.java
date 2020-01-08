package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import java.util.List;

import org.api4.java.datastructure.graph.ILabeledPath;

@FunctionalInterface
public interface IUncertaintySource<T, A, V extends Comparable<V>> {

	/**
	 * Computes the uncertainty based on a list of paths and their evaluations
	 *
	 * @param n
	 * @param simulationPaths
	 * @param simulationEvaluations
	 * @return
	 */
	public double calculateUncertainty(IEvaluatedPath<T, A, V> n, List<ILabeledPath<T, A>> simulationPaths, List<V> simulationEvaluations);

}
