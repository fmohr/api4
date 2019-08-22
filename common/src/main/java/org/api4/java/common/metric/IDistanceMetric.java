package org.api4.java.common.metric;

/**
 * Interface that describes a distance measure of two time series.
 *
 * @author fischor
 */
public interface IDistanceMetric {

	/**
	 * Calculates the distance between two time series.
	 *
	 * @param a First time series.
	 * @param b Second time series.
	 * @return Distance between the first and second time series.
	 */
	public double distance(double[] a, double[] b);
}