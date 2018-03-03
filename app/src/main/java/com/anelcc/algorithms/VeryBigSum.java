package com.anelcc.algorithms;

public class VeryBigSum {
    public long getVeryBigSum(long[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
}
