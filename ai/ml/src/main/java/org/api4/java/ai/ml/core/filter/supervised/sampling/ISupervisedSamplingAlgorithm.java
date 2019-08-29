package org.api4.java.ai.ml.core.filter.supervised.sampling;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;
import org.api4.java.ai.ml.core.filter.unsupervised.sampling.ISamplingAlgorithm;

public interface ISupervisedSamplingAlgorithm<I extends ILabeledInstance, D extends ILabeledDataset<I>> extends ISamplingAlgorithm<I, D> {

}
