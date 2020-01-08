package org.api4.java.common.reconstruction;

/**
 * This exception can be thrown if problems with the reconstruction of an object occured.
 *
 * @author Felix Mohr
 *
 */
public class ReconstructionException extends Exception {

	private static final long serialVersionUID = 6415847756154359745L;

	public ReconstructionException(final String message, final Exception e) {
		super(message, e);
	}

	public ReconstructionException(final String message) {
		super(message);
	}

	public ReconstructionException(final Exception e) {
		super(e);
	}
}
