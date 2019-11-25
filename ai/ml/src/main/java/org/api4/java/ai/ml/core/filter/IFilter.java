package org.api4.java.ai.ml.core.filter;

import org.api4.java.ai.ml.core.dataset.supervised.ILabeledDataset;
import org.api4.java.ai.ml.core.dataset.supervised.ILabeledInstance;

public interface IFilter {

	public ILabeledDataset<ILabeledInstance> predict(ILabeledDataset<ILabeledInstance> input) throws InterruptedException, FilterApplicationFailedException;

	public ILabeledDataset<ILabeledInstance> predict(ILabeledInstance input) throws InterruptedException, FilterApplicationFailedException;

}
