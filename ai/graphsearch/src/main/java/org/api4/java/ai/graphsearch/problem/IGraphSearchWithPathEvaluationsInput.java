package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation.IPathEvaluator;

public interface IGraphSearchWithPathEvaluationsInput<N, A, V extends Comparable<V>> extends IGraphSearchInput<N, A> {
	public IPathEvaluator<N, A, V> getPathEvaluator();
}
