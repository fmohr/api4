package org.api4.java.algorithm.events.result;

/**
 * An event that announces that the algorithm has found a solution associated with a score has been found.
 *
 * @author Felix Mohr
 *
 * @param <O> solution type
 * @param <V> score type
 */
public interface IScoredSolutionCandidateFoundEvent<O, V extends Comparable<V>> extends ISolutionCandidateFoundEvent<O> {

	/**
	 * @return The score of the solution
	 */
	public V getScore();
}
