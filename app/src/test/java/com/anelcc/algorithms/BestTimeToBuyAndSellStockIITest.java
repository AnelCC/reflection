package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockIITest {
    private BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStock;

    @Before
    public void setUp() throws Exception {
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStockII();
    }

    @After
    public void tearDown() throws Exception {
        bestTimeToBuyAndSellStock = null;
    }

    @Test
    public void shouldReturnMaxProfitInFourDays() {
        int[] array = {0,1,0,11};
        assertEquals(12,  bestTimeToBuyAndSellStock.maxProfit(array));
    }

    @Test
    public void shouldReturnMaxProfitInSixDays() {
        int[] array = {7,1,5,3,6,4};
        assertEquals(7,  bestTimeToBuyAndSellStock.maxProfit(array));
    }

    @Test
    public void shouldReturnMaxProfitInFiveDays() {
        int[] array = {1,2,3,4,5};
        assertEquals(4,  bestTimeToBuyAndSellStock.maxProfit(array));
    }

    @Test
    public void shouldNotReturnProfitInFiveDays() {
        int[] array = {7,6,4,3,1};
        assertEquals(0,  bestTimeToBuyAndSellStock.maxProfit(array));
    }
}