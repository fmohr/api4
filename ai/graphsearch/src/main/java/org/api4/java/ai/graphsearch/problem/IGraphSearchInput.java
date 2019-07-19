package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.implicit.graphgenerator.PathGoalTester;
import org.api4.java.datastructure.graph.implicit.IGraphGenerator;

public interface IGraphSearchInput<N, A> {
	public IGraphGenerator<N, A> getGraphGenerator();

	public PathGoalTester<N, A> getGoalTester();
}
