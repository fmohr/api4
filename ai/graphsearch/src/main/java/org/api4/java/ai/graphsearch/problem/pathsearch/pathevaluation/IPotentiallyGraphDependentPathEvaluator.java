package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.ai.graphsearch.problem.implicit.graphgenerator.PathGoalTester;
import org.api4.java.datastructure.graph.implicit.IGraphGenerator;

public interface IPotentiallyGraphDependentPathEvaluator<T, A, V extends Comparable<V>> extends IPathEvaluator<T, A, V> {
	public boolean requiresGraphGenerator();

	public void setGenerator(IGraphGenerator<T, A> generator, PathGoalTester<T, A> goalTester);
}
