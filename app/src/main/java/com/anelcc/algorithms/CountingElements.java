package com.anelcc.algorithms;

import java.util.Arrays;
import java.util.HashSet;

/*
Given an integer array arr, count element x such that x + 1 is also in arr.
If there're duplicates in arr, count them seperately.

Example 1:
Input: arr = [1,2,3]
Output: 2
Explanation: 1 and 2 are counted cause 2 and 3 are in arr.

Example 2:
Input: arr = [1,1,3,3,5,5,7,7]
Output: 0
Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
*/
public class CountingElements {
    public int countElements(int[] arr) {
        int counter = 0;

        //1.creating hashset and adding vals into it
        HashSet<Integer> hashset = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hashset.add(arr[i]);
        }
        //2. checking x+1 value is present into hashset
        for(int i=0;i<arr.length;i++){
            if(hashset.contains(arr[i]+1))
                counter++;
        }

        return counter;
    }

    public int countElementsNotCompleteCoverage(int[] arr) {
        int counter = 0;
        int aux = -1;
        Arrays.sort(arr);
        for(int i = 1; i< arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                if (aux != -1){
                    int diff = arr[i-1] - aux;
                    if (diff == 1) {
                        counter++;
                        aux = -1;
                    }
                }
                aux = arr[i];
            } else {
                if (aux != -1){
                    int diffAux = arr[i] - aux;
                    if (diffAux == 1) {
                        counter++;
                    }
                }
                int diff = arr[i] - arr[i-1];
                if (diff == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
