package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IInstance;
import org.api4.java.ai.ml.learner.algorithm.IPrediction;
import org.api4.java.ai.ml.learner.algorithm.IPredictionBatch;
import org.api4.java.ai.ml.learner.exception.PredictionException;
import org.api4.java.ai.ml.learner.exception.TrainingException;

public interface IFittablePredictor<I extends IInstance, D extends IDataSource<I>> extends IFittable<I, D>, IPredictor<I, D> {

	public IPrediction fitAndPredict(D dTrain, I xTest) throws TrainingException, PredictionException, InterruptedException;

	public IPredictionBatch fitAndPredict(D dTrain, I[] xTest) throws TrainingException, PredictionException, InterruptedException;

	public IPredictionBatch fitAndPredict(D dTrain, D dTest) throws TrainingException, PredictionException, InterruptedException;

}
