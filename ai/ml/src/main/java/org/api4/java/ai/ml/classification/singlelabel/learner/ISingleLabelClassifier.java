package org.api4.java.ai.ml.classification.singlelabel.learner;

import java.util.List;

import org.api4.java.ai.ml.classification.IClassifier;
import org.api4.java.ai.ml.classification.singlelabel.dataset.ISingleLabelClassificationDataset;
import org.api4.java.ai.ml.classification.singlelabel.dataset.ISingleLabelClassificationInstance;
import org.api4.java.ai.ml.core.exception.PredictionException;
import org.api4.java.ai.ml.core.exception.TrainingException;

/**
 *
 * @author mwever
 *
 */
public interface ISingleLabelClassifier extends IClassifier<ISingleLabelClassificationInstance, ISingleLabelClassificationDataset> {

	@Override
	public ISingleLabelClassificationPrediction fitAndPredict(ISingleLabelClassificationDataset dTrain, ISingleLabelClassificationInstance xTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPrediction[] fitAndPredict(ISingleLabelClassificationDataset dTrain, ISingleLabelClassificationInstance[] xTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public List<ISingleLabelClassificationPrediction> fitAndPredict(ISingleLabelClassificationDataset dTrain, ISingleLabelClassificationDataset dTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPrediction predict(ISingleLabelClassificationInstance xTest) throws PredictionException, InterruptedException;

	@Override
	public List<ISingleLabelClassificationPrediction> predict(ISingleLabelClassificationDataset dTest) throws PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPrediction[] predict(ISingleLabelClassificationInstance[] dTest) throws PredictionException, InterruptedException;

}
