package org.api4.java.ai.ml.core.learner;

import java.util.List;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.exception.PredictionException;
import org.api4.java.ai.ml.core.exception.TrainingException;

public interface IFittablePredictor<I extends IInstance, D extends IDataSource<I>> extends IFittable<I, D>, IPredictor<I, D> {

	public Object fitAndPredict(D dTrain, I xTest) throws TrainingException, PredictionException, InterruptedException;

	public Object[] fitAndPredict(D dTrain, I[] xTest) throws TrainingException, PredictionException, InterruptedException;

	public List<?> fitAndPredict(D dTrain, D dTest) throws TrainingException, PredictionException, InterruptedException;

}
