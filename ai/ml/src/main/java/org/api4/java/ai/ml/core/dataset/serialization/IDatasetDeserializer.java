package org.api4.java.ai.ml.core.dataset.serialization;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.descriptor.IDatasetDescriptor;

/**
 * A dataset deserializer reads in the contents of a file to return it as a dataset object.
 *
 * @author mwever, Felix Mohr
 *
 */
public interface IDatasetDeserializer {

	public IDataset deserializeDataset(final IDatasetDescriptor datasetDescription) throws DatasetDeserializationFailedException, InterruptedException;

}
