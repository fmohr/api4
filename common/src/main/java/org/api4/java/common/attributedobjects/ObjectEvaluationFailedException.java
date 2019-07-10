package org.api4.java.common.attributedobjects;

@SuppressWarnings("serial")
public class ObjectEvaluationFailedException extends GetPropertyFailedException {

	public ObjectEvaluationFailedException(final String message) {
		super(message);
	}

	public ObjectEvaluationFailedException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ObjectEvaluationFailedException(final Throwable cause) {
		super(cause);
	}
}
