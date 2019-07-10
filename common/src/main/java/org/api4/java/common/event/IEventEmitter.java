package org.api4.java.common.event;

/**
 * Interface for event emitting classes, allowing other objects to register themselves as listener.
 *
 * @author fmohr, mwever
 */
public interface IEventEmitter<L> {

	/**
	 * Registers the provided object as a listener on the internal event bus such that the registered listener is supplied with emitted events.
	 *
	 * @param listener The listener to be registered on the event bus system.
	 */
	public void registerListener(L listener);

}
