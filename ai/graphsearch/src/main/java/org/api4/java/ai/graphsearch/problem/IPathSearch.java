package org.api4.java.ai.graphsearch.problem;

import org.api4.java.algorithm.IAlgorithm;
import org.api4.java.datastructure.graph.implicit.IGraphGenerator;

/**
 * Graph search algorithms take a graph <N, A> that is given in the form of a graph generator and search it.
 *
 * @author Felix Mohr
 *
 * @param <I> type of graph search input
 * @param <O> type of output
 * @param <N> type of nodes
 * @param <A> type of arcs
 */
public interface IPathSearch<I extends IPathSearchInput<N, A>, O, N, A> extends IAlgorithm<I, O> {

	/**
	 * This is a shortcut method. The graph generator can also obtained via getInput().getGraphGenerator()
	 *
	 * @return The graph generator used in the problem.
	 */
	public IGraphGenerator<N, A> getGraphGenerator();
}
