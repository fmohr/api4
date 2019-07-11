package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

public interface IGraphGenerator<T, A> {

	public RootGenerator<T> getRootGenerator();

	public SuccessorGenerator<T, A> getSuccessorGenerator();

	public PathGoalTester<T, A> getGoalTester();
}
