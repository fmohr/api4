package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

import org.api4.java.datastructure.graph.ILabeledPath;

/**
 * Tests if a given path is a goal for the problem.
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 */
public interface IPathGoalTester<N, A> {

	/**
	 * @param path The path to check.
	 * @return <code>true</code> if it is a goal, <code>false</else> otherwise.
	 */
	public boolean isGoal(ILabeledPath<N, A> path);
}
