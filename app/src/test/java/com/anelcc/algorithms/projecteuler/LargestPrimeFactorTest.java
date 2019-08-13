package com.anelcc.algorithms.projecteuler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPrimeFactorTest {
    LargestPrimeFactor primeFactor;

    @Before
    public void setUp() throws Exception {
        primeFactor = new LargestPrimeFactor();
    }

    @After
    public void tearDown() throws Exception {
        primeFactor = null;
    }

    @Test
    public void primeFactorList() {
        assertEquals("[2, 2, 3]", primeFactor.primeFactorList(12).toString());
        assertEquals("[3, 3, 5, 7]", primeFactor.primeFactorList(315).toString());
        assertEquals("[5, 7, 13, 29]", primeFactor.primeFactorList(13195).toString());
        assertEquals("[5, 7, 13, 29]", primeFactor.primeFactorList(13195).toString());
        assertEquals("[71, 839, 1471, 6857]", primeFactor.primeFactorList(600851475143L).toString());
    }

    @Test
    public void largestPrimeFactor() {
        assertEquals(6857L, primeFactor.largestPrimeFactor(600851475143L));
    }
}