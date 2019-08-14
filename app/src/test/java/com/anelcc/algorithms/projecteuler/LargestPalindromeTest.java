package com.anelcc.algorithms.projecteuler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPalindromeTest {
    private LargestPalindrome largestPalindrome;

    @Before
    public void setUp() throws Exception {
        largestPalindrome = new LargestPalindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindrome() {
        assertEquals(906609 ,largestPalindrome.palindrome());
    }
}