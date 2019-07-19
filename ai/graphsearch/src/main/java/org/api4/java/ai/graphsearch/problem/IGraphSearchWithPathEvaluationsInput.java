package org.api4.java.ai.graphsearch.problem;

import org.api4.java.common.attributedobjects.IObjectEvaluator;
import org.api4.java.datastructure.graph.IPath;

public interface IGraphSearchWithPathEvaluationsInput<N, A, V extends Comparable<V>> extends IGraphSearchInput<N, A> {
	public IObjectEvaluator<IPath<N, A>, V> getPathEvaluator();
}
