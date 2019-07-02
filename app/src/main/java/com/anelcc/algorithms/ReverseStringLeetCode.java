package com.anelcc.algorithms;

public class ReverseStringLeetCode {
    /*Given a string and an integer k, you need to reverse the first k characters for every 2k characters
    counting from the start of the string. If there are less than k characters left, reverse all of them.
    If there are less than 2k but greater than or equal to k characters, then reverse the first k characters
    and left the other as original.

    Example:
    Input: s = "abcdefg", k = 2
    Output: "bacdfeg"
    Expected: "bacdfeg"
    */

    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }

        return new String(a);
    }


/*
    You are developing a new programming language and currently working on variable names. You have a list of words that you consider to be good and could be used for variable names. All the strings in words consist of lowercase English letters.

    A complex variable name is a combination (possibly with repetitions) of some strings from words, written in CamelCase. In other words, all the strings are written without spaces and each string (with the possible exception of the first one) starts with a capital letter.

    Your programming language should accept complex variable names only.

    You need to check if the variableName is accepted by your programming language.

    Example*/


}
