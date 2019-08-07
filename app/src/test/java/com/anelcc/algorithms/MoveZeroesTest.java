package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {
    private MoveZeroes moveZeroes;

    @Before
    public void setUp() {
        moveZeroes = new MoveZeroes();
    }

    @Test
    public void moveZeroes() {
        int[] array = {0,1,0,3,12};
        moveZeroes.moveZeroes(array);

    }
}