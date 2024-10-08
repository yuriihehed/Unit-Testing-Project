package com.gsd.algorithms.datastructures.bloomfilter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("StringSet Tests by Dean")
public class StringSetTest {

    @Test
    @DisplayName("Add and contains method test for 'hello'")
    public void testAdd() {
        StringSet stringSet = new StringSet(100);
        stringSet.add("hello");
        assertTrue(stringSet.contains("hello"), "StringSet should contain 'hello'");
    }

    @Test
    @DisplayName("Compute hash method test for 'hello'")
    public void testComputeHash() {
        StringSet stringSet = new StringSet(100);
        long[] hashes = stringSet.computeHash("hello");
        assertNotNull(hashes, "Hashes should not be null");
    }

    @Test
    @DisplayName("Remove rightmost character test for 'hello'")
    public void testRemoveRight() {
        StringSet stringSet = new StringSet(100);
        long[] hashes = stringSet.computeHash("hello");
        long expected = hashes[0];
        for (int i = 0; i < "hello".length(); i++) {
            expected = stringSet.removeRight(expected, "hello".charAt("hello".length() - 1 - i), 0);
        }
        assertEquals(0, expected, "Hashes should match after removing rightmost character");
    }

    @Test
    @DisplayName("Remove leftmost character test for 'hello'")
    public void testRemoveLeft() {
        StringSet stringSet = new StringSet(100);
        long[] hashes = stringSet.computeHash("hello");
        long rollingHash = hashes[0];
        for (int i = 0; i < "hello".length(); i++) {
            rollingHash = stringSet.removeLeft(rollingHash, "hello".charAt(i), 0, "hello".length() - i);
        }
        assertEquals(0, rollingHash, "Hashes should match after removing leftmost character");
    }

    @Test
    @DisplayName("toString method should return non-null string")
    public void testToString() {
        StringSet stringSet = new StringSet(100);
        stringSet.add("hello");
        assertNotNull(stringSet.toString(), "toString should not be null");
    }
}
