package org.api4.java.ai.ml.core.dataset.supervised;

import org.api4.java.ai.ml.core.dataset.IInstance;

/**
 * Interface of an instance that has a target value.
 *
 * @author wever, fmohr
 *
 * <Y> The type of the labeling of this instance.
 */
public interface ILabeledInstance extends IInstance {

	/**
	 * Getter for the value of the target attribute.
	 *
	 * @param type The type to bind the value of the target attribute.
	 * @return The value of the target attribute.
	 */
	public Object getLabel();

	/**
	 * Tells whether the label is really there.
	 *
	 * @return
	 */
	default public boolean isLabelPresent() {
		return this.getLabel() != null;
	}

	/**
	 * Sets the label of this instance to a new value as provided as an argument.
	 *
	 * @param obj The new label value for this instance.
	 */
	public void setLabel(Object obj);

	/**
	 * Sets the value of the attribute at position <code>pos</code> to a new value as provided as an argument.
	 * @param pos The position where to replace the current value with the new value.
	 * @param value The new attribute value (to replace the previous value).
	 */
	@Override
	public void setAttributeValue(final int pos, final Object value);

}
