package com.anelcc.algorithms.hashset;

//LeetCode

import java.util.HashSet;
import java.util.Set;

/**
 * Every email consists of a local name and a domain name, separated by the @ sign.
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 * If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
 * It is possible to use both of these rules at the same time.
 * Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
 *
 *
 * public class HashSet<E>
 * extends AbstractSet<E>
 * implements Set<E>, Cloneable, Serializable
 * This class implements the Set interface, backed by a hash table (actually a HashMap instance).
 * It makes no guarantees as to the iteration order of the set; in particular,
 * it does not guarantee that the order will remain constant over time. This class permits the null element.
 * This class offers constant time performance for the basic operations (add, remove, contains and size),
 * assuming the hash function disperses the elements properly among the buckets.
 * Iterating over this set requires time proportional to the sum of
 * the HashSet instance's size (the number of elements) plus the "capacity" of the backing HashMap instance (the number of buckets).
 * T
 * hus, it's very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important.
 */
public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        HashSet<String> result = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for (String email : emails) {
            char[] chars = email.toCharArray();
            builder.delete(0, builder.length());
            boolean plus = false;
            for (int i = 0; i < chars.length; i++) {
                char tmp = chars[i];
                if (tmp == '.') {
                    continue;
                } else if (tmp == '+') {
                    plus = true;
                } else if (tmp == '@') {
                    plus = false;
                    builder.append(chars,i,chars.length-i);
                } else {
                    if (!plus)
                        builder.append(tmp);
                }
            }
            result.add(builder.toString());
        }
        return result.size();
    }


    public int numUniqueEmail(String[] emails) {
        Set<String> normalized = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@"); // split into local and domain parts.
            String[] local = parts[0].split("\\+"); // split local by '+'.
            normalized.add(local[0].replace(".", "") + "@" + parts[1]); // remove all '.', and concatenate '@' and domain.
        }
        return normalized.size();
    }
}
