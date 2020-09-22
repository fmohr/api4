package org.api4.java.ai.ml.core.dataset;

import org.api4.java.ai.ml.core.dataset.schema.IInstanceSchemaHandler;
import org.api4.java.ai.ml.core.exception.DatasetCreationException;
import org.api4.java.common.collection.CastingIterable;

/**
 * The general dataset interface.
 *
 * @author mwever
 */
public interface IDataSource extends IInstanceSchemaHandler, Iterable<IInstance> {

	/**
	 * Creates an empty copy of the dataset with the same meta data.
	 *
	 * @return The newly created dataset.
	 * @throws DatasetCreationException Thrown, if an issue occurred while copying the meta data of the dataset.
	 * @throws InterruptedException Thrown, if the process of copying the meta data of the dataset has been interrupted.
	 */
	public IDataSource createEmptyCopy() throws DatasetCreationException, InterruptedException;

	/**
	 * Creates a copy of the dataset with the same meta data.
	 *
	 * @return The newly created dataset.
	 * @throws DatasetCreationException Thrown, if an issue occurred while copying the meta data of the dataset.
	 * @throws InterruptedException Thrown, if the process of copying the meta data of the dataset has been interrupted.
	 */
	public IDataSource createCopy() throws DatasetCreationException, InterruptedException;


	/**
	 *
	 *
	 * @param <T>
	 * @param clazz
	 * @return
	 */
	public default <T extends IInstance> Iterable<T> asIterable(final Class<T> clazz) {
		return new CastingIterable<>(this);
	}
}
