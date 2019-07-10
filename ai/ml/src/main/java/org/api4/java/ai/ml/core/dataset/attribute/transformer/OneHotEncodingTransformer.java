package org.api4.java.ai.ml.core.dataset.attribute.transformer;

import org.api4.java.ai.ml.core.dataset.attribute.IAttributeValue;
import org.api4.java.ai.ml.core.dataset.attribute.categorical.CategoricalAttributeType;
import org.api4.java.ai.ml.core.dataset.attribute.categorical.CategoricalAttributeValue;

public class OneHotEncodingTransformer implements ISingleAttributeTransformer {

	@Override
	public double[] transformAttribute(final IAttributeValue<?> attributeToTransform) {
		if (!(attributeToTransform instanceof CategoricalAttributeValue)) {
			throw new IllegalArgumentException("Can only perform One Hot Encoding for categorical attributes.");
		}

		CategoricalAttributeValue att = (CategoricalAttributeValue) attributeToTransform;
		CategoricalAttributeType type = (CategoricalAttributeType) att.getType();

		double[] oneHotEncoding = new double[type.getDomain().size()];
		oneHotEncoding[type.getDomain().indexOf(att.getValue())] = 1.0;

		return oneHotEncoding;
	}

}
