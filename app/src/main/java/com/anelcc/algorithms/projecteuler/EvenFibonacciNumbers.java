package com.anelcc.algorithms.projecteuler;

/*
Each new term in the Fibonacci sequence is generated
by adding the previous two terms. By starting with 1 and 2,
the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values
do not exceed four million, find the sum of the even-valued terms.

Note: The Fibonacci Sequence is the series of numbers:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393
The Rule is xn = xn-1 + xn-2
[0, 1, 1, 2, x ] ---> (0 + 0 = [0], 0 + 1 = [1], 1 + 1 = [2])
 Fn = Fn-1 + Fn-2
 */
public class EvenFibonacciNumbers {
// [0, 1, 1, 2, x ] ---> (0 + 0 = [0], 0 + 1 = [1], 1 + 1 = [2])
    public int fibonacciNumbers() {
        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        int sum = 0;
        do {
            if (num2 % 2 == 0) {
                sum += num2;
            }
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        } while (num2 < 4000000);

        System.out.println(sum);
        return sum;
    }

    public int fibonacciNumbersRule() {
        int sum = 0 ;
        int x1 = 1;
        int x2 = 2;
        while ( x1 < 4000000 ) {
            if ( (x1 & 1) == 0 ){    // x % 2 == 0
                sum += x1;
            }
            x2=x1+x2;                // x2 = sum
            x1=x2-x1;                // x1 = the old value of x2
        }
        System.out.println(sum);
        return sum;
    }
}