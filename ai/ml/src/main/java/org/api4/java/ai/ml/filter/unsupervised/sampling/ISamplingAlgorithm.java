package org.api4.java.ai.ml.filter.unsupervised.sampling;

import org.api4.java.ai.ml.dataset.IDataset;
import org.api4.java.ai.ml.dataset.IInstance;
import org.api4.java.algorithm.IAlgorithm;

/**
 * Interface for sampling algorithms. Sampling algorithms take a dataset as input and return a (reduced) dataset as their output.
 *
 * @author fmohr
 *
 */
public interface ISamplingAlgorithm<I extends IInstance, D extends IDataset<I>> extends IAlgorithm<D, D> {

}
