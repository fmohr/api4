package org.api4.java.ai.graphsearch.problem.pathsearch.pathevaluation;

/**
 * It is possible that a path evaluator is complex in the sense that it is multi-threaded.
 * In such a case, it should implement this interface as to be canceled if its execution should be stopped.
 *
 * @author Felix Mohr
 *
 */
public interface ICancelablePathEvaluator {

	public void cancelActiveTasks();
}
