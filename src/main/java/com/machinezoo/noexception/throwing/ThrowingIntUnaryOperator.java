// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingIntUnaryOperator {
	int applyAsInt(int operand) throws Exception;
}