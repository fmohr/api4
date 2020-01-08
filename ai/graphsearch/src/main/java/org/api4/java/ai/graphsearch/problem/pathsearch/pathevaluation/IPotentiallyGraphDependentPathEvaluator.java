package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.ai.graphsearch.problem.implicit.graphgenerator.IPathGoalTester;
import org.api4.java.datastructure.graph.implicit.IGraphGenerator;

/**
 * Some path evaluators may need to know the graph in order to assign a score.
 * They can declare this (potential) need by implementing this interface.
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 * @param <V> {@link Comparable} type of the score attached to the path
 */
public interface IPotentiallyGraphDependentPathEvaluator<N, A, V extends Comparable<V>> extends IPathEvaluator<N, A, V> {

	/**
	 * @return <code>true</code> iff it needs to know the graph.
	 */
	public boolean requiresGraphGenerator();

	/**
	 * @param generator The graph generator for the search problem
	 * @param goalTester The path goal tester for the search problem
	 */
	public void setGenerator(IGraphGenerator<N, A> generator, IPathGoalTester<N, A> goalTester);
}
