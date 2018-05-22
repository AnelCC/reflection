package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {
    private RemoveDuplicates removeDuplicates;


    @Before
    public void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }


    @Test
    public void ShouldReturnCounterNumbersDuplicateTest() {
        assertEquals(6, removeDuplicates.getRemoveDuplicates(new int[] {1,2,3,1,0,0,1,0}));
    }


}