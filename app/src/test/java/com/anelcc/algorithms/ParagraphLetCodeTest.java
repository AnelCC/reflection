package com.anelcc.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphLetCodeTest {
    ParagraphLetCode letCode;
    @Before
    public void setUp() throws Exception {
        letCode = new ParagraphLetCode();
    }
    @Test
    public void mostCommonWord() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[] {"hit"};
        assertEquals("ball", letCode.mostCommonWord(paragraph, banned));
    }
}