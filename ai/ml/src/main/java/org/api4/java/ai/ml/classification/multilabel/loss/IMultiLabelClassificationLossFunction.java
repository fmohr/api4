package org.api4.java.ai.ml.classification.multilabel.loss;

import java.util.Set;

import org.api4.java.ai.ml.core.evaluation.loss.IInstanceWiseLossFunction;

public interface IMultiLabelClassificationLossFunction extends IInstanceWiseLossFunction {
	public double loss(Set<String> expected, Set<String> actual);
}
