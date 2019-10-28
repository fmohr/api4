package org.api4.java.ai.ml.core.dataset.schema;

import org.api4.java.ai.ml.core.dataset.schema.attribute.IAttribute;

public interface ILabeledInstanceSchema extends IInstanceSchema {

	public IAttribute getLabelAttribute();

	public void replaceLabelAttribute(IAttribute labelAttribute);

	@Override
	public ILabeledInstanceSchema getCopy();

}
