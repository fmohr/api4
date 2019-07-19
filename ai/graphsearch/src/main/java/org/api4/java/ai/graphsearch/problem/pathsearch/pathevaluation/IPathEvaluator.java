package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.datastructure.graph.IPath;

public interface IPathEvaluator<N, A, V extends Comparable<V>> {
	public V f(IPath<N, A> path) throws PathEvaluationException, InterruptedException;
}
