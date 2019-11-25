package org.api4.java.ai.ml.classification.singlelabel.learner;

import org.api4.java.ai.ml.classification.IClassifier;
import org.api4.java.ai.ml.classification.singlelabel.evaluation.ISingleLabelClassification;
import org.api4.java.ai.ml.classification.singlelabel.evaluation.ISingleLabelClassificationPredictionBatch;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.exception.PredictionException;
import org.api4.java.ai.ml.core.exception.TrainingException;

/**
 *
 * @author mwever
 *
 */
public interface ISingleLabelClassifier extends IClassifier {

	@Override
	public ISingleLabelClassification fitAndPredict(ILabeledDataset<? extends ILabeledInstance> dTrain, ILabeledInstance xTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPredictionBatch fitAndPredict(ILabeledDataset<? extends ILabeledInstance> dTrain, ILabeledInstance[] xTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPredictionBatch fitAndPredict(ILabeledDataset<? extends ILabeledInstance> dTrain, ILabeledDataset<? extends ILabeledInstance> dTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassification predict(ILabeledInstance xTest) throws PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPredictionBatch predict(ILabeledDataset<? extends ILabeledInstance> dTest) throws PredictionException, InterruptedException;

	@Override
	public ISingleLabelClassificationPredictionBatch predict(ILabeledInstance[] dTest) throws PredictionException, InterruptedException;

}
