package org.api4.java.ai.ml.core.evaluation.execution;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.learner.ISupervisedLearner;

public interface ISupervisedLearnerExecutor<D extends ILabeledDataset<?>> {

	public ILearnerRunReport execute(ISupervisedLearner<?, D> learner, D train, D test) throws LearnerExecutionFailedException;

	/**
	 * Here, the classifier is assumed to be trained already
	 **/
	public ILearnerRunReport execute(ISupervisedLearner<?, D> learner, D test) throws LearnerExecutionFailedException;
}
