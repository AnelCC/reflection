package com.anelcc.algorithms;

import java.util.ArrayList;

public class Staircase {

    public ArrayList<ArrayList<String>> stairCase(int n) {
        /*for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        ArrayList<ArrayList<String>> stairListRow= new ArrayList<>();
        ArrayList<String> stairListColumn= new ArrayList<>();
        String stair = " ";
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if ((i + j) > n) {
                    stair = "#";
                } else {
                    stair = " ";
                }
                stairListColumn.add(stair);
            }
            stairListRow.add(stairListColumn);
        }
        return stairListRow;
    }
}
