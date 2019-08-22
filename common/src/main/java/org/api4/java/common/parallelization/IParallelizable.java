package org.api4.java.common.parallelization;

/**
 *
 * @author mwever
 */
public interface IParallelizable {

	/**
	 * Sets the number of CPU cores that can be used for parallel computation
	 *
	 * @param numberOfCPUs The number of CPU cores that can be used for paralllel computation.
	 */
	public void setNumCPUs(int numberOfCPUs);

	/**
	 * @return The number of CPUs that can be used to carry out computations in parallel.
	 */
	public int getNumCPUs();

}
