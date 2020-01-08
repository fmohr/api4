package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation.IPathEvaluator;

/**
 * This is a {@link IPathSearchInput} in which every path is equipped with a score.
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 * @param <V> ({@link Comparable}) type of scores of paths
 */
public interface IPathSearchWithPathEvaluationsInput<N, A, V extends Comparable<V>> extends IPathSearchInput<N, A> {

	/**
	 * @return The path evaluator
	 */
	public IPathEvaluator<N, A, V> getPathEvaluator();
}
