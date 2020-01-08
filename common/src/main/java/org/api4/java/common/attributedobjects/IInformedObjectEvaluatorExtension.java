package org.api4.java.common.attributedobjects;

/**
 * To be used with {@link IObjectEvaluator} if the evaluation depends on the the best value seen so far
 * for other evaluations.
 *
 * @author Felix Mohr
 *
 */
public interface IInformedObjectEvaluatorExtension<V extends Comparable<V>> {
	public void informAboutBestScore(V bestScore);
}