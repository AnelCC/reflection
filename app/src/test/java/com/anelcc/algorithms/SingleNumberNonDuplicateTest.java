package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberNonDuplicateTest {
    private SingleNumberNonDuplicate singleNonDuplicate;


    @Before
    public void setUp() {
        singleNonDuplicate = new SingleNumberNonDuplicate();
    }

    @Test
    public void ShouldReturnNumberNonDuplicate() {
        int[] aux = new int []{1,1,2,3,3,4,4,7,7};
        assertEquals(2, singleNonDuplicate.getNumberNonDuplicate(aux));
    }

}