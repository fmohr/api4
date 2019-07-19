package org.api4.java.datastructure.graph.implicit;

public interface IGraphGenerator<N, A> {

	public RootGenerator<N> getRootGenerator();

	public SuccessorGenerator<N, A> getSuccessorGenerator();
}
