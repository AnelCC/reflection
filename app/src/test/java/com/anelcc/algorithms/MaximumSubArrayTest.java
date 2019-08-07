package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubArrayTest {
    private MaximumSubArray maximumSubArray;

    @Before
    public void setUp() {
        maximumSubArray = new MaximumSubArray();
    }

    @After
    public void tearDown() {
        maximumSubArray = null;
    }

    @Test
    public void maxSubArrayValue6() {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maximumSubArray.maxSubArray(array));
        assertEquals(6, maximumSubArray.maxSubArrayMinValue(array));
        assertEquals(6, maximumSubArray.maxSubArrayExtraArray(array));
    }

    @Test
    public void maxSubArrayValue11() {
        int[] array = { -2, 9, 2, -5, 0};
        assertEquals(11, maximumSubArray.maxSubArray(array));
        assertEquals(11, maximumSubArray.maxSubArrayMinValue(array));
        assertEquals(11, maximumSubArray.maxSubArrayExtraArray(array));
    }

    @Test
    public void maxSubArrayValue10() {
        int[] array = { -2, -1, -5, 5, -1, 2, 3, 1, -4, -1};
        assertEquals(10, maximumSubArray.maxSubArray(array));
        assertEquals(10, maximumSubArray.maxSubArrayMinValue(array));
        assertEquals(10, maximumSubArray.maxSubArrayExtraArray(array));
    }

    @Test
    public void maxSubArrayValue0() {
        int[] array = { -2, -1, -5, -5, -1, -2, 0, -1, -4, -1};
        assertEquals(0, maximumSubArray.maxSubArray(array));
        assertEquals(0, maximumSubArray.maxSubArrayMinValue(array));
        assertEquals(0, maximumSubArray.maxSubArrayExtraArray(array));
    }
}