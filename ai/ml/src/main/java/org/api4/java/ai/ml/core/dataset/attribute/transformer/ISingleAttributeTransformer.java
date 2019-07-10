package org.api4.java.ai.ml.core.dataset.attribute.transformer;

import org.api4.java.ai.ml.core.dataset.attribute.IAttributeValue;

public interface ISingleAttributeTransformer {

	public double[] transformAttribute(IAttributeValue<?> attributeToTransform);

}
