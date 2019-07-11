package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

public interface NodeGoalTester<N, A> extends PathGoalTester<N, A> {

	/**
	 * Check if the current node is a goal for the problem.
	 *
	 * @param node
	 *            The node to check.
	 * @return <code>true</code> if it is a goal, <code>false</else> otherwise.
	 */
	public boolean isGoal(N node);

	@Override
	default boolean isGoal(final IPath<N,A> path) {
		return isGoal(path.getHead());
	}
}
