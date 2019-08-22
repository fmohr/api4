package org.api4.java.ai.ml.dataset.schema.attribute;

import java.util.Set;

public interface IMultiLabelAttributeValue extends IAttributeValue {

	@Override
	public Set<String> getValue();

}
