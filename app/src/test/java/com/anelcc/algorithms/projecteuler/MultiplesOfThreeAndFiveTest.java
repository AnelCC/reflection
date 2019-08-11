package com.anelcc.algorithms.projecteuler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOfThreeAndFiveTest {
    private  MultiplesOfThreeAndFive multiples;

    @Before
    public void setUp() throws Exception {
        multiples = new MultiplesOfThreeAndFive();
    }

    @After
    public void tearDown() throws Exception {
        multiples = null;
    }

    @Test
    public void multiplesOfThreeAndFive() {
        assertEquals(233168,  multiples.multiplesOfThreeAndFive());
    }
}