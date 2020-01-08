package org.api4.java.datastructure.graph.explicit;

/**
 * Graphs of this type also assign a label to the edges
 *
 * @author Felix Mohr
 *
 * @param <N> Node label type
 * @param <A> Arc label type
 */
public interface ILabeledGraph<N, A> extends IGraph<N> {

	/**
	 * @param from Node from which to depart
	 * @param to Node that is targeted by the edge
	 * @param edge Edge label
	 */
	public void addArc(N from, N to, A edge);

	/**
	 * Gets the label of the edge between two given nodes.
	 *
	 * @param from Node from which to depart
	 * @param to Node that is targeted by the edge
	 * @return The label of the edge between the given nodes (if exists, otherwise an IllegalArgumentException may be thrown)
	 */
	public A getArcLabel(N from, N to);
}
