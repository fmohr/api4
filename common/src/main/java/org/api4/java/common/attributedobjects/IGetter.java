package org.api4.java.common.attributedobjects;

/**
 * gets a property P of an object of class C
 */
public interface IGetter<C, P> {

	public P getPropertyOf(C obj) throws InterruptedException, GetPropertyFailedException;

}
