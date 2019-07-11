package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.ai.graphsearch.problem.implicit.graphgenerator.IPath;
import org.api4.java.common.attributedobjects.ScoredItem;

public interface IEvaluatedPath<N, A, V extends Comparable<V>> extends IPath<N, A>, ScoredItem<V> {

}
