package com.anelcc.algorithms;

public class RemoveDuplicates {

    public int getRemoveDuplicates(int[] numbers){
        if (numbers.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 0 ; j < numbers.length; j++) {
            if (numbers[j] != numbers[i]){
                i++;
                numbers[i]= numbers[j];
            }
        }
        return i;
    }
}
