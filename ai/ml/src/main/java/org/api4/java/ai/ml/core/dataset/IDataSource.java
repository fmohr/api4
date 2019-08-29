package org.api4.java.ai.ml.core.dataset;

import org.api4.java.ai.ml.core.dataset.schema.IInstanceSchemaHandler;
import org.api4.java.ai.ml.core.exception.DatasetCreationException;

/**
 * The general dataset interface.
 *
 * @author mwever
 */
public interface IDataSource<I extends IInstance> extends IInstanceSchemaHandler, Iterable<I> {

	/**
	 * Creates an empty copy of the dataset with the same meta data.
	 *
	 * @return The newly created dataset.
	 * @throws DatasetCreationException Thrown, if an issue occurred while copying the meta data of the dataset.
	 * @throws InterruptedException Thrown, if the process of copying the meta data of the dataset has been interrupted.
	 */
	public IDataSource<I> createEmptyCopy() throws DatasetCreationException, InterruptedException;

}
