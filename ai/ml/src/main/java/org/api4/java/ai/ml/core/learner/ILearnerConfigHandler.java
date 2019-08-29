package org.api4.java.ai.ml.core.learner;

import java.util.Map;

import org.api4.java.ai.ml.core.exception.LearnerConfigurationFailedException;

public interface ILearnerConfigHandler {

	/**
	 * Sets the the configuration to the set values.
	 *
	 * @param config
	 * @throws LearnerConfigurationFailedException Thrown, if there were issues regarding the configuration or setting the configuration to the new configs.
	 * @throws InterruptedException Thrown if the handler for setting the configurations is interrupted.
	 */
	public void setConfig(Map<String, Object> config) throws LearnerConfigurationFailedException, InterruptedException;

	/**
	 * @return A key-value map for mapping properties to the respective values.
	 */
	public Map<String, Object> getConfig();

}
