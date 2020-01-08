package org.api4.java.common.attributedobjects;

/**
 *
 * @author Felix Mohr
 *
 * @param <E> The class of the element that is being decorated
 */
public interface IElementDecorator<E> {

	/**
	 * @return the decorated element
	 */
	public E getElement();
}
