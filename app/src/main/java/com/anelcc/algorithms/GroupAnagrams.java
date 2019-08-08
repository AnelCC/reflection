package com.anelcc.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
*/
public class GroupAnagrams {



    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList();
        HashMap<String, List<String>> map = new HashMap();

        for (String current : strs){
            char[] characteres = current.toCharArray();
            Arrays.sort(characteres);
            String sorted = new String(characteres);

            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList());
            }
            map.get(sorted).add(current);
        }

        groupAnagrams.addAll(map.values());
        return groupAnagrams;
    }
}
