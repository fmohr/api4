package org.api4.java.ai.ml.core.evaluation.supervised.loss;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

/**
 * This interface is for performance measures applied to deterministic predictions (the learner has to commit to one label).
 *
 * @author Felix Mohr
 *
 * @param <O> the class of objects representing the labels
 */
public interface IDeterministicPredictionPerformanceMeasure<O> {

	public double loss(List<O> actual, List<O> expected);

	public double loss(IPredictionAndGroundTruthTable<O> pairTable);

	public double score(List<O> expected, List<O> actual);

	public double score(IPredictionAndGroundTruthTable<O> pairTable);
}
