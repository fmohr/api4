package org.api4.java.ai.ml.core.dataset.serialization;

public class UnsupportedAttributeTypeException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 2829544931615021527L;

	public UnsupportedAttributeTypeException() {
	}

	public UnsupportedAttributeTypeException(final String message) {
		super(message);
	}

	public UnsupportedAttributeTypeException(final Throwable cause) {
		super(cause);
	}

	public UnsupportedAttributeTypeException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public UnsupportedAttributeTypeException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
