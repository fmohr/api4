package org.api4.java.common.complexity;

/**
 * Interface that describes the complexity measure of a time series.
 *
 * @author fischor
 */
public interface ITimeSeriesComplexity {

	public double complexity(double[] t);
}