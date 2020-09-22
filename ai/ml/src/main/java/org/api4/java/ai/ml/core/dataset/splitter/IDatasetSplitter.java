package org.api4.java.ai.ml.core.dataset.splitter;

import java.util.List;

import org.api4.java.ai.ml.core.dataset.IDataset;

public interface IDatasetSplitter<D extends IDataset> {

	public List<D> split(D data) throws SplitFailedException, InterruptedException;

	public int getNumberOfFoldsPerSplit();
}
