package org.api4.java.datastructure.graph.implicit;

import java.util.Collection;

/**
 * Creates the root node(s) for a graph.
 *
 * @author Felix Mohr
 *
 * @param <N> Node type
 */
public interface IRootGenerator<N> {

	/**
	 * @return The set of roots
	 */
	public Collection<N> getRoots();
}
