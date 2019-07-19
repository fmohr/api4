package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

import org.api4.java.datastructure.graph.IPath;

public interface PathGoalTester<N, A> {

	/**
	 * Check if the current node is a goal for the problem.
	 *
	 * @param path
	 *            The path to check.
	 * @return <code>true</code> if it is a goal, <code>false</else> otherwise.
	 */
	public boolean isGoal(IPath<N, A> path);
}
