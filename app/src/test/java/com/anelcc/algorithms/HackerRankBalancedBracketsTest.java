package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HackerRankBalancedBracketsTest {
    private HackerRankBalancedBrackets balancedBrackets;


    @Before
    public void setUp() {
        balancedBrackets = new HackerRankBalancedBrackets();
    }

    @Test
    public void ReturnStringBalancedBracketsHashMap() {
        assertEquals("yes", balancedBrackets.getBalancedBracketsHashMap("{[()]}"));
        assertEquals("no", balancedBrackets.getBalancedBracketsHashMap("{[(])}"));
        assertEquals("yes", balancedBrackets.getBalancedBracketsHashMap("{{[[(())]]}}"));
      //  assertEquals("yes", balancedBrackets.init("}[(]}[][)({]([][)}[)[]))({(]}{}]{-truncated-}"));
    }


    @Test
    public void ReturnBooleanBalancedBracketsHashMap() {
        assertTrue(balancedBrackets.isBalancedBracketsHashMap("(){}[]"));
        assertFalse(balancedBrackets.isBalancedBracketsHashMap("(({}[]"));
    }

    @Test
    public void ReturnBooleanBalancedBracketsStack() {
        //  assertTrue(balancedBrackets.isBalancedBracketsStack("(){}[]"));
        assertFalse(balancedBrackets.isBalancedBracketsStack("(({}[]"));
    }
}
