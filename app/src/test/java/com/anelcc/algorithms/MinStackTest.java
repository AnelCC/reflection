package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

    private MiniStack miniStack;
    @Before
    public void setUp() throws Exception {
        miniStack = new MiniStack();
    }

    @After
    public void tearDown() {
        miniStack = null;
    }

    @Test
    public void miniStack() {
        miniStack.push(-2);
        miniStack.push(0);
        miniStack.push(-3);
        assertEquals(-3, miniStack.getMin());

        miniStack.pop();
        assertEquals(0, miniStack.top());

        miniStack.pop();
        assertEquals(-2, miniStack.getMin());
    }
}