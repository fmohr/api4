package org.api4.java.ai.ml.core.dataset.schema.attribute;

import java.util.Collection;

public interface IMultiLabelAttributeValue extends IAttributeValue {

	@Override
	public Collection<String> getValue();

}
