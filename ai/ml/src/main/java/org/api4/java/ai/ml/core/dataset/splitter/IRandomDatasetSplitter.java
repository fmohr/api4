package org.api4.java.ai.ml.core.dataset.splitter;

import java.util.List;
import java.util.Random;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.IInstance;

public interface IRandomDatasetSplitter<I extends IInstance, D extends IDataset<I>> extends IDatasetSplitter<I, D> {

	@Override
	public default List<D> split(final D data) throws SplitFailedException, InterruptedException {
		return this.split(data, new Random());
	}

	public List<D> split(D data, Random random) throws SplitFailedException, InterruptedException;
}
