package org.api4.java.ai.ml.core.dataset.schema.attribute;

public interface ICategoricalAttributeValue extends IAttributeValue {

	@Override
	public String getValue();

	@Override
	public ICategoricalAttribute getAttribute();

}
