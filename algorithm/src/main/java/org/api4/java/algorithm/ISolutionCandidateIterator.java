package org.api4.java.algorithm;

import org.api4.java.algorithm.events.result.ISolutionCandidateFoundEvent;
import org.api4.java.algorithm.exceptions.AlgorithmException;
import org.api4.java.algorithm.exceptions.AlgorithmExecutionCanceledException;
import org.api4.java.algorithm.exceptions.AlgorithmTimeoutedException;

/**
 * Many algorithms iterate over many possible output candidates before eventually returning one of them as the final output.
 * Such algorithms are iterators for solution candidates, and we demand the possibility to ask for next such candidates.
 *
 * @author Felix Mohr
 *
 */
public interface ISolutionCandidateIterator extends IAlgorithm {

	/**
	 * @return next potential solution candidate
	 *
	 * @throws AlgorithmTimeoutedException
	 * @throws AlgorithmExecutionCanceledException
	 * @throws InterruptedException
	 * @throws AlgorithmException
	 */
	public Object nextSolutionCandidate() throws AlgorithmTimeoutedException, AlgorithmExecutionCanceledException, InterruptedException, AlgorithmException;

	/**
	 *
	 * @return The event indicating the arrival of a new solution candidate
	 * @throws AlgorithmTimeoutedException
	 * @throws AlgorithmExecutionCanceledException
	 * @throws InterruptedException
	 * @throws AlgorithmException
	 */
	public ISolutionCandidateFoundEvent nextSolutionCandidateEvent() throws AlgorithmTimeoutedException, AlgorithmExecutionCanceledException, InterruptedException, AlgorithmException;
}