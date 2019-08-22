package org.api4.java.ai.ml.dataset.supervised;

import org.api4.java.ai.ml.dataset.IInstance;
import org.api4.java.ai.ml.dataset.schema.ILabeledInstanceSchemaHandler;

/**
 * Interface of an instance that has a target value.
 *
 * @author wever, fmohr
 *
 * <Y> The type of the labeling of this instance.
 */
public interface ILabeledInstance extends IInstance, ILabeledInstanceSchemaHandler {

	/**
	 * Getter for the value of the target attribute.
	 *
	 * @param type The type to bind the value of the target attribute.
	 * @return The value of the target attribute.
	 */
	public Object getLabel();

}
