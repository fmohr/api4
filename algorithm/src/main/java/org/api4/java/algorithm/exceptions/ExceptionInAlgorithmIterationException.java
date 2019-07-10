package org.api4.java.algorithm.exceptions;

@SuppressWarnings("serial")
public class ExceptionInAlgorithmIterationException extends RuntimeException {
	public ExceptionInAlgorithmIterationException(final Exception e) {
		super(e);
	}
}
