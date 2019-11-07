/**
 *
 */
package org.api4.java.ai.ml.core.dataset.serialization;

/**
 * @author mwever
 *
 */
public class DatasetDeserializationFailedException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -421369124414060380L;

	/**
	 *
	 */
	public DatasetDeserializationFailedException() {
		// nothing to do here
	}

	/**
	 * @param message
	 */
	public DatasetDeserializationFailedException(final String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public DatasetDeserializationFailedException(final Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DatasetDeserializationFailedException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DatasetDeserializationFailedException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
