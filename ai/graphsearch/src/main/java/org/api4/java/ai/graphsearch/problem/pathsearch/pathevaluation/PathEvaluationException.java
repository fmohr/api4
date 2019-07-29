package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.common.attributedobjects.ObjectEvaluationFailedException;

@SuppressWarnings("serial")
public class PathEvaluationException extends ObjectEvaluationFailedException {

	public PathEvaluationException(final String message) {
		super(message);
	}

	public PathEvaluationException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
