package org.api4.java.common.attributedobjects;

/**
 * Exception thrown when a property could not be fetched.
 *
 * @author Felix Mohr
 */
public class GetPropertyFailedException extends Exception {

	private static final long serialVersionUID = 7031748772115192681L;

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
