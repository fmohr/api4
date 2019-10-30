package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.evaluation.IPrediction;
import org.api4.java.ai.ml.core.evaluation.IPredictionBatch;
import org.api4.java.ai.ml.core.exception.PredictionException;

public interface IPredictor<I extends IInstance, D extends IDataSource<? extends I>> {

	public IPrediction predict(I xTest) throws PredictionException, InterruptedException;

	public IPredictionBatch predict(D dTest) throws PredictionException, InterruptedException;

	public IPredictionBatch predict(I[] dTest) throws PredictionException, InterruptedException;

}
