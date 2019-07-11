package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

/**
 * This interface suggests that the node evaluator MAY report solutions that he finds under a node.
 * However, not every such solution NEEDS to be reported.
 * In particular, algorithms using solution reports must anticipate that solutions are found that were not already reported by the node evaluator.
 *
 * @author fmohr
 *
 * @param <T>
 * @param <V>
 */
public interface IPotentiallySolutionReportingPathEvaluator<T, A, V extends Comparable<V>> extends IPathEvaluator<T, A, V> {
	public void registerSolutionListener(Object listener);

	public boolean reportsSolutions();
}
