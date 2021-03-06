package com.hbdriod.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void shouldReturnZeroWhenStringNull() throws Exception{
        assertEquals(0, StringCalculator.add(new String("")));
    }

    @Test
    public void shouldReturnAddOneValueFromString() throws Exception{
        assertEquals(3,StringCalculator.add(new String("3")));
    }

    @Test
    public void shouldReturnSumValuesFromString() throws Exception {
        assertEquals(5,StringCalculator.add(new String("1,4")));
    }

    @Test
    public void shouldReturnSumValuesWithFromStringWithEnter() throws Exception {
        assertEquals(6,StringCalculator.add(new String("1\n2,3")));
    }

    @Test
    public void shouldReturnSumValuesWithDifferentDelimiters() throws Exception {
        assertEquals(3,StringCalculator.add(new String("//;\n1;2")));
    }
}