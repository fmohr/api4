package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.algorithm.exceptions.AlgorithmException;

@SuppressWarnings("serial")
public class PathEvaluationException extends AlgorithmException {

	public PathEvaluationException(final String message) {
		super(message);
	}

	public PathEvaluationException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
