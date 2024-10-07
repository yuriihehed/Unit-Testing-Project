package com.gsd.algorithms.datastructures.set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Yurii - HSetTest")
class HSetTest {

    HSet<Integer> hSet;

    @BeforeEach
    @DisplayName("Setting up the test environment")
    void setUp() {
        hSet = new HSet<>();
    }

    @AfterEach
    @DisplayName("Tearing down the test environment")
    void tearDown() {
        hSet.clear();
    }

    @Test
    @DisplayName("HSet size should return 0 after creation")
    void size() {
        assertEquals(0, hSet.size(), "The size of a newly created HSet should be 0");
    }

    @Test
    @DisplayName("HSet clear should remove all elements")
    void clear() {
        hSet.add(1);
        hSet.add(2);
        hSet.clear();
        assertTrue(hSet.isEmpty(), "The HSet should be empty after calling clear");
    }

    @Test
    @DisplayName("HSet isEmpty should return true for an empty set")
    void isEmpty() {
        assertTrue(hSet.isEmpty(), "The HSet should be empty after creation");
        hSet.add(5);
        assertFalse(hSet.isEmpty(), "The HSet should not be empty after adding an element");
    }
}
