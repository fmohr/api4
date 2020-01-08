package org.api4.java.common.control;

/**
 * This interface can be implemented by process classes.
 * It allows to configure the number of CPUs that may be used by the process.
 *
 * @author Marcel Wever
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
