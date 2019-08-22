package org.api4.java.ai.ml.dataset.schema.attribute;

public interface INumericEncodingAttribute extends IAttribute {

	public double encodeValue(Object attributeValue);

	public Object decodeValue(double encodedAttributeValue);

	public IAttributeValue getAsAttributeValue(double encodedAttributeValue);

}
