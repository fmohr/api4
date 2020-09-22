package org.api4.java.algorithm.events.result;

import org.api4.java.algorithm.events.IAlgorithmEvent;

/**
 * Event for search algorithms that announce that they have found a solution candidate.
 *
 * @author Felix Mohr
 *
 * @param <O> type of solutions
 */
public interface ISolutionCandidateFoundEvent extends IAlgorithmEvent {

	/**
	 * @return The solution candidate
	 */
	public Object getSolutionCandidate();
}
