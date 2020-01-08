package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

/**
 * Some path evaluators may not only assign a score but also uncertainty of their assessment.
 * They can declare this (potential) ability by implementing this interface.
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 * @param <V> {@link Comparable} type of the score attached to the path
 */
public interface IPotentiallyUncertaintyAnnotatingPathEvaluator<N, A, V extends Comparable<V>> extends IPathEvaluator<N, A, V> {

	/**
	 * @return <code>true</code> iff uncertainty is annotated.
	 */
	public boolean annotatesUncertainty();

	/**
	 * Sets the source of uncertainty used
	 *
	 * @param uncertaintySource
	 */
	public void setUncertaintySource(IUncertaintySource<N, A, V> uncertaintySource);
}
