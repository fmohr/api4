package org.api4.java.common.reconstruction;

public class ReconstructionException extends Exception {
	public ReconstructionException(final String message, final Exception e) {
		super(message, e);
	}

	public ReconstructionException(final String message) {
		super(message);
	}

	public ReconstructionException(final Exception e) {
		super(e);
	}
}
