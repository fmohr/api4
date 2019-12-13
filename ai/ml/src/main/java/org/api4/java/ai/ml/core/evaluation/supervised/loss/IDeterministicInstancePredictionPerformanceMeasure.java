package org.api4.java.ai.ml.core.evaluation.supervised.loss;

public interface IDeterministicInstancePredictionPerformanceMeasure<O> {

	public double loss(O expected, O actual);

	public double score(O expected, O actual);

}
