package org.api4.java.ai.ml.dataset;

import java.util.List;

import org.api4.java.ai.ml.dataset.attribute.IAttributeType;

/**
 * The general dataset interface.
 *
 * @author mwever
 */
public interface IDataSource<X, I extends IFeatureInstance<X>> extends Iterable<I> {

	/**
	 * Creates an empty copy of the dataset with the same meta data.
	 *
	 * @return The newly created dataset.
	 * @throws DatasetCreationException Thrown, if an issue occurred while copying the meta data of the dataset.
	 * @throws InterruptedException Thrown, if the process of copying the meta data of the dataset has been interrupted.
	 */
	public IDataSource<X, I> createEmptyCopy() throws DatasetCreationException, InterruptedException;

	/**
	 * @return The list of attribute types which describe the features of an instance.
	 */
	public List<IAttributeType> getFeatureTypes();

	/**
	 * @return The number of features of an instance.
	 */
	public int getNumFeatures();

}
