// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingToIntBiFunction<T, U> {
	int applyAsInt(T t, U u) throws Exception;
}