package org.api4.java.common.attributedobjects;

/**
 * Gets a property P of an object of class C.
 *
 * @author Felix Mohr
 */
public interface IGetter<C, P> {

	public P getPropertyOf(C obj) throws InterruptedException, GetPropertyFailedException;

}
