package org.api4.java.algorithm.events;

import org.api4.java.algorithm.IAlgorithm;
import org.api4.java.common.event.IEvent;

/**
 * An algorithm even is an {@link IEvent} that is associated with an {@link IAlgorithm}.
 * For control reasons, the algorithm reference itself is not communicated but only an identifier to it.
 *
 * @author Felix Mohr
 */
public interface IAlgorithmEvent extends IEvent {

	/**
	 * @return the id of the algorithm that has issued this event
	 */
	public String getAlgorithmId();
}
