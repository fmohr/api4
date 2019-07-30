package org.api4.java.ai.ml.dataset;

/**
 * Instances implementing this interface have a feature description of the type X.
 * Usually, feature descriptions are realized via double arrays. However, here it
 * is also allowed to specify feature descriptions which are heteregoneous (e.g., a
 * time series with single values) and may consist of complex objects (e.g., lists, arrays, graphs).
 *
 * @author mwever
 *
 * @param <X> The type of the feature description of a single instance.
 */
public interface IFeatureInstance<X> extends Iterable<X> {

	/**
	 *
	 * @param pos The position of the feature that is to be returned.
	 * @return The feature value at position <code>pos</code>.
	 */
	public X get(int pos);

	public int getNumFeatures();

}
