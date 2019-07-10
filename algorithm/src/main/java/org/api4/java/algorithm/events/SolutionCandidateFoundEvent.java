package org.api4.java.algorithm.events;

public interface SolutionCandidateFoundEvent<O> extends AlgorithmEvent {
	
	public O getSolutionCandidate();
}
