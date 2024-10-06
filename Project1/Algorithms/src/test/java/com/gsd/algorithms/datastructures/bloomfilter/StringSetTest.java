package com.gsd.algorithms.datastructures.bloomfilter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSetTest {

    StringSet stringSet;

    @BeforeEach
    void setUp() {
        stringSet = new StringSet(127);  // Initialize with max string length of 127
    }

    @Test
    @DisplayName("StringSet.removeRight should update the hash after removing the rightmost character")
    void removeRight_updatesHash() {
        String str = "exampleString";
        long[] originalHashes = stringSet.computeHash(str);  // Compute original hash
        int rightChar = 'g';  // Last character in the string

        // Remove the rightmost character manually from the hash
        long[] expectedHashes = originalHashes.clone();
        for (int k = 0; k < stringSet.N_HASHES; k++) {
            expectedHashes[k] = stringSet.removeRight(expectedHashes[k], rightChar, k);
        }

        // Verify the computed hash for the string after removing the last character
        stringSet.add(str);
        assertArrayEquals(expectedHashes, stringSet.computeHash(str.substring(0, str.length() - 1)));
    }

    @Test
    @DisplayName("StringSet.removeLeft should update the hash after removing the leftmost character")
    void removeLeft_updatesHash() {
        String str = "anotherTestString";
        long[] originalHashes = stringSet.computeHash(str);  // Compute original hash
        int leftChar = 'a';  // First character in the string
        int len = str.length();

        // Remove the leftmost character manually from the hash
        long[] expectedHashes = originalHashes.clone();
        for (int k = 0; k < stringSet.N_HASHES; k++) {
            expectedHashes[k] = stringSet.removeLeft(expectedHashes[k], leftChar, k, len);
        }

        // Verify the computed hash for the string after removing the first character
        stringSet.add(str);
        assertArrayEquals(expectedHashes, stringSet.computeHash(str.substring(1)));
    }

    @Test
    @DisplayName("StringSet.toString should include added strings")
    void toString_includesAddedStrings() {
        stringSet.add("test1");
        stringSet.add("test2");

        String result = stringSet.toString();
        // Only one assertion to check that a specific string is in the representation
        assertTrue(result.contains("test1"));
    }

    @Test
    @DisplayName("StringSet.toString should include added strings")
    void toString_includesAddedStrings2() {
        stringSet.add("test1");
        stringSet.add("test2");

        String result = stringSet.toString();
        // Separate assertion to check another string
        assertTrue(result.contains("test2"));
    }
}
