package org.api4.java.ai.ml.core.dataset.schema.attribute;

import java.util.List;

public interface INominalAttribute extends IAttribute {

	public List<String> getValues();

	public boolean isBinary();

	@Override
	public INominalAttributeValue getAsAttributeValue(Object obj);

}
