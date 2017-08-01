package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTwoNumbersTest {

    private SumTwoNumbers model;
    @Before
    public void setUp() throws Exception {
        model = new SumTwoNumbers();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sumTwoNumbers() {
        assertEquals(5, model.addTwoDigits(23));
    }

    @Test
    public void sumTwoNumbersEquals() {
        assertEquals(8, model.addTwoDigits(44));
    }

    @Test
    public void sumTwoNumbersZero() {
        assertEquals(0, model.addTwoDigits(00));
    }

    @Test
    public void showlReturnZeroWhenIsSumOneElement() {
        assertEquals(0, model.addTwoDigits(7));
    }

    @Test
    public void addTwoDigitsWhenFromLargeNumber() {
        assertEquals(5, model.addTwoDigits(234));
    }

}