package org.api4.java.algorithm;

import org.api4.java.common.attributedobjects.ScoredItem;

public interface IOptimizationAlgorithmFactory<I,O extends ScoredItem<V>, V extends Comparable<V>> extends IAlgorithmFactory<I, O> {

	@Override
	public IOptimizationAlgorithm<I, O, V> getAlgorithm();

	@Override
	public IOptimizationAlgorithm<I, O, V> getAlgorithm(I input);
}
