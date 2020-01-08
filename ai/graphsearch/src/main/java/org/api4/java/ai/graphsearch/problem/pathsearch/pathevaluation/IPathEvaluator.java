package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.common.attributedobjects.IObjectEvaluator;
import org.api4.java.datastructure.graph.ILabeledPath;

public interface IPathEvaluator<N, A, V extends Comparable<V>> extends IObjectEvaluator<ILabeledPath<N, A>, V> {
	
	@Override
	public V evaluate(ILabeledPath<N, A> path) throws PathEvaluationException, InterruptedException;
}
