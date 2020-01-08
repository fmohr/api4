package org.api4.java.datastructure.graph.implicit;

import java.util.Arrays;
import java.util.Collection;

/**
 * This is a root generator for implicit graphs with just one source.
 *
 * @author Felix Mohr
 *
 * @param <N> Node type
 */
public interface ISingleRootGenerator<N> extends IRootGenerator<N> {

	/**
	 * @return The root node.
	 */
	public N getRoot();

	@Override
	default Collection<N> getRoots() {
		return Arrays.asList(this.getRoot());
	}
}
