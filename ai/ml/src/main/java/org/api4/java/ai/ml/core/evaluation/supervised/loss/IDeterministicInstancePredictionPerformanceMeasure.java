package org.api4.java.ai.ml.core.evaluation.supervised.loss;

public interface IDeterministicInstancePredictionPerformanceMeasure<O, P> {

	public double loss(P expected, O actual);

	public double score(P expected, O actual);

}
