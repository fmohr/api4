package org.api4.java.ai.ml.core.dataset.schema.attribute;

import java.io.Serializable;

/**
 * Wrapper interface for attribute types.
 *
 * @author wever
 *
 */
public interface IAttribute extends Serializable {

	/**
	 * Validates whether a value conforms to this type.
	 *
	 * @param value
	 *            The value to be validated.
	 * @return Returns true if the given value conforms
	 */
	public boolean isValidValue(Object value);

	/**
	 * @return A description of the attribute types domain.
	 */
	public String getStringDescriptionOfDomain();

	/**
	 * @return The name of the attribute.
	 */
	public String getName();

	public IAttributeValue getAsAttributeValue(Object object);

	public double toDouble(Object object);

	public String serializeAttributeValue(final Object value);

	public Object deserializeAttributeValue(final String string);

}
