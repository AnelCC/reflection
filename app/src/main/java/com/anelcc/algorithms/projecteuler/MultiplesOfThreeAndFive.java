package com.anelcc.algorithms.projecteuler;

import java.util.ArrayList;
import java.util.List;

/*
Multiples of 3 and 5

Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class MultiplesOfThreeAndFive {

    public int multiplesOfThreeAndFive () {
        int sum = 0;
        List<Integer> oneHundredNumbers = new ArrayList();

        int numbers = 1;
        while (oneHundredNumbers.size() < 999)
            oneHundredNumbers.add(numbers++);

        for (int number: oneHundredNumbers) {
            if (number%3==0 || number%5==0){
                sum = sum + number;
                System.out.println("This number is multiple of 3 or 5 :::: "+number);
                System.out.println("The sum is "+sum);
            }
        }

        return sum;
    }
}
