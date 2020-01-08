package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

/**
 * This interface suggests that the node evaluator MAY report solutions that he finds under a node.
 * However, not every such solution NEEDS to be reported.
 * In particular, algorithms using solution reports must anticipate that solutions are found that were not already reported by the node evaluator.
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 * @param <V> {@link Comparable} type of the score attached to the path
 */
public interface IPotentiallySolutionReportingPathEvaluator<T, A, V extends Comparable<V>> extends IPathEvaluator<T, A, V> {

	/**
	 * @param listener The object that can process the event of new solutions
	 */
	public void registerSolutionListener(Object listener);

	/**
	 * @return <code>true</code> iff it will send events on found solutions.
	 */
	public boolean reportsSolutions();
}
