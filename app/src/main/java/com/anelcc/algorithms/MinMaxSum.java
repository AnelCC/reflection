package com.anelcc.algorithms;

import java.util.ArrayList;

public class MinMaxSum {
    /*Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:

    If we sum everything 1 except , our sum is 2+3+4+5.
    If we sum everything 2 except , our sum is 1+3+4+5.
    If we sum everything 3 except , our sum is 1+2+4+5.
    If we sum everything 4 except , our sum is 1+2+3+5.
    If we sum everything 5 except , our sum is 1+2+3+4.
    Hints: Beware of integer overflow! Use 64-bit Integer.*/
    public String minMaxSum(int[] arr) {
        String minMaxSum;
        long min = 1000000000;
        long max = 0;
        long sum = 0;

        for (int i=0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        minMaxSum = (sum - max) + " " + (sum - min);
        return minMaxSum;
    }

    public boolean wordsc(String[] words, String variableName) {
        String[] splitWords = variableName.split("(?=\\p{Upper})");


        int counter = 0;
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            strings.add(words[i]);
        }

        for (int i = 0; i < splitWords.length; i++){
            if(!strings.contains(splitWords[i].toLowerCase())){
                counter++;
            }
        }

        return  counter == 0;
    }

}
