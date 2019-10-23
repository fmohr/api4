package org.api4.java.ai.ml.core.evaluation.loss;

import java.util.List;

import org.api4.java.ai.ml.core.evaluation.IPredictionAndGroundTruthTable;

public interface ILossFunction<O, T extends IPredictionAndGroundTruthTable<O>> {

	public double loss(List<O> actual, List<O> expected);

	public double loss(T pairTable);
}
