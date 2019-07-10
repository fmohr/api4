package org.api4.java.common.attributedobjects;

@SuppressWarnings("serial")
public class GetPropertyFailedException extends Exception {

	public GetPropertyFailedException(final Throwable cause) {
		super(cause);
	}

	public GetPropertyFailedException(final String message) {
		super(message);
	}

	public GetPropertyFailedException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
