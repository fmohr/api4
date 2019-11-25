package org.api4.java.ai.ml.core.filter;

public class FilterApplicationFailedException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -7443375457925037838L;

	public FilterApplicationFailedException() {
		super();
	}

	public FilterApplicationFailedException(final String message) {
		super(message);
	}

	public FilterApplicationFailedException(final Throwable cause) {
		super(cause);
	}

	public FilterApplicationFailedException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public FilterApplicationFailedException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
