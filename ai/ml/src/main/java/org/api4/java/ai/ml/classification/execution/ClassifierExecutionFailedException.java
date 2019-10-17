package org.api4.java.ai.ml.classification.execution;

public class ClassifierExecutionFailedException extends Exception {

	private static final long serialVersionUID = 8952892481193885473L;
	
	public ClassifierExecutionFailedException(Exception e) {
		super(e);
	}

	public ClassifierExecutionFailedException(String message, Exception e) {
		super(message, e);
	}
	
	public ClassifierExecutionFailedException(String message) {
		super(message);
	}
}
