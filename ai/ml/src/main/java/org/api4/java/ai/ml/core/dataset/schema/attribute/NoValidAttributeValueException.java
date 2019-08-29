package org.api4.java.ai.ml.core.dataset.schema.attribute;

public class NoValidAttributeValueException extends IllegalArgumentException {

	/**
	 *
	 */
	private static final long serialVersionUID = -1029455740170922878L;

	public NoValidAttributeValueException() {
		super();
	}

	public NoValidAttributeValueException(final String msg) {
		super(msg);
	}

	public NoValidAttributeValueException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

	public NoValidAttributeValueException(final Throwable cause) {
		super(cause);
	}

}
