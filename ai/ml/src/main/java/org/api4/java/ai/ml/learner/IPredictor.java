package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.learner.predict.IPrediction;
import org.api4.java.ai.ml.learner.predict.IPredictionBatch;
import org.api4.java.ai.ml.learner.predict.PredictionException;

public interface IPredictor<X, Y, I extends IFeatureInstance<X>, D extends IDataSource<X, I>> {

	public IPrediction<Y> predict(X xTest) throws PredictionException, InterruptedException;

	public IPredictionBatch<Y> predict(D dTest) throws PredictionException, InterruptedException;

	public IPredictionBatch<Y> predict(X[] dTest) throws PredictionException, InterruptedException;
}
