package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextClosestTimeTest {
    private NextClosestTime nextClosestTime;


    @Before
    public void setUp() {
        nextClosestTime = new NextClosestTime();
    }

    @Test
    public void ReturnNextClosestTime() {
        assertEquals("19:35", nextClosestTime.getNextClosestTime("19:34"));
    }

    @Test
    public void ReturnNextClosestTimeTwo() {
        assertEquals("10:11", nextClosestTime.getNextClosestTime("10:10"));
    }

}