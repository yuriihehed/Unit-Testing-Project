package com.gsd.algorithms.datastructures.dynamicarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    private DynamicArray<Integer> dynamicArray;

    @BeforeEach
    void setUp() {
        dynamicArray = new DynamicArray<>();
    }

    @Test
    void isEmpty() {
        // Initially, the dynamic array should be empty
        assertTrue(dynamicArray.isEmpty(), "The array should be empty initially.");

        // Add an element, and the array should no longer be empty
        dynamicArray.add(1);
        assertFalse(dynamicArray.isEmpty(), "The array should not be empty after adding an element.");



    }
}