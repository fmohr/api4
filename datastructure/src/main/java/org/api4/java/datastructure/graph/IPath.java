package org.api4.java.datastructure.graph;

import java.util.List;

public interface IPath<N, A> {

	public IPath<N, A> getUnmodifiableAccessor();

	public N getRoot();

	public N getHead();

	public N getParentOfHead();

	public void extend(N newHead, A arcToNewHead);

	public void cutHead();

	/**
	 * The difference to cut is that a new object is created
	 * @return
	 */
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
