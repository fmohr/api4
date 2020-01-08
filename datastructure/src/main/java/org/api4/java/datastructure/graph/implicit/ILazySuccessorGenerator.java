package org.api4.java.datastructure.graph.implicit;

import java.util.Iterator;

/**
 * Lazy successor generators are able to produce successor nodes step by step.
 * This can be helpful if the branching factor of a graph is huge and one is only interested in one or few successors of each node.
 *
 * @author Felix Mohr
 *
 * @param <N> Node type
 * @param <A> Arc type
 */
public interface ILazySuccessorGenerator<N, A> extends ISuccessorGenerator<N, A> {

	/**
	 * @param node The node for which the successors should be computed
	 * @return An iterator for the node descriptions of successors
	 */
	public Iterator<INewNodeDescription<N, A>> getIterativeGenerator(N node);
}
