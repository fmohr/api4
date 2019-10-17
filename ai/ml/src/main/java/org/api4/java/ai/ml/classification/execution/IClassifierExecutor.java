package org.api4.java.ai.ml.classification.execution;

import org.api4.java.ai.ml.classification.IClassifier;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;

public interface IClassifierExecutor<D extends ILabeledDataset<?>> {
	public IClassifierRunReport execute(IClassifier<?, D> classifier, D train, D test) throws ClassifierExecutionFailedException;
}
