// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingConsumer<T> {
	void accept(T t) throws Exception;
}