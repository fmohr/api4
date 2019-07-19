package org.api4.java.ai.graphsearch.problem;

import java.util.List;

import org.api4.java.datastructure.graph.implicit.IGraphGenerator;

/**
 * This is an extension of the classical GraphGenerator that allows to assert that a path is semantically subsumed by another.
 * This is important if it is not trivially checkable whether two states are identical due to deviating object names of semantically equivalent objects. 
 * 
 * @author fmohr
 *
 * @param <N>
 * @param <A>
 */
public interface PathUnifyingGraphGenerator<N, A> extends IGraphGenerator<N, A> {
	public boolean isPathSemanticallySubsumed(List<N> path, List<N> potentialSuperPath) throws InterruptedException;
}
