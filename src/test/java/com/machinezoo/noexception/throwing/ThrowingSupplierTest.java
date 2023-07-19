// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.throwing;

import java.io.*;
import java.util.concurrent.*;
import java.util.function.*;
import org.junit.jupiter.api.*;

public class ThrowingSupplierTest {
    void takeThrowing(ThrowingSupplier<String> functional) {
    }
    void takeNonThrowing(Supplier<String> functional) {
    }
    @Test
    public void lambdas() {
        takeNonThrowing(() -> "value");
        takeThrowing(() -> "value");
        takeThrowing(() -> {
            if (ThreadLocalRandom.current().nextBoolean())
                throw new IOException();
            else
                return "value";
        });
        Throwable throwable = new IOException();
        takeThrowing(() -> {
            if (ThreadLocalRandom.current().nextBoolean())
                throw throwable;
            else
                return "value";
        });
    }
}
