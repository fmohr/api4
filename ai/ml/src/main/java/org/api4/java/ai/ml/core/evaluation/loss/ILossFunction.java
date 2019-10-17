package org.api4.java.ai.ml.core.evaluation.loss;

import java.util.List;

import org.api4.java.ai.ml.classification.execution.IClassificationPredictionAndGroundTruthTable;

public interface ILossFunction {
	
	public double loss(List<?> expected, List<?> actual);
	
	public double loss(IClassificationPredictionAndGroundTruthTable pairTable);
}
