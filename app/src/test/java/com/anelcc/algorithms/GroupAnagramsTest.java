package com.anelcc.algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams;

    @Before
    public void setUp() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void ShouldReturnGroupAnagrams() {
        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List groupAnagram = new ArrayList();

        List groupAnagram0 = new ArrayList();
        groupAnagram0.add("eat");
        groupAnagram0.add("tea");
        groupAnagram0.add("ate");

        List groupAnagram2 = new ArrayList();
        groupAnagram2.add("bat");

        List groupAnagram1 = new ArrayList();
        groupAnagram1.add("tan");
        groupAnagram1.add("nat");

        groupAnagram.add(groupAnagram0);
        groupAnagram.add(groupAnagram2);
        groupAnagram.add(groupAnagram1);

        assertEquals(3, groupAnagrams.groupAnagrams(array).size());
        assertEquals(groupAnagram, groupAnagrams.groupAnagrams(array));

        assertEquals(groupAnagram0.get(0), groupAnagrams.groupAnagrams(array).get(0).get(0));
        assertEquals(groupAnagram0.get(1), groupAnagrams.groupAnagrams(array).get(0).get(1));
        assertEquals(groupAnagram0.get(2), groupAnagrams.groupAnagrams(array).get(0).get(2));

        assertEquals(groupAnagram2.get(0), groupAnagrams.groupAnagrams(array).get(1).get(0));

        assertEquals(groupAnagram1.get(0), groupAnagrams.groupAnagrams(array).get(2).get(0));
        assertEquals(groupAnagram1.get(1), groupAnagrams.groupAnagrams(array).get(2).get(1));

    }
}