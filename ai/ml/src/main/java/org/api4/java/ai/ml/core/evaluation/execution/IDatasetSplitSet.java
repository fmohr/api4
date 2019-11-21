package org.api4.java.ai.ml.core.evaluation.execution;

import java.util.List;

import org.api4.java.ai.ml.core.dataset.IDataset;

public interface IDatasetSplitSet<D extends IDataset<?>> {
	
	public int getNumberOfSplits();
	
	public int getNumberOfFoldsPerSplit();
	
	public List<D> getFolds(int splitId);
}
