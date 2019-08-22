package org.api4.java.ai.ml.activelearning;

import org.api4.java.ai.ml.learner.exception.PredictionException;

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
