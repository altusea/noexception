// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception;

final class PropagatingHandler extends ExceptionHandler {
	@Override
	public boolean handle(Exception exception) {
		return false;
	}
}
