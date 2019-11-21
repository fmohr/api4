package org.api4.java.ai.ml.core.evaluation.execution;

public class LearnerExecutionFailedException extends Exception {

	private static final long serialVersionUID = 8952892481193885473L;
	
	public LearnerExecutionFailedException(Exception e) {
		super(e);
	}

	public LearnerExecutionFailedException(String message, Exception e) {
		super(message, e);
	}
	
	public LearnerExecutionFailedException(String message) {
		super(message);
	}
}
