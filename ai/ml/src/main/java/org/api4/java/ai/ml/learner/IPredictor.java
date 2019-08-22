package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IInstance;
import org.api4.java.ai.ml.learner.algorithm.IPrediction;
import org.api4.java.ai.ml.learner.algorithm.IPredictionBatch;
import org.api4.java.ai.ml.learner.exception.PredictionException;

public interface IPredictor<I extends IInstance, D extends IDataSource<I>> {

	public IPrediction predict(I xTest) throws PredictionException, InterruptedException;

	public IPredictionBatch predict(D dTest) throws PredictionException, InterruptedException;

	public IPredictionBatch predict(I[] dTest) throws PredictionException, InterruptedException;

}
