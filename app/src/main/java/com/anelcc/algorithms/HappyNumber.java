package com.anelcc.algorithms;

import java.util.ArrayList;
import java.util.List;
/*
Write an algorithm to determine if a number n is "happy".
A happy number is a number defined by the following process: Starting with any
positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.
Return True if n is a happy number, and False if not.*/

public class HappyNumber {
    //Using Floyd Cycle detection algorithm
    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = sumDigitSquare(slow);
            fast = sumDigitSquare(fast);
            fast = sumDigitSquare(fast);
        } while(slow != fast);
        if (slow == 1) return true;
        else return false;
    }

    public boolean isHappyNumberInArrayList(int n) {
        List<Integer> visited = new ArrayList();

        while (true)  {
            if (n == 1)
                return true;
            n = sumDigitSquare(n);

            if (visited.contains(n))
                return false;
            visited.add(n);
        }
    }

    public boolean isHappyNumber(int n) {
        while (true)  {
            if (n == 1)
                return true;
            n = sumDigitSquare(n);
            if (n == 4)
                return false;
        }
    }

    private static int sumDigitSquare(int n) {
        int sum = 0;
        while (n > 0)  {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
