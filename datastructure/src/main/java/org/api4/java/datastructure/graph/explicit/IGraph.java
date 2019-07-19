package org.api4.java.datastructure.graph.explicit;

import java.util.Collection;

public interface IGraph<N> {

	public Collection<N> getNodes();

	public boolean contains(N node);

	public void addNode(N node);

	public void removeNode(N node);

	public void addEdge(N from, N to);

	public void removeEdge(N from, N to);

	public Collection<N> getSuccessors(N node);

	public Collection<N> getPredecessors(N node);
}
