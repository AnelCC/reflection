package com.anelcc.algorithms;

/*
Given an integer array nums, find the contiguous subarray
(containing at least one number) which has the largest
sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

*/
public class MaximumSubArray {

    public int maxSubArrayExtraArray(int[] nums) {
        int result = nums[0];
        int[] sum =  new int[nums.length];
        sum[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            //This return (a >= b) ? a : b;
            sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
            result = Math.max(result, sum[i]);
        }

        return result;
    }

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];

        //for (initialization; termination; increment)
        for(int i=1; i<nums.length; i++){
            //This return (a >= b) ? a : b;
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
        }

        return result;
    }

    public int maxSubArrayMinValue(int[] nums) {
        int size = nums.length;
        //Integer.MIN_VALUE is a constant in the Integer class of java.lang package
        // that specifies that stores the minimum possible value for any integer variable in Java.
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
