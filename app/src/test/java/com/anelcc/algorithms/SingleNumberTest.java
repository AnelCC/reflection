package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {
    private SingleNumber singleNonDuplicate;


    @Before
    public void setUp() {
        singleNonDuplicate = new SingleNumber();
    }

    @Test
    public void ShouldReturnNumberNonDuplicate() {
        int[] aux = new int[]{1, 1, 2, 3, 3, 4, 4, 7, 7};
        assertEquals(2, singleNonDuplicate.singleNumberForLambda(aux));
    }

    @Test
    public void ShouldReturnNumberForNonDuplicate() {
        int[] aux = new int[]{1, 1, 2, 3, 3, 4, 4, 7, 7};
        assertEquals(2, singleNonDuplicate.singleNumberForXor(aux));
    }

    @Test
    public void ShouldReturnNumberNonDuplicates() {
        int[] aux = new int[]{1, 1, 2, 3, 3, 4, 4, 7, 7};
        assertEquals(2, singleNonDuplicate.singleNumberHashSet(aux));
    }
}