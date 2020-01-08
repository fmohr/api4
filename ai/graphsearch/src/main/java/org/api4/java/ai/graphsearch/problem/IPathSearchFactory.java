package org.api4.java.ai.graphsearch.problem;

import org.api4.java.algorithm.IAlgorithmFactory;

/**
 * A factory for graph search algorithms
 *
 * @author Felix Mohr
 *
 * @param <I> graph search input for the algorithm
 * @param <O> output produced
 * @param <N> node type
 * @param <A> arc type
 * @param <A2> type of the algorithm produced by the factory
 */
public interface IPathSearchFactory<I extends IPathSearchInput<N, A>, O, N, A, A2 extends IPathSearch<I, O, N, A>> extends IAlgorithmFactory<I, O, A2> {

}
