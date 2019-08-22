package org.api4.java.ai.ml.learner;

import org.api4.java.ai.ml.learner.exception.LearnerConfigurationFailedException;

public interface ILearnerConfigHandler<C> {

	public void setConfig(C config) throws LearnerConfigurationFailedException, InterruptedException;

}
