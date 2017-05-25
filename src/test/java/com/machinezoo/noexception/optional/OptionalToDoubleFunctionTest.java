// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.optional;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class OptionalToDoubleFunctionTest {
	@Test public void conversions() {
		assertEquals(OptionalDouble.of(2.0), create(x -> OptionalDouble.of(2.0)).apply("input"));
		assertEquals(2.0, create(x -> OptionalDouble.of(2.0)).orElse(3.0).applyAsDouble("input"), 0.1);
		assertEquals(2.0, create(x -> OptionalDouble.of(2.0)).orElseGet(() -> 3.0).applyAsDouble("input"), 0.1);
		assertEquals(OptionalDouble.empty(), create(x -> OptionalDouble.empty()).apply("input"));
		assertEquals(3.0, create(x -> OptionalDouble.empty()).orElse(3.0).applyAsDouble("input"), 0.1);
		assertEquals(3.0, create(x -> OptionalDouble.empty()).orElseGet(() -> 3.0).applyAsDouble("input"), 0.1);
	}
	private OptionalToDoubleFunction<String> create(OptionalToDoubleFunction<String> lambda) {
		return lambda;
	}
}
