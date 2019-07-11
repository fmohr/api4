package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.implicit.graphgenerator.IGraphGenerator;
import org.api4.java.algorithm.IAlgorithm;

/**
 * Graph search algorithms take a graph <N, A> that is given in the form of a graph generator and search it.
 * Usually, the algorithm uses internal wrapper classes to represent edges and nodes, which is why there are
 * additional generics for that.
 *
 * @author fmohr
 *
 * @param <I>
 * @param <O>
 * @param <N>
 * @param <A>
 */
public interface IGraphSearch<I extends IGraphSearchInput<N, A>, O, N, A> extends IAlgorithm<I, O> {
	public IGraphGenerator<N, A> getGraphGenerator();
}
