package com.anelcc.algorithms.projecteuler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenFibonacciNumbersTest {
    EvenFibonacciNumbers fibonacciNumbers;

    @Before
    public void setUp() {
        fibonacciNumbers = new EvenFibonacciNumbers();
    }

    @After
    public void tearDown() {
        fibonacciNumbers = null;
    }

    @Test
    public void fibonacciNumbers() {
        assertEquals(4613732, fibonacciNumbers.fibonacciNumbers());
        assertEquals(4613732, fibonacciNumbers.fibonacciNumbersRule());
    }
}