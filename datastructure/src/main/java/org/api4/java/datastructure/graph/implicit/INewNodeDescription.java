package org.api4.java.datastructure.graph.implicit;

/**
 * Describes a new node and the edge to it that are to be added to an explicit graph model.
 *
 * @author Felix Mohr
 *
 * @param <N> Node type
 * @param <A> Arc type
 */
public interface INewNodeDescription<N, A> {

	/**
	 * @return The predecessor of the new node.
	 */
	public N getFrom();

	/**
	 * @return The new node
	 */
	public N getTo();

	/**
	 * @return The label of the edge between the expanded node and the node that is created
	 */
	public A getArcLabel();
}
