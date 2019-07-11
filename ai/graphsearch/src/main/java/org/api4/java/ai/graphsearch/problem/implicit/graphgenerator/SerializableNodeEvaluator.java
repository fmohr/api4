package org.api4.java.ai.graphsearch.problem.implicit.graphgenerator;

import java.io.Serializable;

import org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation.IPathEvaluator;

public interface SerializableNodeEvaluator<T, A, V extends Comparable<V>> extends IPathEvaluator<T, A, V>, Serializable {

}
