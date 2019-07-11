package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.implicit.graphgenerator.IPath;
import org.api4.java.algorithm.ISolutionCandidateIterator;

public interface IPathInORGraphSearch<I extends IGraphSearchInput<N, A>, O extends IPath<N, A>, N, A> extends IGraphSearch<I, O, N, A>, ISolutionCandidateIterator<I, O> {

}
