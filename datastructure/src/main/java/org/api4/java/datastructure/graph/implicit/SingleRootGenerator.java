package org.api4.java.datastructure.graph.implicit;

import java.util.Arrays;
import java.util.Collection;

public interface SingleRootGenerator<N> extends RootGenerator<N> {
	public N getRoot();

	@Override
	default Collection<N> getRoots() {
		return Arrays.asList(getRoot());
	}
}
