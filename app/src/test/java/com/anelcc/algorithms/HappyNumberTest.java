package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {
    HappyNumber happyNumber;

    @Before
    public void setUp() throws Exception {
        happyNumber = new HappyNumber();
    }

    @After
    public void tearDown() throws Exception {
        happyNumber = null;
    }

    @Test
    public void isHappy() {
        assertTrue(happyNumber.isHappy(19));
        assertFalse(happyNumber.isHappy(5));
        assertFalse(happyNumber.isHappy(387));
        assertTrue(happyNumber.isHappy(10));
    }

    @Test
    public void isHappyNumberInArrayList() {
        assertTrue(happyNumber.isHappyNumberInArrayList(19));
        assertFalse(happyNumber.isHappyNumberInArrayList(5));
        assertFalse(happyNumber.isHappyNumberInArrayList(387));
        assertTrue(happyNumber.isHappyNumberInArrayList(10));
    }

    @Test
    public void isHappyNumber() {
        assertTrue(happyNumber.isHappyNumber(19));
        assertFalse(happyNumber.isHappyNumber(5));
        assertFalse(happyNumber.isHappyNumber(387));
        assertTrue(happyNumber.isHappyNumber(10));
    }
}