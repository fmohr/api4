package org.api4.java.ai.ml.core.dataset.descriptor;

/**
 * IDatasetDescriptors describe with a string how a dataset should be constructed (including data acquisition and algorithmic transformations)
 *
 * @author fmohr
 *
 */
public interface IDatasetDescriptor {

	public Object getDatasetDescription();

}
