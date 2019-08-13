package com.anelcc.algorithms.projecteuler;

import java.util.ArrayList;

/*
Largest prime factor
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
public class LargestPrimeFactor {

/*Mientras que n es divisible por 2, imprime 2 y divide n entre 2.
Después del paso 1, n debe ser impar. Ahora comience un ciclo desde i = 3 hasta la raíz cuadrada de n . Mientras que divide n , imprimir i y dividir n por i , incrementar i por 2 y continuar.
Si n es un número primo y es mayor que 2, entonces n no se convertirá en 1 en los dos pasos anteriores. Entonces imprima n si es mayor que 2.*/
    public ArrayList<Long> primeFactorList(long n) {
        // Print the number of 2s that divide n
        ArrayList<Long> primerFactorList = new ArrayList<>();
        while (n % 2 == 0) {
            primerFactorList.add(2L);
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (long i = 3L; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                primerFactorList.add(i);
                System.out.print(i + " ");
                n /= i;
            }
        }

        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2){
            System.out.print(n);
            primerFactorList.add(n);
        }
        System.out.println("");
        return primerFactorList;
    }

    public long largestPrimeFactor(long N){
       // long N = 600851475143L;

        // First, start from the maximum number and divide by 2
        // until you can no longer divide evenly by 2, i.e., the number is odd
        while (N % 2 == 0) {

            // in the case of 600851475143 this will be skipped entirely since it is an odd number,
            // but for the sake of generality we will keep it so it can be used on any number
            N /= 2;
        }

        // the next prime number is 3, and all prime numbers from there are odd numbers,
        // so we can safely just add 2 to the factor each time and only test for odd numbers
        // note that this has a small inefficiency in that it will also test for a few non-prime odd numbers
        // like 9, 15, 21, etc. but it's much less computational work to try dividing by a candidate factor than to test for primality.
        for (long factor = 3; factor < N; factor += 2) {

            // if N is evenly divisible by the factor, then we just divide it, and we keep going
            // until N can no longer be divided by a number smaller than itself,
            // in other words, until N is a prime number
            while (N % factor == 0 && factor < N) {
                N /= factor;
            }
        }
        System.out.println("The answer is " + N);

        return N;
    }
}
