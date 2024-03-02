// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception;

import java.io.Serial;
import java.lang.reflect.*;

/**
 * General-purpose checked exception wrapper.
 * Please use JDK's {@link UndeclaredThrowableException} instead.
 *
 * @deprecated Use {@link UndeclaredThrowableException} instead.
 */
@Deprecated
public class WrappedException extends RuntimeException {
	@Serial
	private static final long serialVersionUID = -1535521026317618861L;
	/**
	 * Wraps checked exception.
	 * Wrapped checked exception can be later retrieved using {@link #getCause()} method.
	 *
	 * @param cause
	 *            exception to be wrapped, usually a checked exception
	 * @see Exceptions#wrap()
	 */
	public WrappedException(Throwable cause) {
		super(cause);
	}
}
