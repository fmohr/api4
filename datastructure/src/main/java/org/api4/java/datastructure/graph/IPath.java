package org.api4.java.datastructure.graph;

import java.util.List;

/**
 * A path is a kind of list for items of some node type N.
 * It is not a list, because it is not meant to be modifiable except at the end (similar to a stack).
 *
 * On a simple path, the edges have no label. An IPath with edge labels is defined in {@link ILabeledPath}.
 *
 * @author Felix Mohr
 *
 * @param <N> The type of elements on the nodes of the path.
 */
public interface IPath<N> {

	/**
	 * Creates an accessor to the path that cannot be changed.
	 * This can be useful for getters that want to return an immutable path.
	 *
	 * @return The unmodifiable accessor of the path.
	 */
	public IPath<N> getUnmodifiableAccessor();

	/**
	 * @return The first node of the path.
	 */
	public N getRoot();

	/**
	 * @return The last node of the path.
	 */
	public N getHead();

	/**
	 * @return The second-last node of the path (predecessor of head).
	 */
	public N getParentOfHead();

	/**
	 * Modifies the path by adding a new node at the end.
	 *
	 * @param newHead The new head of the path.
	 */
	public void extend(N newHead);

	/**
	 * Modifies the path by removing the last node of the path (the head).
	 */
	public void cutHead();

	/**
	 * Creates a new path object that is identical to the current path except that the head is removed.
	 * This is equivalent to creating a copy of the current path and invoke cutHead() on it.
	 *
	 * @return The copy of the current path with the head being the parent of the head of the current path.
	 */
	public IPath<N> getPathToParentOfHead();

	/**
	 * Creates a new path object that is identical to the current path except that the root is removed.
	 *
	 * @return The copy of the current path with the root being the second node of the current path.
	 */
	public IPath<N> getPathFromChildOfRoot();

	/**
	 * @return The nodes of the path as a list.
	 */
	public List<N> getNodes();

	/**
	 * @return true iff there is one point on the path
	 */
	public boolean isPoint();

	/**
	 * @return The number of nodes on the path
	 */
	public int getNumberOfNodes();

	/**
	 * @param node
	 * @return true iff there is a node on the path with this label
	 */
	public boolean containsNode(N node);
}
