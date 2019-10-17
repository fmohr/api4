package org.api4.java.ai.ml.classification.singlelabel.loss;

import org.api4.java.ai.ml.core.evaluation.loss.IInstanceWiseLossFunction;

public interface IClassificationLossFunction extends IInstanceWiseLossFunction {
	default double loss(Object expected, Object actual) {
		throw new IllegalArgumentException("Expected value and actual value must both be integers.");
	}
	
	public double loss(int expected, int actual);
}
