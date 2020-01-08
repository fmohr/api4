package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.common.attributedobjects.ScoredItem;
import org.api4.java.datastructure.graph.ILabeledPath;

/**
 * An {@link IEvaluatedPath} is an {@link ILabeledPath} associated with a score
 *
 * @author Felix Mohr
 *
 * @param <N> node type
 * @param <A> arc type
 * @param <V> {@link Comparable} type of the score attached to the path
 */
public interface IEvaluatedPath<N, A, V extends Comparable<V>> extends ILabeledPath<N, A>, ScoredItem<V> {

}
