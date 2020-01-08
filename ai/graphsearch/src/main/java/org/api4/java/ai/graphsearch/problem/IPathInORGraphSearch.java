package org.api4.java.ai.graphsearch.problem;

import org.api4.java.algorithm.ISolutionCandidateIterator;
import org.api4.java.datastructure.graph.ILabeledPath;

public interface IPathInORGraphSearch<I extends IPathSearchInput<N, A>, O extends ILabeledPath<N, A>, N, A> extends IPathSearch<I, O, N, A>, ISolutionCandidateIterator<I, O> {

}
