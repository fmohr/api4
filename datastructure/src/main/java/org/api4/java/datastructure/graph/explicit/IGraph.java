package org.api4.java.datastructure.graph.explicit;

import java.util.Collection;

/**
 * A graph in which the nodes are labeled.
 *
 * @author Felix Mohr
 *
 * @param <N> The type of node labels.
 */
public interface IGraph<N> {

	/**
	 * @return The collection of node labels contained in the graph.
	 */
	public Collection<N> getNodes();

	/**
	 * @param node
	 * @return true iff there is a node with the given label in the graph.
	 */
	public boolean contains(N node);

	/**
	 * Adds a new node to the graph
	 *
	 * @param node The label for the new node.
	 */
	public void addNode(N node);

	/**
	 * Removes an existing node from the graph
	 *
	 * @param node Label of the node to be removed
	 */
	public void removeNode(N node);

	/**
	 * Adds an edge between two nodes in the graph.
	 * It is not necessary that the nodes have been added before.
	 * If they have not been part of the graph, they are added automatically.
	 *
	 * @param from Node where the edge departs
	 * @param to Node targeted by the edge
	 */
	public void addEdge(N from, N to);

	/**
	 * Removes an existing edge from the graph.
	 * Nodes without an edge are not removed from the graph.
	 *
	 * @param from Node where the edge departs
	 * @param to Node targeted by the edge
	 */
	public void removeEdge(N from, N to);

	/**
	 * Gets all nodes that are reachable over one edge from a given node.
	 *
	 * @param node The node from which to depart
	 * @return Collection of nodes reachable in one step
	 */
	public Collection<N> getSuccessors(N node);

	/**
	 * Gets all nodes from which a given node is reachable using one edge.
	 *
	 * @param node The node to be reached
	 * @return Collection of nodes from which the given node can be reached with one edge
	 */
	public Collection<N> getPredecessors(N node);
}
