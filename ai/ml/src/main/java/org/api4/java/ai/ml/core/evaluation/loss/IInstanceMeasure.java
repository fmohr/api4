package org.api4.java.ai.ml.core.evaluation.loss;

public interface IInstanceMeasure<O> {

	public double loss(O expected, O actual);

	public double score(O expected, O actual);

}
