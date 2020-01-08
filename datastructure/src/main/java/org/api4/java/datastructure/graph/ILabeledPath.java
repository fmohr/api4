package org.api4.java.datastructure.graph;

import java.util.List;

/**
 * Same as {@link IPath} only that the edges can have labels.
 *
 * @author Felix Mohr
 *
 * @param <N> Type of node labels.
 * @param <A> Type of arcs/edge labels.
 */
public interface ILabeledPath<N, A> extends IPath<N> {

	public ILabeledPath<N, A> getUnmodifiableAccessor();

	/**
	 * Like in {@link IPath}, but the new arc is labeled as well.
	 *
	 * @param newHead
	 * @param arcToNewHead
	 */
	public void extend(N newHead, A arcToNewHead);

	@Override
	public ILabeledPath<N, A> getPathToParentOfHead();

	@Override
	public ILabeledPath<N, A> getPathFromChildOfRoot();

	/**
	 * @return The list of labels of the arcs in the order of the path.
	 */
	public List<A> getArcs();

	/**
	 * @param node
	 * @return The label of the arc leading to the given node
	 */
	public A getInArc(N node);

	/**
	 * @param node
	 * @return The label of the arc going away from the given node
	 */
	public A getOutArc(N node);
}
