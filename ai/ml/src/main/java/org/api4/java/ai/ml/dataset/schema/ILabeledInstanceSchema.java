package org.api4.java.ai.ml.dataset.schema;

import org.api4.java.ai.ml.dataset.schema.attribute.IAttribute;

public interface ILabeledInstanceSchema extends IInstanceSchema {

	public IAttribute getLabelAttribute();

}
