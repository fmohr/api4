package org.api4.java.algorithm.exceptions;

@SuppressWarnings("serial")
public class AlgorithmException extends Exception {
	public AlgorithmException(final String message) {
		super(message);
	}

	public AlgorithmException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
