package org.api4.java.ai.ml.core.dataset.splitter;

import java.util.List;
import java.util.Random;

import org.api4.java.ai.ml.core.dataset.IDataset;

public interface IFoldSizeConfigurableRandomDatasetSplitter<D extends IDataset<?>> {

	public List<D> split(D data, Random random, double... relativeFoldSizes) throws SplitFailedException, InterruptedException;
}
