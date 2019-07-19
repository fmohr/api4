package org.api4.java.ai.ml.core.dataset;

import org.api4.java.ai.ml.core.dataset.attribute.IAttributeValue;

public interface INumericArrayInstance extends IAttributeArrayInstance {
	public IAttributeValue<Double> getAttributeValue(int position);

	/**
	 * Turns the instance into a double vector.
	 *
	 * @return The instance as a double vector.
	 *
	 * @throws ContainsNonNumericAttributesException
	 *             Thrown if the instance is to be converted into a double vector and still contains non-numeric attributes.
	 */
	public double[] getAsDoubleVector() throws ContainsNonNumericAttributesException;
}
