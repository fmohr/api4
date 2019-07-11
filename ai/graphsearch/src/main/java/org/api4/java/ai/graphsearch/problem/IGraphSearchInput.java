package org.api4.java.ai.graphsearch.problem;

import org.api4.java.ai.graphsearch.problem.implicit.graphgenerator.IGraphGenerator;

public interface IGraphSearchInput<N, A> {
	public IGraphGenerator<N, A> getGraphGenerator();
}
