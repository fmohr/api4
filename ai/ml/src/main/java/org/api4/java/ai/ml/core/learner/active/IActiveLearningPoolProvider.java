package org.api4.java.ai.ml.core.learner.active;

import java.util.Collection;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;

/**
 * Provides a sample pool for pool-based active learning.
 * @author Jonas Hanselle
 *
 */
public interface IActiveLearningPoolProvider<I extends ILabeledInstance> {
	
	/**
	 * Returns the pool of unlabeled instances.
	 * @return Pool of unlabeled instances.
	 */
	public Collection<I> getPool();
	
	/**
	 * Labels the given instance.
	 * @param queryInstance {@link IInstance} to be labeled.
	 * @return Labeled {@link IInstance}.
	 */
	public I query(I queryInstance);

}
