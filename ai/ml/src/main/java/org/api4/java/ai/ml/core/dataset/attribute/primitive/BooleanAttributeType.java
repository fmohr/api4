package org.api4.java.ai.ml.core.dataset.attribute.primitive;

import org.api4.java.ai.ml.core.dataset.attribute.IAttributeValue;

/**
 * The boolean attribute type.
 *
 * @author wever
 *
 */
public class BooleanAttributeType implements IPrimitiveAttributeType<Boolean> {

	@Override
	public boolean isValidValue(final Boolean value) {
		return true;
	}

	@Override
	public IAttributeValue<Boolean> buildAttributeValue(final Object value) {
		return this.buildAttributeValue(value.toString());
	}

	@Override
	public IAttributeValue<Boolean> buildAttributeValue(final String stringDescription) {
		return new BooleanAttributeValue(new BooleanAttributeType(), Boolean.valueOf(stringDescription));
	}

	public IAttributeValue<Boolean> buildAttributeValue(final boolean value) {
		return new BooleanAttributeValue(new BooleanAttributeType(), value);
	}

	@Override
	public String getStringDescriptionOfDomain() {
		return "[true, false]";
	}
}
