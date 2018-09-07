package com.anelcc.algorithms;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class HackerRankBalancedBrackets {
    private static final Scanner scanner = new Scanner(System.in);

    public String init(String args) {
        String result = null;
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            result = getBalancedBracketsHashMap(s);
        }

        scanner.close();
        return result;
    }

    // Complete the isBalanced function below.
    static String getBalancedBracketsHashMap(String s) {
        HashMap<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (brackets.keySet().contains(curr)) {
                stack.push(curr);
            } else if (brackets.values().contains(curr)) {
                if (!stack.empty() && brackets.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return "no";
                }
            }
        }

        return "yes";
    }

    public boolean isBalancedBracketsHashMap(String s) {
        HashMap<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (brackets.keySet().contains(curr)) {
                stack.push(curr);
            } else if (brackets.values().contains(curr)) {
                if (!stack.empty() && brackets.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public boolean isBalancedBracketsStack(String s) {
        Stack stack = new Stack();
        String operator = "({[";
        String operator2 = ")}]";

        for (int i = 0; i < s.length(); i++) {
            if (operator.contains(s.substring(i, i + 1))) {
                int index = operator.indexOf(s.substring(i, i + 1));
                stack.push(operator2.charAt(index));
            } else if (stack.isEmpty())
                return false;
            else {
                char myChar = (char) stack.pop();
                if (myChar == s.charAt(i))
                    return false;
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}
