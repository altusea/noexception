// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingLongToDoubleFunction {
	double applyAsDouble(long value) throws Exception;
}