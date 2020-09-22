package org.api4.java.ai.ml.core.learner;

import org.api4.java.ai.ml.core.dataset.IDataSource;
import org.api4.java.ai.ml.core.dataset.IInstance;
import org.api4.java.ai.ml.core.evaluation.IPrediction;
import org.api4.java.ai.ml.core.evaluation.IPredictionBatch;
import org.api4.java.ai.ml.core.exception.PredictionException;
import org.api4.java.ai.ml.core.exception.TrainingException;

public interface IFittablePredictor extends IFittable, IPredictor {

	public IPrediction fitAndPredict(IDataSource dTrain, IInstance xTest) throws TrainingException, PredictionException, InterruptedException;

	public IPredictionBatch fitAndPredict(IDataSource dTrain, IInstance[] xTest) throws TrainingException, PredictionException, InterruptedException;

	public IPredictionBatch fitAndPredict(IDataSource dTrain, IDataSource dTest) throws TrainingException, PredictionException, InterruptedException;
}
