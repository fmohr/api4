package org.api4.java.algorithm;

/**
 * Algorithm factories are used to create new instances of algorithms.
 * This is often necessary, because {@link IAlgorithm} does not provide a setter for the problem input but indirectly tries to enforce final inputs that are delievered when the algorithm is created.
 * This can be a problem if we want to dynamically create new algorithms, which is the purpose of algorithm factories.
 *
 * @author Felix Mohr
 *
 * @param <I> Input type of the algorithm
 * @param <A> Algorithm type
 */
public interface IAlgorithmFactory<I, A extends IAlgorithm> {

	/**
	 * @return An instance of the algorithm class based on the current configuration of the factory
	 */
	public A getAlgorithm();

	/**
	 * @param input The input for which the algorithm should be created
	 * @return An instance of the algorithm class based on the current configuration of the factory and the given input.
	 */
	public A getAlgorithm(I input);
}
