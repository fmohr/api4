package org.api4.java.ai.ml.core.evaluation.execution;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.splitter.SplitFailedException;

public interface IFixedDatasetSplitSetGenerator<D extends IDataset> extends IDatasetSplitSetGenerator<D> {

	@Override
	public default IDatasetSplitSet<D> nextSplitSet(final D data) {
		throw new IllegalStateException("This method should not be called with a dataset as an argument, because the data is fixed here.");
	}

	public D getDataset();

	public IDatasetSplitSet<D> nextSplitSet() throws InterruptedException, SplitFailedException;
}
