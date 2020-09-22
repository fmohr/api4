package org.api4.java.common.attributedobjects;

/**
 * Objects of this type can be asked for a score that has been assigned to them. Scores must be Comparable (typically Double or vectors of such).
 *
 * @author Felix Mohr
 *
 * @param <V>
 *            The type of the scores.
 */
public interface ScoredItem<V extends Comparable<V>> {
	public V getScore();
}
