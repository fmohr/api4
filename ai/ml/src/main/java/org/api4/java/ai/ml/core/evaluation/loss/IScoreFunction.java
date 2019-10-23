package org.api4.java.ai.ml.core.evaluation.loss;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface IScoreFunction<O, T extends IPredictionAndGroundTruthTable> {

	public double score(List<O> expected, List<O> actual);

	public double score(T pairTable);

}
