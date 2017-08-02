package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleMathLoopsTest {
    private SimpleMathLoops model;
    @Before
    public void setUp() throws Exception {
        model = new SimpleMathLoops();
    }

    @After
    public void tearDown() throws Exception {
        model = null;
    }

    @Test
    public void shouldReturnTheLastValue() {
        assertEquals("4 x 10 = 40", model.simpleMathLoops(4).get(9));
    }

    @Test
    public void shouldReturnTrueWhenTheListIsNotEmpty() {
        assertTrue(!model.simpleMathLoops(2).isEmpty());
    }

    @Test
    public void shouldReturnTheCorrectListSize() {
        assertEquals(10, model.simpleMathLoops(3).size());
    }
}