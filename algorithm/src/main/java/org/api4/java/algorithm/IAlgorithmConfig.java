package org.api4.java.algorithm;

import org.api4.java.common.control.IConfig;

/**
 * Defines some basic properties relevant to all algorithms.
 *
 * @author Felix Mohr
 *
 */
public interface IAlgorithmConfig extends IConfig {

	/**
	 * @return Number of CPU cores available for parallelization.
	 */
	public int cpus();

	/**
	 * @return Number of threads that may be spawned by the algorithm. If set to -1, the number of CPUs is used as the number of threads. If set to 0, parallelization is deactivated.
	 */
	public int threads();

	/**
	 * @return The main memory that is available to be used. This is merely a documentation variable since the true memory must be set over the JVM initialization anyway and cannot be restricted inside of it.
	 */
	public int memory();

	/**
	 * @return Overall timeout for the algorithm in milliseconds.
	 */
	public long timeout();
}
