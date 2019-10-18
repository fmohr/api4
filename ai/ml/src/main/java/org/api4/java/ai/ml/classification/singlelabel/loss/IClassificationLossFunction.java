package org.api4.java.ai.ml.classification.singlelabel.loss;

import org.api4.java.ai.ml.core.evaluation.loss.ILossFunction;

public interface IClassificationLossFunction extends ILossFunction {
	default double loss(final Object expected, final Object actual) {
		throw new IllegalArgumentException("Expected value and actual value must both be integers.");
	}
}
