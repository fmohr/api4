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
 * @param <I> type of inputs
 * @param <O> type of outputs
 */
public interface ISolutionCandidateIterator<I, O> extends IAlgorithm<I, O> {

	/**
	 * @return next potential solution candidate
	 *
	 * @throws AlgorithmTimeoutedException
	 * @throws AlgorithmExecutionCanceledException
	 * @throws InterruptedException
	 * @throws AlgorithmException
	 */
	public O nextSolutionCandidate() throws AlgorithmTimeoutedException, AlgorithmExecutionCanceledException, InterruptedException, AlgorithmException;

	/**
	 *
	 * @return The event indicating the arrival of a new solution candidate
	 * @throws AlgorithmTimeoutedException
	 * @throws AlgorithmExecutionCanceledException
	 * @throws InterruptedException
	 * @throws AlgorithmException
	 */
	public ISolutionCandidateFoundEvent<O> nextSolutionCandidateEvent() throws AlgorithmTimeoutedException, AlgorithmExecutionCanceledException, InterruptedException, AlgorithmException;
}