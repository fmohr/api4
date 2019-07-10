package org.api4.java.algorithm.exceptions;

@SuppressWarnings("serial")
public class AlgorithmExecutionCanceledException extends Exception {
	private final long delay;
	
	public AlgorithmExecutionCanceledException(long delay) {
		super();
		this.delay = delay;
	}
	
	public AlgorithmExecutionCanceledException(String message, long delay) {
		super(message);
		this.delay = delay;
	}

	public long getDelay() {
		return delay;
	}
}
