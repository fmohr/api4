package org.api4.java.ai.ml.core.dataset.serialization;

import java.io.File;

import org.api4.java.ai.ml.core.dataset.IDataset;

/**
 * A dataset deserializer reads in the contents of a file to return it as a dataset object.
 *
 * @author mwever
 *
 * @param <D> The type of dataset to be deserialized.
 */
public interface IDatasetDeserializer<D extends IDataset<?>> {

	public D deserializeDataset(final File datasetFile) throws DatasetDeserializationFailedException, InterruptedException;

}
