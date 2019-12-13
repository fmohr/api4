package org.api4.java.ai.ml.core.evaluation.supervised.loss;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface IDeterministicPredictionPerformanceMeasure<E, A> {
	public double loss(List<? extends E> expected, List<? extends A> actual);

	public double loss(IPredictionAndGroundTruthTable<? extends E, ? extends A> pairTable);

	public double score(List<? extends E> expected, List<? extends A> actual);

	public double score(IPredictionAndGroundTruthTable<? extends E, ? extends A> pairTable);
}
