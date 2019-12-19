package org.api4.java.ai.ml.core.evaluation;

import org.api4.java.ai.ml.core.evaluation.supervised.loss.IDeterministicPredictionPerformanceMeasure;

public interface IPredictionPerformanceMetricConfigurable {

	public void setMeasure(IDeterministicPredictionPerformanceMeasure<?, ?> measure);
}
