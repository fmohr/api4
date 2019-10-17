package org.api4.java.ai.ml.core.evaluation.loss;

/**
 * A loss function is defined for a domain quantizing the error of an elment in a domain D compared to the ground truth.
 * The function in general has the signature: L: D \times D \rightarrow \R, where D is the considered domain and \R represents the reals.
 * Usually a loss function is normalized to take values from the unit interval [0,1].
 *
 * @author mwever
 *
 * 
 */
public interface IInstanceWiseLossFunction {

	/**
	 * Computes and returns the loss for the given element with respect to the ground truth value.
	 *
	 * @param expected The ground truth value to compare the given element to.
	 * @param actual The element to compare to the expected value.
	 * @return The loss for the given element with respect to the ground truth value.
	 */
	public double loss(Object expected, Object actual);

}
