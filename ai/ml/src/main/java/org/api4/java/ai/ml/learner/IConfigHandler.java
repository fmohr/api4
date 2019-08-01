package org.api4.java.ai.ml.learner;

public interface IConfigHandler<C> {

	public void setConfig(C config) throws LearnerConfigurationFailedException, InterruptedException;

}
