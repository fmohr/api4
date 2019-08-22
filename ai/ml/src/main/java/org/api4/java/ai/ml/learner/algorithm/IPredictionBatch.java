package org.api4.java.ai.ml.learner.algorithm;

public interface IPredictionBatch {

	public IPrediction get(int pos);

	public int getNumPredictions();

}
