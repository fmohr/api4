package org.api4.java.algorithm.exceptions;

import java.util.concurrent.TimeoutException;

/**
 * This exception can be thrown if a thread enters or resumes the execution of an algorithm whose timeout has been hit.
 *
 * @author Felix Mohr
 *
 */
public class AlgorithmTimeoutedException extends TimeoutException {
	private static final long serialVersionUID = 3505770805898354955L;
	private final long delay;

	/**
	 * @param delay Milliseconds between when the timeout has been noticed and the true deadline (start time + timeout) of the algorithm
	 */
	public AlgorithmTimeoutedException(final long delay) {
		super("Timeout was triggered with a delay of " + delay + "ms.");
		this.delay = delay;
	}

	/**
	 * @return Milliseconds between when the timeout has been noticed and the true deadline (start time + timeout) of the algorithm
	 */
	public long getDelay() {
		return this.delay;
	}
}
