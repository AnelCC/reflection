package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrisonAfterNDaysTest {
    private PrisonAfterNDays prisonAfterNDays;


    @Before
    public void setUp() {
        prisonAfterNDays = new PrisonAfterNDays();
    }


    @Test
    public void onCreateLoader() {
        int aux[] = new int[] {0,1};
        assertEquals(aux[0], prisonAfterNDays.prisonAfterNDays(new int[] {1,0,0,1,0,0,1,0},1000000000)[0]);
    }
}