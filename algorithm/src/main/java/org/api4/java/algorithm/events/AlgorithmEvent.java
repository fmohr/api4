package org.api4.java.algorithm.events;

import org.api4.java.common.event.IEvent;

public interface AlgorithmEvent extends IEvent {

	public String getAlgorithmId(); // the id of the algorithm that has issued this event

	public long getTimestamp(); // the time when this event has occurred
}
