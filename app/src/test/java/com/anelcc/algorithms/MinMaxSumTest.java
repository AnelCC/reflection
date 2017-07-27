package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxSumTest {

    private MinMaxSum model;
    @Before
    public void setUp() throws Exception {
        model = new MinMaxSum();
    }

    @After
    public void tearDown() throws Exception {
        model = null;
    }

    @Test
    public void shouldReturnMinSumAndMaxSum() {
        assertEquals("10 14", model.minMaxSum(new int[] {1,2,3,4,5}));
    }

    @Test
    public void shouldReturnMinSumAndMaxSumLongNumbers() {
        assertEquals("299 9271", model.minMaxSum(new int[] {7, 69, 2, 221, 8974}));
    }

    @Test
    public void shouldReturnMinSumAndMaxSumLongNumbersss() {
        assertTrue(model.wordsc(new String[] {"is", "valid", "right"}, "isValid"));
    }


    @Test
    public void secod() {
        assertFalse(model.wordsc(new String[] {"is", "valid", "right"}, "isValId"));
    }

}