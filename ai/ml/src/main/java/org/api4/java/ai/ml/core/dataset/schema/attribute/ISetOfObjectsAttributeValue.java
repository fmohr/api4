package org.api4.java.ai.ml.core.dataset.schema.attribute;

import java.util.Set;

public interface ISetOfObjectsAttributeValue<O> extends IObjectAttributeValue<Set<O>> {

	@Override
	public Set<O> getValue();
}
