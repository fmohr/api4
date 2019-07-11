package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

import java.util.List;

public interface IPath<N, A> {

	public N getRoot();

	public N getHead();

	public IPath<N, A> getPathToParentOfHead();

	public List<N> getNodes();

	public List<A> getArcs();
}
