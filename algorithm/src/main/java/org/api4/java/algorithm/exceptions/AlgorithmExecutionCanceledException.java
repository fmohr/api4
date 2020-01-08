package org.api4.java.algorithm.exceptions;

/**
 * This exception can be thrown by a thread that starts or resumes the execution of an algorithms that has been canceled.
 *
 * @author Felix Mohr
 *
 */
public class AlgorithmExecutionCanceledException extends Exception {

	private static final long serialVersionUID = 965939948209428512L;

	private final long delay;

	/**
	 * @param delay The difference between the current time and the time when the algorithm was canceled
	 */
	public AlgorithmExecutionCanceledException(final long delay) {
		super();
		this.delay = delay;
	}

	/**
	 *
	 * @param message Additional message for the exception.
	 * @param delay The difference between the current time and the time when the algorithm was canceled
	 */
	public AlgorithmExecutionCanceledException(final String message, final long delay) {
		super(message);
		this.delay = delay;
	}

	/**
	 * @return The difference between the creation of this exception and the time when the algorithm was canceled.
	 */
	public long getDelay() {
		return this.delay;
	}
}
