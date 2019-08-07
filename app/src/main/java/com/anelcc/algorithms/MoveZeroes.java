package com.anelcc.algorithms;


/*
Given an array nums, write a function to move all 0's to the end of
it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:
1. You must do this in-place without making a copy of the array.
2. Minimize the total number of operations.
*/
public class MoveZeroes {
//array[++index] - which means increment to variable index in current statement itself.
//array[index++] - which means increment to variable index after executing current statement.

    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums == null) return;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
        return;
    }

}