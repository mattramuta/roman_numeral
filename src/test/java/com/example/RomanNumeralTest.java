package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void shouldConvert_1_to_I() {
        assertEquals("I", RomanNumeral.integerToRoman(1));
    }
}