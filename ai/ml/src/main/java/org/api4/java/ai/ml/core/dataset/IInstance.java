package org.api4.java.ai.ml.core.dataset;

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
public interface IInstance {

	/**
	 *
	 * @param pos The position of the feature that is to be returned.
	 * @return The feature value at position <code>pos</code>.
	 */
	public Object getAttributeValue(int pos);

	public Object[] getAttributes();

	public double[] getPoint();

	public default double getPointValue(int pos) {
		return getPoint()[pos];
	}

	public void removeColumn(int columnPos);

	/**
	 * Sets the value of the attribute at position <code>pos</code> to a new value as provided as an argument.
	 * 
	 * @param pos The position where to replace the current value with the new value.
	 * @param value The new attribute value (to replace the previous value).
	 */
	public void setAttributeValue(final int pos, final Object value);

}
