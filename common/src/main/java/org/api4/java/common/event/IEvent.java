package org.api4.java.common.event;

/**
 * Basic interface for events that may be sent via an event bus by an instance of IEventEmitter.
 *
 * @author fmohr, mwever
 */
public interface IEvent {

	/**
	 * @return the time when this event has occurred
	 */
	public long getTimestamp();
}
