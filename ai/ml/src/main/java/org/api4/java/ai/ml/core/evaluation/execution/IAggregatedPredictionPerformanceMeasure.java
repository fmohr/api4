package org.api4.java.ai.ml.core.evaluation.execution;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;
import org.api4.java.ai.ml.core.evaluation.supervised.loss.IDeterministicPredictionPerformanceMeasure;

public interface IAggregatedPredictionPerformanceMeasure<E, A> {

	public double loss(List<List<? extends E>> expected, List<List<? extends A>> actual);

	public double loss(List<IPredictionAndGroundTruthTable<? extends E, ? extends A>> pairTables);

	public double score(List<List<? extends E>> expected, List<List<? extends A>> actual);

	public double score(List<IPredictionAndGroundTruthTable<? extends E, ? extends A>> pairTables);

	public IDeterministicPredictionPerformanceMeasure<E, A> getBaseMeasure();
}
