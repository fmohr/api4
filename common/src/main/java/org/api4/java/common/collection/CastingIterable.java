package org.api4.java.common.collection;

import java.util.Iterator;

public class CastingIterable<A, B extends A> implements Iterable<B> {

	private final Iterable<A> originalIterable;

	public CastingIterable(final Iterable<A> originalIterable) {
		super();
		this.originalIterable = originalIterable;
	}

	@Override
	public Iterator<B> iterator() {
		return new CastingIterator<>(this.originalIterable.iterator());
	}
}
