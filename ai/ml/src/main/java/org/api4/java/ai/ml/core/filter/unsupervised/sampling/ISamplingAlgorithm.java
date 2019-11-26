package org.api4.java.ai.ml.core.filter.unsupervised.sampling;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.exception.DatasetCreationException;
import org.api4.java.algorithm.IAlgorithm;

/**
 * Interface for sampling algorithms. Sampling algorithms take a dataset as input and return a (reduced) dataset as their output.
 *
 * @author fmohr
 *
 */
public interface ISamplingAlgorithm<D extends IDataset<?>> extends IAlgorithm<D, D> {

	public D nextSample() throws DatasetCreationException, InterruptedException;

	public D getComplementOfLastSample() throws DatasetCreationException, InterruptedException;
}
