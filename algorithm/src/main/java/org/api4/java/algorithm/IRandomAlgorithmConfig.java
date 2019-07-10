package org.api4.java.algorithm;

public interface IRandomAlgorithmConfig extends IAlgorithmConfig {

	/**
	 * @return Random seed to be used for execution
	 */
	public long seed();
}
