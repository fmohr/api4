package org.api4.java.algorithm;

import org.api4.java.algorithm.events.SolutionCandidateFoundEvent;
import org.api4.java.algorithm.exceptions.AlgorithmException;
import org.api4.java.algorithm.exceptions.AlgorithmExecutionCanceledException;
import org.api4.java.algorithm.exceptions.AlgorithmTimeoutedException;

public interface ISolutionCandidateIterator<I, O> extends IAlgorithm<I, O> {
	public O nextSolutionCandidate() throws AlgorithmTimeoutedException, AlgorithmExecutionCanceledException, InterruptedException, AlgorithmException;
	public SolutionCandidateFoundEvent<O> nextSolutionCandidateEvent() throws AlgorithmTimeoutedException, AlgorithmExecutionCanceledException, InterruptedException, AlgorithmException;
}
