package org.api4.java.ai.ml.learner.predict;

public interface IPredictionBatch<Y> {

	public Y get(int pos);

	public int getNumPredictions();

}
