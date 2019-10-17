package org.api4.java.ai.ml.core.dataset.splitter;

import java.util.List;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.IInstance;

public interface IDatasetSplitter<I extends IInstance, D extends IDataset<I>> {

	public List<D> split(D data) throws SplitFailedException, InterruptedException;

	public int getNumberOfFoldsPerSplit();
}
