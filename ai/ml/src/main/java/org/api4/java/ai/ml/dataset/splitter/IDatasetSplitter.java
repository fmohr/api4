package org.api4.java.ai.ml.dataset.splitter;

import java.util.List;
import java.util.Random;

import org.api4.java.ai.ml.dataset.IDataset;
import org.api4.java.ai.ml.dataset.IInstance;

public interface IDatasetSplitter<I extends IInstance, D extends IDataset<I>> {

	public List<IDataset<I>> split(D data, long seed) throws SplitFailedException, InterruptedException;

	default List<IDataset<I>> split(final D data) throws SplitFailedException, InterruptedException {
		return split(data, new Random().nextLong());
	}

}
