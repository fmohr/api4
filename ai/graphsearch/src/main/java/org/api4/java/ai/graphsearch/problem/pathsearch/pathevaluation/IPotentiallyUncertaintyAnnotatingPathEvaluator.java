package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

public interface IPotentiallyUncertaintyAnnotatingPathEvaluator<N, A, V extends Comparable<V>> extends IPathEvaluator<N, A, V> {
	public void setUncertaintySource(IUncertaintySource<N, A, V> uncertaintySource);

	public boolean annotatesUncertainty();
}
