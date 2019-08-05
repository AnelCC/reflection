package com.anelcc.algorithms.hashset;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueEmailAddressesTest {

    private UniqueEmailAddresses uniqueEmailAddresses;
    @Before
    public void setUp() throws Exception {
        uniqueEmailAddresses = new UniqueEmailAddresses();
    }

    @After
    public void tearDown() {
        uniqueEmailAddresses = null;
    }

    @Test
    public void numUniqueEmail() {
        String[] emails = new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertEquals(2, uniqueEmailAddresses.numUniqueEmails(emails));
    }
    @Test
    public void numUniqueEmailByReplace() {
        String[] emails = new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertEquals(2, uniqueEmailAddresses.numUniqueEmail(emails));
    }
    @Test
    public void numUniqueEmails() {
        String[] emails = new String[] {"anel+alex@leetcode.com","test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertEquals(3, uniqueEmailAddresses.numUniqueEmails(emails));
    }
    @Test
    public void numUniqueEmailsByReplace() {
        String[] emails = new String[] {"anel+alex@leetcode.com","test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertEquals(3, uniqueEmailAddresses.numUniqueEmail(emails));
    }
}