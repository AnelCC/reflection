package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VeryBigSumTest {
    private VeryBigSum veryBigSum;


    @Before
    public void setUp() {
        veryBigSum = new VeryBigSum();
    }

    @Test
    public void veryBigSum() {
        long expected = 5000000015L;
        long[] aux = new long[]{1000000001,1000000002,1000000003,1000000004,1000000005};
        assertEquals(expected, veryBigSum.getVeryBigSum(aux));
    }


}