// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.*;
import java.util.function.*;
import org.junit.jupiter.api.*;

public class FallbackIntToDoubleFunctionTest {
    @Test
    public void full() {
        OptionalIntToDoubleFunction full = mock(OptionalIntToDoubleFunction.class);
        when(full.apply(1)).thenReturn(OptionalDouble.of(2.0));
        DoubleSupplier fallback = mock(DoubleSupplier.class);
        when(fallback.getAsDouble()).thenReturn(3.0);
        assertEquals(2.0, new FallbackIntToDoubleFunction(full, fallback).applyAsDouble(1), 0.1);
        verify(full, only()).apply(1);
        verifyNoMoreInteractions(fallback);
    }
    @Test
    public void empty() {
        OptionalIntToDoubleFunction empty = mock(OptionalIntToDoubleFunction.class);
        when(empty.apply(1)).thenReturn(OptionalDouble.empty());
        DoubleSupplier fallback = mock(DoubleSupplier.class);
        when(fallback.getAsDouble()).thenReturn(3.0);
        assertEquals(3.0, new FallbackIntToDoubleFunction(empty, fallback).applyAsDouble(1), 0.1);
        verify(empty, only()).apply(1);
        verify(fallback, only()).getAsDouble();
    }
}
