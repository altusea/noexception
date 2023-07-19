// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.optional;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;

public class OptionalUnaryOperatorTest {
    @Test
    public void conversions() {
        assertEquals(Optional.of("value"), create(o -> Optional.of("value")).apply("input"));
        assertEquals("value", create(o -> Optional.of("value")).orElse("default").apply("input"));
        assertEquals("value", create(o -> Optional.of("value")).orElseGet(() -> "value").apply("input"));
        assertEquals(Optional.empty(), create(o -> Optional.empty()).apply("input"));
        assertEquals("default", create(o -> Optional.empty()).orElse("default").apply("input"));
        assertEquals("default", create(o -> Optional.empty()).orElseGet(() -> "default").apply("input"));
    }
    private OptionalUnaryOperator<String> create(OptionalUnaryOperator<String> lambda) {
        return lambda;
    }
}
