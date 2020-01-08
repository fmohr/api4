package org.api4.java.common.attributedobjects;

/**
 * Exception thrown when an object could not be decorated.
 *
 * @author Felix Mohr
 *
 */
public class DecorationFailedException extends IllegalStateException {

	private static final long serialVersionUID = 7049770724678835590L;

	public DecorationFailedException() {
	}

	public DecorationFailedException(final String s) {
		super(s);
	}

	public DecorationFailedException(final Throwable cause) {
		super(cause);
	}

	public DecorationFailedException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
