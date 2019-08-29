package org.api4.java.ai.ml.core.dataset.splitter;

public class SplitFailedException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 3072948291769986376L;

	public SplitFailedException() {
		super();
	}

	public SplitFailedException(final String msg) {
		super(msg);
	}

	public SplitFailedException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

	public SplitFailedException(final Throwable cause) {
		super(cause);
	}

}
