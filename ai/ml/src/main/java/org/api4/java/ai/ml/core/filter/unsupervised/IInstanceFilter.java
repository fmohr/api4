package org.api4.java.ai.ml.core.filter.unsupervised;

/**
 * This filter can be applied to whole datasets and may potentially even modify datasets entirely.
 *
 * @author mwever
 *
 * @param <D> The type of dataset this filter may be applied to.
 */
public interface IInstanceFilter<D> {

	/**
	 * Applies the filter's functionality to a specific dataset.
	 * @param input The datset to be filtered.
	 * @return Returns the filtered dataset.
	 */
	public D apply(D input);

}
