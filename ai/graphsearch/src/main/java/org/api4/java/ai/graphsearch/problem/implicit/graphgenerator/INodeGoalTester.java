package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

import org.api4.java.datastructure.graph.ILabeledPath;

/**
 * This is a specific {@link IPathGoalTester} that is able to decide whether a path is a goal path only based on its head.
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 */
public interface INodeGoalTester<N, A> extends IPathGoalTester<N, A> {

	/**
	 * Check if the current node is a goal for the problem.
	 *
	 * @param node
	 *            The node to check.
	 * @return <code>true</code> if it is a goal, <code>false</else> otherwise.
	 */
	public boolean isGoal(N node);

	@Override
	default boolean isGoal(final ILabeledPath<N, A> path) {
		return this.isGoal(path.getHead());
	}
}
