package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.common.attributedobjects.ScoredItem;
import org.api4.java.datastructure.graph.ILabeledPath;

public interface IEvaluatedPath<N, A, V extends Comparable<V>> extends ILabeledPath<N, A>, ScoredItem<V> {

}
