// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class OptionalBooleanSupplierTest {
    @Test
    public void conversions() {
        assertEquals(OptionalBoolean.of(true), create(() -> OptionalBoolean.of(true)).get());
        assertEquals(true, create(() -> OptionalBoolean.of(true)).orElse(false).getAsBoolean());
        assertEquals(true, create(() -> OptionalBoolean.of(true)).orElseGet(() -> true).getAsBoolean());
        assertEquals(OptionalBoolean.empty(), create(() -> OptionalBoolean.empty()).get());
        assertEquals(false, create(() -> OptionalBoolean.empty()).orElse(false).getAsBoolean());
        assertEquals(false, create(() -> OptionalBoolean.empty()).orElseGet(() -> false).getAsBoolean());
    }
    private OptionalBooleanSupplier create(OptionalBooleanSupplier lambda) {
        return lambda;
    }
}
