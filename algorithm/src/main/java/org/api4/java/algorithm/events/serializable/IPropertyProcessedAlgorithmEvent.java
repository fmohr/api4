package org.api4.java.algorithm.events.serializable;

import java.io.Serializable;

import org.api4.java.algorithm.events.IAlgorithmEvent;

/**
 * A {@link IPropertyProcessedAlgorithmEvent} is constructed based on an {@link IAlgorithmEvent} where the most
 * important information is extracted in stored in the form of one or more properties.
 * It is serializable in the sense that it should only contain properties which can be serialized to JSON.
 *
 * @author Alexander Tornede
 *
 */
public interface IPropertyProcessedAlgorithmEvent extends Serializable {

	/**
	 * Returns the name of the underlying {@link IAlgorithmEvent} on the basis this {@link IPropertyProcessedAlgorithmEvent} was created.
	 *
	 * @return The name of the underlying {@link IAlgorithmEvent}.
	 */
	public String getEventName();

	/**
	 * Returns the fully qualified name of the underlying {@link IAlgorithmEvent} on the basis this {@link IPropertyProcessedAlgorithmEvent} was created.
	 *
	 * @return The fully qualified name of the underlying {@link IAlgorithmEvent}.
	 */
	public String getCompleteOriginalEventName();

	/**
	 * Returns the property with the given name.
	 *
	 * @param propertyName The name of the property to be returned.
	 * @return The property with the given name.
	 */
	public Object getProperty(String propertyName);

	/**
	 * Returns the property with the given name, assuming it is an instance of the given {@link Class}.
	 *
	 * @param propertyName The name of the property to be returned.
	 * @param expectedClassToBeReturned The {@link Class} underlying the instance of the property to be returned.
	 * @return The property with the given name.
	 * @throws ClassCastException If the given {@link Class} does not fit the {@link Class} of the instance of the property returned.
	 */
	public <N> N getProperty(String propertyName, Class<N> expectedClassToBeReturned) throws ClassCastException;

	/**
	 * Returns the original {@link IAlgorithmEvent} from which this one was constructed. Note: This may be {@code null} in certain cases, for example if this instance was created from a serialized {@link String}.
	 *
	 * @return The original {@link IAlgorithmEvent} from which this one was constructed or {@code null} if it is not available.
	 */
	public IAlgorithmEvent getOriginalEvent();

	/**
	 * Checks whether this event corresponds to the given {@link IAlgorithmEvent} class.
	 *
	 * @param eventClass The {@link IAlgorithmEvent} class to check against.
	 * @return {@code true} if this {@link IPropertyProcessedAlgorithmEvent} corresponds to the given {@link IAlgorithmEvent} class, {@code false} otherwise
	 */
	public boolean correspondsToEventOfClass(Class<? extends IAlgorithmEvent> eventClass);

	/**
	 * Returns the timestamp of this event.
	 *
	 * @return The timestamp of this event.
	 */
	public long getTimestampOfEvent();

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);
}
