package org.api4.java.datastructure.graph.implicit;

/**
 * A graph can be implicitly represented by a (set of) source node(s), called the root(s), and a function that generates the successor nodes for any given node.
 * A graph generator provides these two functions.
 *
 * @author Felix Mohr
 *
 * @param <N> Node type
 * @param <A> Arc type
 */
public interface IGraphGenerator<N, A> {

	/**
	 * @return The generator for the root(s) of the graph.
	 */
	public IRootGenerator<N> getRootGenerator();

	/**
	 * @return The successor node generator for the graph.
	 */
	public ISuccessorGenerator<N, A> getSuccessorGenerator();
}
