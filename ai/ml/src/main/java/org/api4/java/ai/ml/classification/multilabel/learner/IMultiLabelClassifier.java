package org.api4.java.ai.ml.classification.multilabel.learner;

import org.api4.java.ai.ml.classification.IClassifier;
import org.api4.java.ai.ml.classification.multilabel.evaluation.IMultiLabelClassification;
import org.api4.java.ai.ml.classification.multilabel.evaluation.IMultiLabelClassificationPredictionBatch;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.exception.PredictionException;
import org.api4.java.ai.ml.core.exception.TrainingException;

public interface IMultiLabelClassifier extends IClassifier {

	@Override
	public IMultiLabelClassification fitAndPredict(ILabeledDataset<? extends ILabeledInstance> dTrain, ILabeledInstance xTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public IMultiLabelClassificationPredictionBatch fitAndPredict(ILabeledDataset<? extends ILabeledInstance> dTrain, ILabeledInstance[] xTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public IMultiLabelClassificationPredictionBatch fitAndPredict(ILabeledDataset<? extends ILabeledInstance> dTrain, ILabeledDataset<? extends ILabeledInstance> dTest) throws TrainingException, PredictionException, InterruptedException;

	@Override
	public IMultiLabelClassification predict(ILabeledInstance xTest) throws PredictionException, InterruptedException;

	@Override
	public IMultiLabelClassificationPredictionBatch predict(ILabeledDataset<? extends ILabeledInstance> dTest) throws PredictionException, InterruptedException;

	@Override
	public IMultiLabelClassificationPredictionBatch predict(ILabeledInstance[] dTest) throws PredictionException, InterruptedException;

}
