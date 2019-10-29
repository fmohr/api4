package org.api4.java.ai.ml.core.dataset.schema.attribute;

public interface INumericAttribute extends IAttribute {

	@Override
	public INumericAttributeValue getAsAttributeValue(Object object);

}
