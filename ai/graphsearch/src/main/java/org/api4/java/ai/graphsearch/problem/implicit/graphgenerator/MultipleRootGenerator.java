package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

import java.util.Collection;

public interface MultipleRootGenerator<T> extends RootGenerator<T> {
	public Collection<T> getRoots();
}
