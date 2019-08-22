package org.api4.java.ai.ml.filter.supervised.sampling;

import org.api4.java.ai.ml.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.filter.unsupervised.sampling.ISamplingAlgorithm;

public interface ISupervisedSamplingAlgorithm<I extends ILabeledInstance, D extends ILabeledDataset<I>> extends ISamplingAlgorithm<I, D> {

}
