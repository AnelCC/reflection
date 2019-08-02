package com.anelcc.algorithms.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsolutePathTest {

    private AbsolutePath model;

    @Test
    public void simplifyPath() {
        model = new AbsolutePath();
        String path = "/home//foo/";
        assertEquals("/home/foo", model.simplifyPath(path));
    }
    @Test
    public void simplifyPathWhenHasAnotherValues() {
        model = new AbsolutePath();
        String path = "/a/../../b/../c//.//";
        assertEquals("/c", model.simplifyPath(path));
    }
    @Test
    public void simplifyPathWhenHasAnotherValuesTest() {
        model = new AbsolutePath();
        String path = "/a//b////c/d//././/..";
        assertEquals("/a/b/c", model.simplifyPath(path));
    }
}