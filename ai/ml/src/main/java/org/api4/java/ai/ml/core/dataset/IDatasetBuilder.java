package org.api4.java.ai.ml.core.dataset;

import org.api4.java.ai.ml.core.IDatasetDescriptor;
import org.api4.java.ai.ml.core.exception.DatasetCreationException;

public interface IDatasetBuilder {
	public IDataset<? extends IInstance> getDataset(IDatasetDescriptor descriptor) throws DatasetCreationException;
}
