package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringLeetCodeTest {
    private ReverseStringLeetCode model;

    @Before
    public void setUp() throws Exception {
        model = new ReverseStringLeetCode();
    }

    @After
    public void tearDown() throws Exception {
        model = null;
    }

    @Test
    public void shouldReturnCorrectStringWhenIsTwoNumbers() {
        assertEquals("", model.reverseStr("Anel",2));
    }

    @Test
    public void shouldReturnCorrectStringWhenIsThreeNumbers() {
        assertEquals("", model.reverseStr("abcdefghij",3));
    }

    @Test
    public void shouldReturnCorrectStringWhenIsFourNumbers() {
        assertEquals("", model.reverseStr("12345678",4));
    }
}