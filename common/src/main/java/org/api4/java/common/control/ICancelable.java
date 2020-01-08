package org.api4.java.common.control;

/**
 * Classes implementing this interface represent processes that can be stopped.
 * The intended meaning is that threads executing this process class stop to do so,
 * and new threads entering its executing do return immediately or throw an exception.
 *
 * @author Felix Mohr
 *
 */
public interface ICancelable {
	public void cancel();
}
