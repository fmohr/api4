package org.api4.java.algorithm.events.serializable;

import java.util.Map;
import java.util.NoSuchElementException;

import org.api4.java.algorithm.events.IAlgorithmEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Offers a default implementation for {@link IPropertyProcessedAlgorithmEvent}.
 *
 * @author Alexander Tornede
 *
 */
public class DefaultPropertyProcessedAlgorithmEvent implements IPropertyProcessedAlgorithmEvent {

	private static final long serialVersionUID = -6645533957593455739L;

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultPropertyProcessedAlgorithmEvent.class);

	private String eventName;
	private String completeOriginalEventName;
	private Map<String, Object> properties;

	private transient IAlgorithmEvent originalAlgorithmEvent;

	private long timestampOfEvent;

	@SuppressWarnings("unused")
	private DefaultPropertyProcessedAlgorithmEvent() {
		// for serialization purposes
	}

	public DefaultPropertyProcessedAlgorithmEvent(final String eventName, final String completeOriginalEventName, final Map<String, Object> properties, final long timestampOfEvent) {
		this.eventName = eventName;
		this.completeOriginalEventName = completeOriginalEventName;
		this.properties = properties;
		this.timestampOfEvent = timestampOfEvent;
	}

	public DefaultPropertyProcessedAlgorithmEvent(final String eventName, final Map<String, Object> properties, final IAlgorithmEvent originalAlgorithmEvent, final long timestampOfEvent) {
		this(eventName, originalAlgorithmEvent.getClass().getName(), properties, timestampOfEvent);
		this.originalAlgorithmEvent = originalAlgorithmEvent;
	}

	@Override
	public String getEventName() {
		return this.eventName;
	}

	@Override
	public String getCompleteOriginalEventName() {
		return this.completeOriginalEventName;
	}

	@Override
	public Object getProperty(final String propertyName) {
		return this.properties.get(propertyName);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <N> N getProperty(final String propertyName, final Class<N> expectedClassToBeReturned) {

		Object property = this.properties.get(propertyName);
		if (property == null) {
			throw new NoSuchElementException("No property with name \"" + propertyName + "\" present.");
		}
		if (!expectedClassToBeReturned.isInstance(property)) {
			throw new ClassCastException("Property with name \"" + propertyName + "\" is not of type: " + expectedClassToBeReturned.getName());
		}
		return (N) property;
	}

	@Override
	public IAlgorithmEvent getOriginalEvent() {
		return this.originalAlgorithmEvent;
	}

	@Override
	public boolean correspondsToEventOfClass(final Class<? extends IAlgorithmEvent> eventClass) {
		return eventClass.getSimpleName().equals(this.getEventName()) || eventClass.isAssignableFrom(this.getClassOfOriginalEvent());
	}

	@Override
	public long getTimestampOfEvent() {
		return this.timestampOfEvent;
	}

	private Class<?> getClassOfOriginalEvent() {
		try {
			return Class.forName(this.getCompleteOriginalEventName());
		} catch (ClassNotFoundException e) {
			LOGGER.warn("Cannot find class with name {}.", this.getCompleteOriginalEventName(), e);
			return null;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.completeOriginalEventName == null) ? 0 : this.completeOriginalEventName.hashCode());
		result = prime * result + ((this.eventName == null) ? 0 : this.eventName.hashCode());
		result = prime * result + ((this.properties == null) ? 0 : this.properties.hashCode());
		result = prime * result + (int) (this.timestampOfEvent ^ (this.timestampOfEvent >>> 32));
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		DefaultPropertyProcessedAlgorithmEvent other = (DefaultPropertyProcessedAlgorithmEvent) obj;
		if (this.completeOriginalEventName == null) {
			if (other.completeOriginalEventName != null) {
				return false;
			}
		} else if (!this.completeOriginalEventName.equals(other.completeOriginalEventName)) {
			return false;
		}
		if (this.eventName == null) {
			if (other.eventName != null) {
				return false;
			}
		} else if (!this.eventName.equals(other.eventName)) {
			return false;
		}
		if (this.properties == null) {
			if (other.properties != null) {
				return false;
			}
		} else if (!this.properties.equals(other.properties)) {
			return false;
		}
		if (this.timestampOfEvent != other.timestampOfEvent) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DefaultPropertyProcessedAlgorithmEvent [eventName=" + this.eventName + ", completeOriginalEventName=" + this.completeOriginalEventName + ", properties=" + this.properties + ", timestampOfEvent=" + this.timestampOfEvent
				+ "]";
	}

}
