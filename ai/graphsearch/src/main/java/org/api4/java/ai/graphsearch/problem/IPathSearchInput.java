package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.implicit.graphgenerator.IPathGoalTester;
import org.api4.java.datastructure.graph.implicit.IGraphGenerator;

/**
 * A path search input describes a problem in terms of an implicit graph and a goal tester for paths in that graph.
 * The task is to find a one or more paths in the given graph for which the goal tester evaluates to true.
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 */
public interface IPathSearchInput<N, A> {

	/**
	 * @return The implicit graph definition in form of a graph generator
	 */
	public IGraphGenerator<N, A> getGraphGenerator();

	/**
	 * @return A function that can test whether a given path is a solution path
	 */
	public IPathGoalTester<N, A> getGoalTester();
}
