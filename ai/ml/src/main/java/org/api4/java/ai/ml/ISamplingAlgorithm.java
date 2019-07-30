package org.api4.java.ai.ml;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.algorithm.IAlgorithm;

/**
 * Interface for sampling algorithms. Sampling algorithms take a dataset as input and return a (reduced) dataset as their output.
 *
 * @author fmohr
 *
 */
public interface ISamplingAlgorithm<D extends IDataSource> extends IAlgorithm<D, D> {

}
