package org.api4.java.ai.ml.core.learner.active;

import org.api4.java.ai.ml.core.exception.PredictionException;

/**
 * A strategy for selective sampling.
 * @author Jonas Hanselle
 *
 */
public interface ISelectiveSamplingStrategy<I> {

	/**
	 * Chooses the {@link IInstance} to query next.
	 * @return {@link IInstance} to query next.
	 * @throws InterruptedException
	 * @throws PredictionException
	 */
	public I nextQueryInstance() throws PredictionException, InterruptedException;

}
