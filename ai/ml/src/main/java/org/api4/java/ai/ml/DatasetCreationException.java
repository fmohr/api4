package org.api4.java.ai.ml;

@SuppressWarnings("serial")
public class DatasetCreationException extends Exception {
	public DatasetCreationException(Throwable e) {
		super(e);
	}
	
	public DatasetCreationException(String message, Throwable e) {
		super(message, e);
	}
}
