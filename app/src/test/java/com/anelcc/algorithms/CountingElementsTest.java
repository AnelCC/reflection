package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CountingElementsTest {
    private CountingElements countingElements;

    @Before
    public void setUp() throws Exception {
        countingElements = new CountingElements();
    }

    @After
    public void tearDown() throws Exception {
        countingElements = null;
    }

    @Test
    public void shouldReturnElementContinuedCounterWhenIsOne() {
        int[] array = {0,1,0,11};
        assertEquals(2,  countingElements.countElements(array));
        assertEquals(2,  countingElements.countElementsNotCompleteCoverage(array));
    }

    @Test
    public void shouldReturnElementContinuedCounterWhenIsZero() {
        int[] array = {7,1,5,3,6,4};
        assertEquals(4,  countingElements.countElements(array));
    }

    @Test
    public void shouldReturnElementContinuedCounterWhenIsFour() {
        int[] array = {1,2,3,4,5};
        assertEquals(4,  countingElements.countElements(array));
        assertEquals(4,  countingElements.countElementsNotCompleteCoverage(array));
    }

    @Test
    public void shouldReturnElementContinuedCounterWhenIsThree() {
        int[] array = {1,3,2,3,5,0};
        assertEquals(3,  countingElements.countElements(array));
        assertEquals(3,  countingElements.countElementsNotCompleteCoverage(array));
    }

    @Test
    public void shouldReturnElementContinuedCounterWhenIsDuplicated() {
        int[] array = {1,1,2,2};
        assertEquals(2,  countingElements.countElements(array));
        assertFalse(2 == countingElements.countElementsNotCompleteCoverage(array));
    }

    @Test
    public void shouldReturnElementContinuedCounterWhenIsDuplicate() {
        int[] array = {1,1,2};
        assertEquals(2,  countingElements.countElements(array));
        assertEquals(2,  countingElements.countElementsNotCompleteCoverage(array));
    }
}