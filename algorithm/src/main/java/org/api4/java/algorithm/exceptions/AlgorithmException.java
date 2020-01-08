package org.api4.java.algorithm.exceptions;

/**
 * A general exception that can be thrown if some semantic error occurs in the execution of an algorithm (step).
 *
 * @author Felix Mohr
 *
 */
public class AlgorithmException extends Exception {

	private static final long serialVersionUID = 5614683542580329711L;

	public AlgorithmException(final String message) {
		super(message);
	}

	public AlgorithmException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
