package org.api4.java.ai.ml.core.evaluation.supervised.loss;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface IDeterministicPredictionPerformanceMeasure<S, T> {
	public double loss(List<? extends T> expected, List<? extends S> actual);

	public double loss(IPredictionAndGroundTruthTable<? extends S, ? extends T> pairTable);

	public double score(List<? extends T> expected, List<? extends S> actual);

	public double score(IPredictionAndGroundTruthTable<? extends S, ? extends T> pairTable);
}
