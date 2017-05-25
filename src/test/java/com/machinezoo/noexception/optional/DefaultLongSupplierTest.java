// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.*;
import org.junit.*;

public class DefaultLongSupplierTest {
	@Test public void full() {
		OptionalLongSupplier full = mock(OptionalLongSupplier.class);
		when(full.get()).thenReturn(OptionalLong.of(2));
		assertEquals(2, new DefaultLongSupplier(full, 3).getAsLong());
		verify(full, only()).get();
	}
	@Test public void empty() {
		OptionalLongSupplier empty = mock(OptionalLongSupplier.class);
		when(empty.get()).thenReturn(OptionalLong.empty());
		assertEquals(3, new DefaultLongSupplier(empty, 3).getAsLong());
		verify(empty, only()).get();
	}
}
