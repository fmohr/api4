package org.api4.java.ai.ml.core.dataset;

/**
 * IDatasetDescriptors describe with a string how a dataset should be constructed (including data acquisition and algorithmic transformations)
 *
 * @author fmohr
 *
 */
public interface IDatasetDescriptor {

	public String getDatasetDescription();

}
