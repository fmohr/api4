package org.api4.java.ai.ml.core.evaluation.execution;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.splitter.SplitFailedException;

public interface IDatasetSplitSetGenerator<D extends IDataset> {

	public int getNumSplitsPerSet();

	public int getNumFoldsPerSplit();

	public IDatasetSplitSet<D> nextSplitSet(D data) throws InterruptedException, SplitFailedException;
}
