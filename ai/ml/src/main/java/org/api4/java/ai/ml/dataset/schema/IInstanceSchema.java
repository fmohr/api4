package org.api4.java.ai.ml.dataset.schema;

import org.api4.java.ai.ml.dataset.schema.attribute.IAttribute;

public interface IInstanceSchema {

	public IAttribute getAttribute(final int pos);

	public int getNumAttributes();

}
