package org.api4.java.common.control;

import java.util.Random;

/**
 * Objects of classes implementing this interface have methods that rely on random aspects.
 * By implementing this interface, the random source of the objects (and hence their behavior) can be controlled.
 *
 * This interface is useful in contexts where objects of some type T are maintained and a random source r is known,
 * but it is not known at compile time whether T has random aspects or not. For a concrete object of type T, one can
 * check whether it is a member of this interface and then invoke setRandom(r) to control its behavior.
 *
 * @author Felix Mohr
 */
public interface IRandomConfigurable {
	public void setRandom(Random random);
}
