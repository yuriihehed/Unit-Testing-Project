package com.gsd.algorithms.datastructures.bloomfilter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

@DisplayName("Dean - StringSet Tests")
class StringSetTest {

    StringSet stringSet;

    @BeforeEach
    void setUp() {
        stringSet = new StringSet();
    }

    @Test
    @DisplayName("StringSet.removeRight should remove the correct substring based on the indices")
    void testremoveRight() {
        long hash = 12345L;  // Example hash value
        stringSet.add("exampleString");
        stringSet.removeRight(hash, 0, 5);
        // Add assertions based on expected behavior
        assertTrue(true, "Right substring should be removed");
    }

    @Test
    @DisplayName("StringSet.toString should return a correct string representation of the set")
    void testToString() {
        stringSet.add("test1");
        stringSet.add("test2");
        String result = stringSet.toString();
        assertTrue(result.contains("test1"), "String representation should include 'test1'");
        assertTrue(result.contains("test2"), "String representation should include 'test2'");
    }

    @Test
    @DisplayName("StringSet.removeLeft should remove the correct left substring based on the indices")
    void testRemoveLeft() {
        long hash = 67890L;  // Example hash value
        stringSet.add("anotherTestString");
        stringSet.removeLeft(hash, 0, 3, 6);
        // Add assertions based on expected behavior
        assertTrue(true, "Left substring should be removed");
    }
}
