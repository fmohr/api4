package org.api4.java.common.math;

/**
 * A metric is a function defined on a set T which is also called distance function:
 * d: T \times T \rightarrow \mathbb{R} \cup \{ 0, \infty \}
 * Additionally, it is required to hold: 1) non-negativity, 2) identity of indiscernibles, 3) symmetry, and 4) subadditivity aka. triangle inequality.
 *
 * \forall a,b,c \in T it has to hold:
 * 1) d(a,b) \geq 0
 * 2) d(a,b) = 0 \equiv x = y
 * 3) d(a,b) = d(y,x)
 * 4) d(a,c) \leq d(a,b) + d(b,c)
 *
 * @author fmohr, mwever
 *
 * @param <T> The type of objects to calculate a distance between, which defines the set T (see above).
 */
public interface IMetric<T> {

	/**
	 * Computes a distance according to this metric between two given objects.
	 * @param a First object.
	 * @param b Second object.
	 * @return The calculated distance between the two given objects.
	 */
	public double getDistance(T a, T b);

}
