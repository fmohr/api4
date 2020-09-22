package org.api4.java.common.collection;

import java.util.Iterator;

public class CastingIterator<A, B extends A> implements Iterator<B> {

	private final Iterator<A> originalIterator;

	public CastingIterator(final Iterator<A> originalIterator) {
		super();
		this.originalIterator = originalIterator;
	}

	@Override
	public boolean hasNext() {
		return this.originalIterator.hasNext();
	}

	@SuppressWarnings("unchecked")
	@Override
	public B next() {
		return (B)this.originalIterator.next();
	}

}
