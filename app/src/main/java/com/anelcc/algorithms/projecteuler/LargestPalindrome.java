package com.anelcc.algorithms.projecteuler;

/*
Largest palindrome product

A palindromic number reads the same both ways.
The largest palindrome made from the product of
two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of
two 3-digit numbers.
*/
public class LargestPalindrome {

    public int palindrome() {
        int STAR_LIMIT = 100;
        int END_LIMIT = 1000;

        int highestSoFar = 0;


        for (int i = STAR_LIMIT; i < END_LIMIT; i++) {
            //posible combination of number, and multiplicate between each
            for (int j = STAR_LIMIT; j < END_LIMIT; j++) {
                //i * j is a palindrome
                if (isPalindrome(i * j)) {
                    highestSoFar = ((i * j) > highestSoFar) ? i * j : highestSoFar;
                }
            }
        }

        System.out.println("The highestSoFar palindrome is " + highestSoFar);
        return highestSoFar;
    }

    private boolean isPalindrome(int num) {
        String numString = String.valueOf(num);
        int beginning = 0;
        int end = numString.length() - 1;

        while (beginning != end && beginning < end) {
            if (numString.charAt(beginning) != numString.charAt(end)) {
                return false;
            }
            beginning++;
            end--;
        }

        return true;
    }


}
