package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void returnsHelloWorld() {
        assertEquals("hello world", Main.someMethod());
    }
}