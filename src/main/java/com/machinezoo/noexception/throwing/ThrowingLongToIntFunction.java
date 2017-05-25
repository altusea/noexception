// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingLongToIntFunction {
	int applyAsInt(long value) throws Exception;
}