package org.api4.java.ai.ml.core.dataset.splitter;

import java.util.List;
import java.util.Random;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.IInstance;

public interface IDatasetSplitter<I extends IInstance, D extends IDataset<I>> {

	public List<D> split(D data, long seed) throws SplitFailedException, InterruptedException;

	default List<D> split(final D data) throws SplitFailedException, InterruptedException {
		return this.split(data, new Random().nextLong());
	}

}
