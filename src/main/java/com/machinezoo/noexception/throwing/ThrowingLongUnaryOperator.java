// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

import java.util.function.*;
import com.machinezoo.noexception.*;

/**
 * Variation of {@link LongUnaryOperator} that allows throwing checked exceptions.
 * {@code ThrowingLongUnaryOperator} is usually implemented by a lambda
 * and passed to {@link CheckedExceptionHandler#fromLongUnaryOperator(ThrowingLongUnaryOperator)}.
 * See <a href="https://noexception.machinezoo.com/">NoException tutorial</a>.
 * 
 * @see CheckedExceptionHandler#fromLongUnaryOperator(ThrowingLongUnaryOperator)
 * @see LongUnaryOperator
 */
@FunctionalInterface public interface ThrowingLongUnaryOperator {
	/**
	 * Variation of {@link LongUnaryOperator#applyAsLong(long)} that allows throwing checked exceptions.
	 * 
	 * @param operand
	 *            See {@link LongUnaryOperator#applyAsLong(long)}
	 * @return See {@link LongUnaryOperator#applyAsLong(long)}
	 * @throws Exception
	 *             Whenever necessary.
	 * @see CheckedExceptionHandler#fromLongUnaryOperator(ThrowingLongUnaryOperator)
	 * @see LongUnaryOperator#applyAsLong(long)
	 */
	long applyAsLong(long operand) throws Exception;
}
