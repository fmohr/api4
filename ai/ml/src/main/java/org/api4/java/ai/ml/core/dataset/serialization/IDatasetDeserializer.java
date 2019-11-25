package org.api4.java.ai.ml.core.dataset.serialization;

import org.api4.java.ai.ml.core.dataset.IDataset;
import org.api4.java.ai.ml.core.dataset.descriptor.IDatasetDescriptor;

/**
 * A dataset deserializer reads in the contents of a file to return it as a dataset object.
 *
 * @author mwever
 *
 * @param <D> The type of dataset to be deserialized.
 */
public interface IDatasetDeserializer<D extends IDataset<?>> {

	public D deserializeDataset(final IDatasetDescriptor datasetFile) throws DatasetDeserializationFailedException, InterruptedException;

}
