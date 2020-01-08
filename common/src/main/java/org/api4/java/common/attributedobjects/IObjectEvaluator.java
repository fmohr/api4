package org.api4.java.common.attributedobjects;

/**
 * Assigns some comparable score value of type V to objects of type T.
 *
 * @author Felix Mohr
 *
 * @param <T> The type of objects evaluated by the evaluator
 * @param <V> The type of values assigned to the objects
 */
public interface IObjectEvaluator<T, V extends Comparable<V>> extends IGetter<T, V> {
	public V evaluate(T object) throws InterruptedException, ObjectEvaluationFailedException;

	@Override
	default V getPropertyOf(final T object) throws GetPropertyFailedException, InterruptedException {
		try {
			return this.evaluate(object);
		} catch (InterruptedException e) {
			throw e;
		} catch (ObjectEvaluationFailedException e) {
			throw new GetPropertyFailedException(e);
		}
	}
}
