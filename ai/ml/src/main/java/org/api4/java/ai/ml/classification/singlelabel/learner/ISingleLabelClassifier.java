package org.api4.java.ai.ml.classification.singlelabel.learner;

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
	public ISingleLabelClassification fitAndPredict(ISingleLabelClassificationDataset dTrain, ISingleLabelClassificationInstance xTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPredictionBatch fitAndPredict(ISingleLabelClassificationDataset dTrain, ISingleLabelClassificationInstance[] xTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPredictionBatch fitAndPredict(ISingleLabelClassificationDataset dTrain, ISingleLabelClassificationDataset dTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassification predict(ISingleLabelClassificationInstance xTest) throws PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPredictionBatch predict(ISingleLabelClassificationDataset dTest) throws PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPredictionBatch predict(ISingleLabelClassificationInstance[] dTest) throws PredictionException, InterruptedException;

}
