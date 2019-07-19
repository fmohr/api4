package org.api4.java.datastructure.graph;

import java.util.List;

public interface IPath<N, A> {

	public N getRoot();

	public N getHead();

	public IPath<N, A> getPathToParentOfHead();

	public List<N> getNodes();

	public List<A> getArcs();
}
