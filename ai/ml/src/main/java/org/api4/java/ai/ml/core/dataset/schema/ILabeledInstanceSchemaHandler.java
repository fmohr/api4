package org.api4.java.ai.ml.core.dataset.schema;

import org.api4.java.ai.ml.core.dataset.schema.attribute.IAttribute;

public interface ILabeledInstanceSchemaHandler extends IInstanceSchemaHandler {

	@Override
	public ILabeledInstanceSchema getInstanceSchema();

	public default IAttribute getLabelAttribute() {
		return this.getInstanceSchema().getLabelAttribute();
	}

}
