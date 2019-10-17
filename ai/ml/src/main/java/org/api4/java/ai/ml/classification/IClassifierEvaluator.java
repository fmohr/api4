package org.api4.java.ai.ml.classification;

import org.api4.java.common.attributedobjects.IObjectEvaluator;

public interface IClassifierEvaluator<C extends IClassifier<?, ?>> extends IObjectEvaluator<C, Double> {
}