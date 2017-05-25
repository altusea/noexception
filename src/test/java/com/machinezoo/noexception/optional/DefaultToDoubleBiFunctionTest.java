// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.*;
import org.junit.*;

public class DefaultToDoubleBiFunctionTest {
	@Test public void full() {
		@SuppressWarnings("unchecked") OptionalToDoubleBiFunction<String, String> full = mock(OptionalToDoubleBiFunction.class);
		when(full.apply("input1", "input2")).thenReturn(OptionalDouble.of(2));
		assertEquals(2, new DefaultToDoubleBiFunction<String, String>(full, 3).applyAsDouble("input1", "input2"), 0.1);
		verify(full, only()).apply("input1", "input2");
	}
	@Test public void empty() {
		@SuppressWarnings("unchecked") OptionalToDoubleBiFunction<String, String> empty = mock(OptionalToDoubleBiFunction.class);
		when(empty.apply("input1", "input2")).thenReturn(OptionalDouble.empty());
		assertEquals(3, new DefaultToDoubleBiFunction<String, String>(empty, 3).applyAsDouble("input1", "input2"), 0.1);
		verify(empty, only()).apply("input1", "input2");
	}
}
