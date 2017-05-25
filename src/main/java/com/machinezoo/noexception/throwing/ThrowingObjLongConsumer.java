// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingObjLongConsumer<T> {
	void accept(T t, long value) throws Exception;
}