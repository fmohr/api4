package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.common.attributedobjects.IObjectEvaluator;
import org.api4.java.datastructure.graph.IPath;

public interface IPathEvaluator<N, A, V extends Comparable<V>> extends IObjectEvaluator<IPath<N, A>, V> {
	@Override
	public V evaluate(IPath<N, A> path) throws PathEvaluationException, InterruptedException;
}
