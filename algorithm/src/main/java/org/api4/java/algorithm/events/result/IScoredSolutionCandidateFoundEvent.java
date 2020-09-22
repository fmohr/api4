package org.api4.java.algorithm.events.result;

/**
 * An event that announces that the algorithm has found a solution associated with a score has been found.
 *
 * @author Felix Mohr
 *
 */
public interface IScoredSolutionCandidateFoundEvent extends ISolutionCandidateFoundEvent {

	/**
	 * @return The score of the solution
	 */
	public Object getScore();
}
