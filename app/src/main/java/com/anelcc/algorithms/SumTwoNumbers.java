package com.anelcc.algorithms;

public class SumTwoNumbers {

    public int addTwoDigits(int n) {
        String numbers = String.valueOf(n);
        int sum = 0;

        String[] nums = numbers.split("");
        if (nums.length > 1){
            for (int i = 0; i < 2 ; i++){
                sum = sum + Integer.valueOf(nums[i]);
            }
        }
        return sum;
    }
}
