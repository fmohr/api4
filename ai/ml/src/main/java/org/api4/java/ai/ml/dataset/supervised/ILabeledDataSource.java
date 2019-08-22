package org.api4.java.ai.ml.dataset.supervised;

import org.api4.java.ai.ml.dataset.IDataSource;
import org.api4.java.ai.ml.dataset.schema.ILabeledInstanceSchemaHandler;

/**
 * The supervised dataset is a list (ordered collection) of instances. As this is a supervised
 * dataset the instances are required to be labeled.
 *
 * @author mwever
 *
 * @param <X> The type of the (entire) feature description of a single instance.
 * @param <Y> The type of the label of a single instance.
 * @param <I> The type of instance that implements both ILabeledInstance and IFeatureInstance.
 */
public interface ILabeledDataSource<I extends ILabeledInstance> extends IDataSource<I>, ILabeledInstanceSchemaHandler {

}
