package com.anelcc.algorithms;


import android.os.Build;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import androidx.annotation.RequiresApi;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
*/
public class SingleNumber {
    //XOR ---> num ^ num2 compares corresponding bits of num and num2 and generates 1 if they are not equal, else it returns 0.
    //The num XOR num2 operation is equivalent to (num AND !num2) OR (!num AND num2).
    public int singleNumberForXor(int[] nums) {
        int num = 0;
        for (int num2 : nums) {
            num = num ^ num2;
        }
        return num;
    }

    //use the lambda with XOR
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int singleNumberForLambda(int[] nums) {
     return Arrays.stream(nums).reduce(0,(num, num2) -> num ^ num2);
    }

    public int singleNumberHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            if (!set.add(n)) {
                set.remove(n);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}
