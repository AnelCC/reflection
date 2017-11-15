package com.anelcc.algorithms;

import java.util.List;

public class DiagonalDifference {
    public int getDiagonalDifference(List<List<Integer>> arr) {
        int d1 = 0, d2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    d1 += arr.get(i).get(j);
                }
                if (i == arr.size() - j - 1) {
                    d2 += arr.get(i).get(j);
                }
            }
        }
        int rst= Math.abs(d1-d2);
        return rst;
    }
}
