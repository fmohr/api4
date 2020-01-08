package org.api4.java.datastructure.kvstore;

/**
 * A filter transforms a given object into another one.
 *
 * @author Marcel Wever
 */
public interface IKVFilter {

	/**
	 * @param value Original object
	 * @return Transformed object
	 */
	public Object filter(Object value);

}
