package org.api4.java.common.control;

/**
 * Objects of classes implementing this interface can be configured with a specific logger name.
 * The expectation is that members of this objects that also implement the interface will also be configured with the name plus some suffix.
 * This way, object-individualized logging configurations can be created.
 *
 * @author Felix Mohr
 *
 */
public interface ILoggingCustomizable {

	/**
	 * @return The name of the currently used logger
	 */
	public String getLoggerName();

	/**
	 *
	 * @param name The new name of the logger
	 */
	public void setLoggerName(String name);
}
