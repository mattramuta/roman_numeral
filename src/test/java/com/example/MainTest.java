package com.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void returnsHelloWorld() {
        assertThat(Main.someMethod(), equalTo("hello world"));
    }
}