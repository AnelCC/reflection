package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaircaseTest {

    private Staircase model;

    @Before
    public void setUp() throws Exception {
        model = new Staircase();
    }

    @After
    public void tearDown() throws Exception {
        model = null;
    }

    @Test
    public void shouldReturnTheLastValue() {
        assertEquals("", model.stairCase(4).get(0).toString());
    }

    @Test
    public void shouldReturnTrueWhenTheListIsNotEmpty() {
        assertTrue(!model.stairCase(2).isEmpty());
    }

    @Test
    public void shouldReturnTheCorrectListSize() {
        assertEquals(10, model.stairCase(3).size());
    }
}