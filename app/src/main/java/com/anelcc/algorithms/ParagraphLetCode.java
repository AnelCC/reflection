package com.anelcc.algorithms;

import android.os.Build;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import androidx.annotation.RequiresApi;

public class ParagraphLetCode {
    private static final String TAG = "TestLetCode";

    //ParagraphLetCode
    /*Given a paragraph and a list of banned words, return the most frequent
    word that is not in the list of banned words.  It is guaranteed there
    is at least one word that isn't banned, and that the answer is unique.

    Words in the list of banned words are given in lowercase, and free of
    punctuation.  Words in the paragraph are not case sensitive.
    The answer is in lowercase.*/
    @RequiresApi(api = Build.VERSION_CODES.N)
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        String[] words = paragraph.replaceAll("[!?',;.]", "").toLowerCase().split("\\s+");


        String rst = "";
        int countMax = 0;

        if (paragraph == null || paragraph.length() == 0) {
            return paragraph;
        }

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > countMax) {
                rst = entry.getKey();
                countMax = entry.getValue();
            }
        }

        return rst;
    }



//Write a program that prints out the occurrences of
// letters in a string For example, given the input
// 'Peter Piper picked a peck of pickled peppers.',
// the program should output:

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

        String str = "Peter Piper picked a peck of pickled peppers.";
        str.replace(".","");
        str.replace(" ","");
        char[] strArrays = str.toCharArray();
        System.out.println("main: "+strArrays[1]);

        //initialized the counter to 0
        Map<String, Integer> count = new HashMap<>();


        for (int i = 0; i < strArrays.length; i++) {
            System.out.println("Counter init ... "+ count.size());
            if (count.isEmpty()) {
                count.put(String.valueOf(strArrays[i]), 1);
            } else {
                System.out.println("else ");
                for (Map.Entry<String, Integer> entry : count.entrySet()) {
                    System.out.println("size: "+count.size());
                    System.out.println("getKey: "+entry.getKey());
                    System.out.println("getValue: "+entry.getValue());
                    System.out.println("strArrays["+i+"]: "+String.valueOf(strArrays[i]));
                    if (String.valueOf(strArrays[i]).equalsIgnoreCase(entry.getKey())) {

                        System.out.println("Anel"+ count.toString());
                        //count.replace(String.valueOf(strArrays[i]), entry.getValue() + 1);
                    } else {
                        count.put(String.valueOf(strArrays[i]), 1);
                    }

                    System.out.println("Counter"+ count.toString());
                    System.out.println("Counter end ... "+ count.size());
                }
            }
        }
        System.out.println("Counter"+ count.toString());
    }
}
