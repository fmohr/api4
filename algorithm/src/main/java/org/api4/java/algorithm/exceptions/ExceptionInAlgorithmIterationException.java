package org.api4.java.algorithm.exceptions;

/**
 * This exception is used to wrap exceptions that are thrown within a step of the algorithm execution.
 * This wrapping is necessary, because algorithms are iterators, and the next()-method cannot throw checked exceptions.
 *
 * @author Felix Mohr
 *
 */
public class ExceptionInAlgorithmIterationException extends RuntimeException {
	private static final long serialVersionUID = 4105360941584886356L;

	/**
	 * @param e The exception that occurred during the iteration of the algorithm.
	 */
	public ExceptionInAlgorithmIterationException(final Exception e) {
		super(e);
	}
}
