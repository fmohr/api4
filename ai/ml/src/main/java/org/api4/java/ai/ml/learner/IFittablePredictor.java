package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.IFeatureInstance;
import org.api4.java.ai.ml.learner.fit.TrainingException;
import org.api4.java.ai.ml.learner.predict.IPrediction;
import org.api4.java.ai.ml.learner.predict.IPredictionBatch;
import org.api4.java.ai.ml.learner.predict.PredictionException;

public interface IFittablePredictor<X, Y, I extends IFeatureInstance<X>, D extends IDataSource<X, I>> {

	public IPrediction<Y> fitAndPredict(D dTrain, X xTest) throws TrainingException, PredictionException, InterruptedException;

	public IPredictionBatch<Y> fitAndPredict(D dTrain, X[] xTest) throws TrainingException, PredictionException, InterruptedException;

	public IPredictionBatch<Y> fitAndPredict(D dTrain, D dTest) throws TrainingException, PredictionException, InterruptedException;

}
