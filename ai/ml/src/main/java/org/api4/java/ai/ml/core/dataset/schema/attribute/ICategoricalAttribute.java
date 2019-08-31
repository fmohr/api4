package org.api4.java.ai.ml.core.dataset.schema.attribute;

import java.util.List;

public interface ICategoricalAttribute extends IAttribute {

	public List<String> getValues();

	public boolean isBinary();

	@Override
	public ICategoricalAttributeValue getAsAttributeValue(Object obj);

}
