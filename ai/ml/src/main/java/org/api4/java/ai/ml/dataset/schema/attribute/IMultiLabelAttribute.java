package org.api4.java.ai.ml.dataset.schema.attribute;

public interface IMultiLabelAttribute extends IAttribute {

	@Override
	public IMultiLabelAttributeValue getAsAttributeValue(Object obj);

}
