package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.common.attributedobjects.IObjectEvaluator;
import org.api4.java.datastructure.graph.ILabeledPath;

/**
 * Assigns a score to a given path.
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 * @param <V> {@link Comparable} type of the score attached to the path
 */
public interface IPathEvaluator<N, A, V extends Comparable<V>> extends IObjectEvaluator<ILabeledPath<N, A>, V> {

	@Override
	public V evaluate(ILabeledPath<N, A> path) throws PathEvaluationException, InterruptedException;
}
