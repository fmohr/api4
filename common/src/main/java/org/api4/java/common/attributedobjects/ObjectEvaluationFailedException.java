package org.api4.java.common.attributedobjects;

/**
 * Exception thrown if an object value (score) could not be computed.
 *
 * @author Felix Mohr
 *
 */
public class ObjectEvaluationFailedException extends GetPropertyFailedException {

	private static final long serialVersionUID = -5853009214657373288L;

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
