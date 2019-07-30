package org.api4.java.ai.ml.dataset.attribute.nominal;

import java.util.List;

import org.api4.java.ai.ml.dataset.attribute.IAttributeType;

public interface INominalAttributeType extends IAttributeType {

	public List<String> getValues();

}
