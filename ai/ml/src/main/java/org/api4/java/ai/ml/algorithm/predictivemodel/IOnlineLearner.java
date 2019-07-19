package org.api4.java.ai.ml.algorithm.predictivemodel;

import java.util.Set;

import org.api4.java.ai.ml.algorithm.TrainingException;
import org.api4.java.ai.ml.core.dataset.IDataset;

/**
 * The {@link IOnlineLearner} models a learning algorithm which works in an
 * online fashion, i.e. takes either a single {@link IInstance} or a {@link Set}
 * thereof as training input.
 *
 * @author Alexander Hetzer, Julian Lienen
 *
 * @param <T>
 *            The type of the target that this {@link IOnlineLearner} predicts.
 * @param <I>
 *            The type of the instances stored in the data set specified by the generic parameter <D>.
 * @param <D>
 *            The type of the data set used to learn from and predict batches.
 */
public interface IOnlineLearner<T, I, D extends IDataset<I>> extends IBatchLearner<T, I, D> {

	/**
	 * Updates this {@link IOnlineLearner} based on the given {@link Set} of
	 * {@link IInstance}s.
	 *
	 * @param instances
	 *            The {@link Set} of {@link IInstance}s the update should be based
	 *            on.
	 * @throws TrainingException
	 *             If something fails during the update process.
	 */
	public void update(Set<I> instances) throws TrainingException;

	/**
	 * Updates this {@link IOnlineLearner} based on the given {@link IInstance}.
	 *
	 * @param instance
	 *            The {@link IInstance} the update should be based on.
	 * @throws TrainingException
	 *             If something fails during the update process.
	 */
	public void update(I instance) throws TrainingException;
}
