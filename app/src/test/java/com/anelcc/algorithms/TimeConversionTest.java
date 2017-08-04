package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeConversionTest {

    private TimeConversion model;

    @Before
    public void setUp() throws Exception {
        model = new TimeConversion();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void returnCorrectDate() {
        assertEquals("19:05:45", model.timeConversion("07:05:45PM"));
    }
    @Test
    public void returnCorrectDateWhenIsZeroAM() {
        assertEquals("00:40:22", model.timeConversion("12:40:22AM"));
    }
    @Test
    public void returnCorrectDateWhenIsAM() {
        assertEquals("04:59:59", model.timeConversion("04:59:59AM"));
    }
    @Test
    public void returnCorrectDateWhenIsPM() {
        assertEquals("12:45:54", model.timeConversion("12:45:54PM"));
    }

}