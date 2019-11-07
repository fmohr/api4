package org.api4.java.ai.ml.core.filter.unsupervised;

/**
 * This filter can be applied to single instances and may potentially even modify instances entirely.
 *
 * @author mwever
 * @param <I> The type of instance this filter may be applied to.
 */
public interface IDatasetFilter<I> {

	/**
	 * Applies the filter's functionality to a specific instance.
	 * @param input The instance to be filtered.
	 * @return Returns the filtered instance.
	 */
	public I apply(I input);

}
