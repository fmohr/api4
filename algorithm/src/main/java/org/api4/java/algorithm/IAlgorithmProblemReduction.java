package org.api4.java.algorithm;

/**
 * A reduction is able to transform an instance I1 of problem 1 into an instance I2 of problem 2, and to decode a solution O2 of problem 2 into a solution O1 of problem 1.
 * A reduction is literally a reduction in the sense of complexity theory complemented by a solution decoder.
 *
 * @author Felix Mohr
 *
 * @param <I1> type of problem instances of original problem
 * @param <O1> type of solutions of original problem
 * @param <I2> type of problem instances of reduced problem
 * @param <O2> type of solutions of reduced problem
 */
public interface IAlgorithmProblemReduction<I1, O1, I2, O2> {

	/**
	 * @param problem Instance of the original problem
	 * @return Instance of the reduced problem
	 */
	public I2 encodeProblem(I1 problem);

	/**
	 * @param solution Solution to the reduced problem
	 * @return Solution to the original problem
	 */
	public O1 decodeSolution(O2 solution);
}
