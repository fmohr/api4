package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

import java.util.List;

public interface SuccessorGenerator<T, A> {

	/**
	 * Generate the successors for a given node.
	 *
	 * @param node
	 *            The node we want to expand.
	 * @return A list of possible next steps.
	 */
	public List<NodeExpansionDescription<T, A>> generateSuccessors(T node) throws InterruptedException;

}
