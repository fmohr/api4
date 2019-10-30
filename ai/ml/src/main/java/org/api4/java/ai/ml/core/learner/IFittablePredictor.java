package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.evaluation.IPrediction;
import org.api4.java.ai.ml.core.evaluation.IPredictionBatch;
import org.api4.java.ai.ml.core.exception.PredictionException;
import org.api4.java.ai.ml.core.exception.TrainingException;

public interface IFittablePredictor<I extends IInstance, D extends IDataSource<? extends I>> extends IFittable<I, D>, IPredictor<I, D> {

	public IPrediction fitAndPredict(D dTrain, I xTest) throws TrainingException, PredictionException, InterruptedException;

	public IPredictionBatch fitAndPredict(D dTrain, I[] xTest) throws TrainingException, PredictionException, InterruptedException;

	public IPredictionBatch fitAndPredict(D dTrain, D dTest) throws TrainingException, PredictionException, InterruptedException;

}
