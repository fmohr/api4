package org.api4.java.datastructure.graph;

public interface ILabeledGraph<N, A> extends IGraph<N> {

	public void addArc(N from, N to, A edge);

	public A getArcLabel(N from, N to);
}
