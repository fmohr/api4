package org.api4.java.ai.ml.classification.execution;

import java.util.Collection;

import org.api4.java.common.attributedobjects.IObjectEvaluator;

public interface IClassifierMetric extends IObjectEvaluator<Collection<? extends IClassifierRunReport>, Double> {
	
	@Override
	default Double evaluate(Collection<? extends IClassifierRunReport> reports) {
		return evaluateToDouble(reports);
	}
	
	public double evaluateToDouble(Collection<? extends IClassifierRunReport> reports);
}
