package org.api4.java.datastructure.graph.implicit;

import java.util.List;

/**
 * Creates the descriptions of successor nodes and the edges to them.
 *
 * @author Felix Mohr
 *
 * @param <N>
 * @param <A>
 */
public interface ISuccessorGenerator<N, A> {

	/**
	 * Generate the successors for a given node.
	 *
	 * @param node
	 *            The node we want to expand.
	 * @return A list of possible next steps.
	 */
	public List<INewNodeDescription<N, A>> generateSuccessors(N node) throws InterruptedException;

}
