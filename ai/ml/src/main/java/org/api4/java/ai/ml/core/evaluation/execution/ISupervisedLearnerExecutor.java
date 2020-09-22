package org.api4.java.ai.ml.core.evaluation.execution;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.learner.ISupervisedLearner;

public interface ISupervisedLearnerExecutor {

	public ILearnerRunReport execute(ISupervisedLearner learner, IDataset train, IDataset test) throws LearnerExecutionFailedException, LearnerExecutionInterruptedException;

	/**
	 * Here, the classifier is assumed to be trained already
	 **/
	public ILearnerRunReport execute(ISupervisedLearner learner, IDataset test) throws LearnerExecutionFailedException, LearnerExecutionInterruptedException;
}
