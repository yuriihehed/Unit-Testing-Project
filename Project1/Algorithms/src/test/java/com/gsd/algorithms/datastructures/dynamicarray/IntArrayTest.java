package com.gsd.algorithms.datastructures.dynamicarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Saad - IntArrayTest")
class IntArrayTest {

    IntArray intArray;

    @BeforeEach
    void setUp() {
        intArray = new IntArray();
    }

    // Tests for isEmpty()
    @Test
    @DisplayName("IntArray should start as empty")
    void testIsEmptyAfterCreation() {
        assertTrue(intArray.isEmpty(), "Array should initially be empty");
    }

    @Test
    @DisplayName("IntArray should not be empty after adding an element")
    void testIsNotEmptyAfterAdd() {
        intArray.add(10);
        assertFalse(intArray.isEmpty(), "Array should not be empty after adding an element");
    }

    // Tests for size()
    @Test
    @DisplayName("IntArray should have size 0 upon creation")
    void testSizeAfterCreation() {
        assertEquals(0, intArray.size(), "Newly created array should have size 0");
    }

    @Test
    @DisplayName("IntArray size should reflect the number of added elements")
    void testSizeAfterAdd() {
        intArray.add(10);
        assertEquals(1, intArray.size(), "Size should be 1 after adding one element");
        intArray.add(20);
        assertEquals(2, intArray.size(), "Size should be 2 after adding another element");
    }

    // Tests for get()
    @Test
    @DisplayName("IntArray should return correct values based on index")
    void testGetElement() {
        intArray.add(10);
        intArray.add(20);
        assertEquals(10, intArray.get(0), "Expected value at index 0 is 10");
        assertEquals(20, intArray.get(1), "Expected value at index 1 is 20");
    }


    // Tests for add()
    @Test
    @DisplayName("IntArray should correctly add elements")
    void testAddElements() {
        intArray.add(10);
        intArray.add(20);
        assertEquals(2, intArray.size(), "Array size should reflect the number of elements added");
        assertEquals(10, intArray.get(0), "First element should be 10");
        assertEquals(20, intArray.get(1), "Second element should be 20");
    }

    @Test
    @DisplayName("IntArray should resize correctly when capacity is exceeded")
    void testAddWithResizing() {
        // Add more elements than the default capacity
        for (int i = 0; i < 10; i++) {
            intArray.add(i);
        }
        assertEquals(10, intArray.size(), "Array size should be 10 after adding 10 elements");
        assertEquals(9, intArray.get(9), "The last element should be 9 after adding 10 elements");
    }

    @Test
    @DisplayName("IntArray should resize when adding more elements than initial capacity")
    void testAddResizeBehavior() {
        IntArray smallArray = new IntArray(2);
        smallArray.add(1);
        smallArray.add(2);
        smallArray.add(3); // Triggers resizing
        assertEquals(3, smallArray.size(), "Array should resize and have size 3 after adding three elements");
        assertEquals(1, smallArray.get(0), "Element 1 should be at index 0");
        assertEquals(2, smallArray.get(1), "Element 2 should be at index 1");
        assertEquals(3, smallArray.get(2), "Element 3 should be at index 2");
    }
}
