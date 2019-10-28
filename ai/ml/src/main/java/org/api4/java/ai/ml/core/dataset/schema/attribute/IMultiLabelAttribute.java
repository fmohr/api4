package org.api4.java.ai.ml.core.dataset.schema.attribute;

import java.util.List;

public interface IMultiLabelAttribute extends IAttribute {

	@Override
	public IMultiLabelAttributeValue getAsAttributeValue(Object obj);

	public List<String> getValues();

}
