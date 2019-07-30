package org.api4.java.ai.ml.dataset.attribute;

import java.io.Serializable;

/**
 * Wrapper interface for attribute types.
 *
 * @author wever
 *
 */
public interface IAttributeType extends Serializable {

	/**
	 * Validates whether a value conforms to this type.
	 *
	 * @param value
	 *            The value to be validated.
	 * @return Returns true if the given value conforms
	 */
	public boolean isValidValue(Object value);

	/**
	 * Casts the value to the respective type and returns an attribute value with the creating attribute type as the referenced type.
	 *
	 * @param value
	 *            The value of the attribute.
	 * @return An attribute value object holding the value of the attribute and referring to this attribute type.
	 */
	public IAttributeValue buildAttributeValue(Object value);

	/**
	 * @return A description of the attribute types domain.
	 */
	public String getStringDescriptionOfDomain();

}
