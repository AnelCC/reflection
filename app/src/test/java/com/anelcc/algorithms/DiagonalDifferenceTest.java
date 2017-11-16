package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DiagonalDifferenceTest {

    private DiagonalDifference diagonalDifference;


    @Before
    public void setUp() {
        diagonalDifference = new DiagonalDifference();
    }

    @Test
    public void diagonalDifference() {
        List<List<Integer>> auxRow = new ArrayList<>();
        List<Integer> auxColumn1 = new ArrayList<>();
        List<Integer> auxColumn2 = new ArrayList<>();
        List<Integer> auxColumn3 = new ArrayList<>();
        List<Integer> auxColumn4= new ArrayList<>();

        auxColumn2.add(11);
        auxColumn2.add(2);
        auxColumn2.add(4);
        auxColumn3.add(4);
        auxColumn3.add(5);
        auxColumn3.add(5);
        auxColumn4.add(10);
        auxColumn4.add(8);
        auxColumn4.add(-12);

        auxRow.add(auxColumn2);
        auxRow.add(auxColumn3);
        auxRow.add(auxColumn4);
        assertEquals(15, diagonalDifference.getDiagonalDifference(auxRow));
    }

}