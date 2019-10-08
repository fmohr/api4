package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.exception.PredictionException;

public interface IPredictor<I extends IInstance, D extends IDataSource<I>> {

	public Object predict(I xTest) throws PredictionException, InterruptedException;

	public Object predict(D dTest) throws PredictionException, InterruptedException;

	public Object predict(I[] dTest) throws PredictionException, InterruptedException;

}
