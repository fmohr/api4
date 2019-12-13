package org.api4.java.ai.ml.core.evaluation;

import org.api4.java.ai.ml.core.evaluation.supervised.loss.IDeterministicPredictionPerformanceMeasure;

public interface IPredictionPerformanceMetricConfigurable<E, A> {

	public void setMeasure(IDeterministicPredictionPerformanceMeasure<E, A> measure);
}
