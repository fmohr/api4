package org.api4.java.common.attributedobjects;

public interface IObjectEvaluator<T, V extends Comparable<V>> extends IGetter<T, V> {
	public V evaluate(T object) throws InterruptedException, ObjectEvaluationFailedException;

	@Override
	default V getPropertyOf(final T object) throws GetPropertyFailedException, InterruptedException {
		try {
			return evaluate(object);
		} catch (InterruptedException e) {
			throw e;
		}
		catch (ObjectEvaluationFailedException e) {
			throw new GetPropertyFailedException(e);
		}
	}
}
