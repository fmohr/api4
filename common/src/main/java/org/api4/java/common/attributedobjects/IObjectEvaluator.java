package org.api4.java.common.attributedobjects;

public interface IObjectEvaluator<T, V extends Comparable<V>> extends IGetter<T, V> {
	public V f(T object) throws InterruptedException, ObjectEvaluationFailedException;

	@Override
	default V getPropertyOf(final T object) throws GetPropertyFailedException, InterruptedException {
		try {
			return this.f(object);
		} catch (InterruptedException e) {
			throw e;
		} catch (ObjectEvaluationFailedException e) {
			throw new GetPropertyFailedException(e);
		}
	}
}
