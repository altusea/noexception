// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

import java.util.function.*;
import com.machinezoo.noexception.*;

/**
 * Variation of {@link Consumer} that allows throwing checked exceptions.
 * {@code ThrowingConsumer} is usually implemented by a lambda
 * and passed to {@link CheckedExceptionHandler#consumer(ThrowingConsumer)}.
 * See <a href="https://noexception.machinezoo.com/">NoException tutorial</a>.
 * 
 * @param <T>
 *            See {@link Consumer}.
 * @see CheckedExceptionHandler#consumer(ThrowingConsumer)
 * @see Consumer
 */
@FunctionalInterface public interface ThrowingConsumer<T> {
	/**
	 * Variation of {@link Consumer#accept(Object)} that allows throwing checked exceptions.
	 * 
	 * @param t
	 *            See {@link Consumer#accept(Object)}
	 * @throws Exception
	 *             Whenever necessary.
	 * @see CheckedExceptionHandler#consumer(ThrowingConsumer)
	 * @see Consumer#accept(Object)
	 */
	void accept(T t) throws Exception;
}
