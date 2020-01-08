package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

import org.api4.java.common.attributedobjects.ObjectEvaluationFailedException;

/**
 * This exception can be thrown if some error with the evaluation of the path occurred.
 *
 * @author Felix Mohr
 *
 */
public class PathEvaluationException extends ObjectEvaluationFailedException {

	private static final long serialVersionUID = -755813626368646281L;

	public PathEvaluationException(final String message) {
		super(message);
	}

	public PathEvaluationException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
