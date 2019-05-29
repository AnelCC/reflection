package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTwoNumberByTargetTest {
    private SumTwoNumberByTarget sumTwoNumberByTarget;


    @Before
    public void setUp() {
        sumTwoNumberByTarget = new SumTwoNumberByTarget();
    }

    @Test
    public void ReturnTheCorrectIndexArray() {
        int indicesArray[] = new int[] {0,1};
        int target = 6;

        assertEquals(indicesArray[0], sumTwoNumberByTarget.getIndicesArray(new int[] {3,3},target)[0]);
    }

    @Test
    public void ReturnTheCorrectIndexArrayByTarget8() {
        int indicesArray[] = new int[] {0,1};
        int target = 8;
        assertEquals(indicesArray[1], sumTwoNumberByTarget.getIndicesArray(new int[] {4,4,5,3},target)[1]);
    }


    @Test
    public void ReturnTheCorrectIndexArrayByTarget9() {
        int indicesArray[] = new int[] {0,1,4};
        int target = 9;
        assertEquals(indicesArray[1], sumTwoNumberByTarget.getIndicesArray(new int[] {2, 7, 11, 15},target)[1]);
    }
}
