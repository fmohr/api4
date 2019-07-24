package org.api4.java.datastructure.graph;

import java.util.List;

public interface IPath<N, A> {

	public N getRoot();

	public N getHead();

	public IPath<N, A> getPathToParentOfHead();

	public IPath<N, A> getPathFromChildOfRoot();

	public List<N> getNodes();

	public boolean isPoint();

	public int getNumberOfNodes();

	public List<A> getArcs();

	public A getInArc(N node);

	public A getOutArc(N node);

	public boolean containsNode(N node);
}
