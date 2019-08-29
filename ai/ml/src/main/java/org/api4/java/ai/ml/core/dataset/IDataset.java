package org.api4.java.ai.ml.core.dataset;

import java.util.List;

import org.api4.java.ai.ml.core.exception.DatasetCreationException;

public interface IDataset<I extends IInstance> extends IDataSource<I>, List<I> {

	@Override
	public IDataset<I> createEmptyCopy() throws DatasetCreationException, InterruptedException;

	public I get(int pos);

	public Object[][] getFeatureMatrix();

}
