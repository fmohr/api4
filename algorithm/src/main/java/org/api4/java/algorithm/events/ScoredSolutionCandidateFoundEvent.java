package org.api4.java.algorithm.events;

public interface ScoredSolutionCandidateFoundEvent<O, V extends Comparable<V>> extends SolutionCandidateFoundEvent<O> {
	public V getScore();
}
