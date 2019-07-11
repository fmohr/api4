package org.api4.java.algorithm;

import org.api4.java.common.attributedobjects.ScoredItem;

public interface IOptimizationAlgorithmFactory<I, O extends ScoredItem<V>, V extends Comparable<V>, A extends IOptimizationAlgorithm<I, O, V>> extends IAlgorithmFactory<I, O, A> {

}
