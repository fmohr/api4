package org.api4.java.ai.ml.core.exception;

public class LearnerConfigurationFailedException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 9153764669868158299L;

	public LearnerConfigurationFailedException() {
		super();
	}

	public LearnerConfigurationFailedException(final String msg) {
		super(msg);
	}

	public LearnerConfigurationFailedException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

	public LearnerConfigurationFailedException(final Throwable cause) {
		super(cause);
	}

}
