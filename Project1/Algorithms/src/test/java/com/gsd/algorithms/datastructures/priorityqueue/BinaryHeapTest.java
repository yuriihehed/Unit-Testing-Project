package com.gsd.algorithms.datastructures.priorityqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Lamees - BinaryHeapTest")
class BinaryHeapTest {

    BinaryHeap<Integer> binaryHeap ;
    @BeforeEach
    void setUp() {
        binaryHeap = new BinaryHeap<>();
    }

    // Tests for isEmpty()
    @Test
    @DisplayName("Lamees A. testing isEmpty() CC=1: Binary heap should be empty after creation")
    void testIsEmptyAfterCreation() {
        assertTrue(binaryHeap.isEmpty(), "Binary heap should be empty after creation");
    }

    @Test
    @DisplayName("Lamees A. testing isEmpty() CC=1: Binary heap should not be empty after adding an element")
    void testIsNotEmptyAfterAdd() {
        binaryHeap.add(5);
        assertFalse(binaryHeap.isEmpty(), "Binary heap should not be empty after adding an element");
    }

    @Test
    @DisplayName("Lamees A. testing isEmpty() CC=1: Binary heap should be empty after removing all elements")
    void testIsEmptyAfterRemove() {
        binaryHeap.add(5);
        binaryHeap.poll(); // Remove the only element
        assertTrue(binaryHeap.isEmpty(), "Binary heap should be empty after removing all elements");
    }

    // Tests for size()
    @Test
    @DisplayName("Lamees A. testing size() CC=1: Binary heap should have size 0 after creation")
    void testSizeAfterCreation() {
        assertEquals(0, binaryHeap.size(), "Binary heap size should be 0 after creation");
    }

    @Test
    @DisplayName("Lamees A. testing size() CC=1: Binary heap size should be 1 after adding an element")
    void testSizeAfterAdd() {
        binaryHeap.add(10);
        assertEquals(1, binaryHeap.size(), "Binary heap size should be 1 after adding one element");
    }

    @Test
    @DisplayName("Lamees A. testing size() CC=1: Binary heap size should be 0 after removing the only element")
    void testSizeAfterRemove() {
        binaryHeap.add(10);
        binaryHeap.poll(); // Remove the only element
        assertEquals(0, binaryHeap.size(), "Binary heap size should be 0 after removing the only element");
    }

    @Test
    @DisplayName("Lamees A. testing size() CC=1: Binary heap size should increase correctly with multiple elements")
    void testSizeAfterMultipleAdds() {
        binaryHeap.add(10);
        binaryHeap.add(20);
        binaryHeap.add(30);
        assertEquals(3, binaryHeap.size(), "Binary heap size should be 3 after adding three elements");
    }

    @Test
    @DisplayName("Lamees A. testing size() CC=1: Binary heap size should decrease correctly with multiple removes")
    void testSizeAfterMultipleRemoves() {
        binaryHeap.add(10);
        binaryHeap.add(20);
        binaryHeap.add(30);
        binaryHeap.poll(); // Remove one element
        assertEquals(2, binaryHeap.size(), "Binary heap size should be 2 after removing one element");
    }

    // Tests for peek()
    @Test
    @DisplayName("Lamees A. testing peek() CC=2: Binary heap peek should return null when heap is empty")
    void testPeekOnEmptyHeap() {
        assertNull(binaryHeap.peek(), "Peek should return null when the heap is empty");
    }

    @Test
    @DisplayName("Lamees A. testing peek() CC=2: Binary heap peek should return the smallest element after adding one element")
    void testPeekAfterAddOneElement() {
        binaryHeap.add(15);
        assertEquals(15, binaryHeap.peek(), "Peek should return the element after adding one element");
    }

    @Test
    @DisplayName("Lamees A. testing peek() CC=2: Binary heap peek should return the smallest element after adding multiple elements")
    void testPeekAfterMultipleAdds() {
        binaryHeap.add(30);
        binaryHeap.add(10);
        binaryHeap.add(20);
        assertEquals(10, binaryHeap.peek(), "Peek should return the smallest element after adding multiple elements");
    }

    @Test
    @DisplayName("Lamees A. testing peek() CC=2: Binary heap peek should return the correct smallest element after removal")
    void testPeekAfterRemove() {
        binaryHeap.add(30);
        binaryHeap.add(10);
        binaryHeap.add(20);
        binaryHeap.poll(); // Remove the smallest element (10)
        assertEquals(20, binaryHeap.peek(), "Peek should return the next smallest element after removal");
    }

    // Tests for contains (T elem)
    @Test
    @DisplayName("Lamees A. testing contains(T elem) CC=3: Binary heap contains should return false when heap is empty")
    void testContainsOnEmptyHeap() {
        assertFalse(binaryHeap.contains(10), "Contains should return false when the heap is empty");
    }

    @Test
    @DisplayName("Lamees A. testing contains(T elem) CC=3: Binary heap contains should return true for an element that exists")
    void testContainsForExistingElement() {
        binaryHeap.add(10);
        binaryHeap.add(20);
        binaryHeap.add(30);
        assertTrue(binaryHeap.contains(20), "Contains should return true for an element that exists in the heap");
    }

    @Test
    @DisplayName("Lamees A. testing contains(T elem) CC=3 Binary heap contains should return false for an element that does not exist")
    void testContainsForNonExistingElement() {
        binaryHeap.add(10);
        binaryHeap.add(20);
        binaryHeap.add(30);
        assertFalse(binaryHeap.contains(40), "Contains should return false for an element that does not exist in the heap");
    }

    @Test
    @DisplayName("Lamees A. testing contains(T elem) CC=3: Binary heap contains should handle null input")
    void testContainsWithNull() {
        assertFalse(binaryHeap.contains(null), "Contains should return false when null is passed as input");
    }

    // Tests for removeAt(T elem)
    @Test
    @DisplayName("Lamees A. testing removeAt(T elem) CC=4: Binary heap remove should return false when the heap is empty")
    void testRemoveOnEmptyHeap() {
        assertFalse(binaryHeap.remove(10), "Remove should return false when the heap is empty");
    }

    @Test
    @DisplayName("Lamees A. testing removeAt(T elem) CC=4: Binary heap remove should return false when trying to remove null")
    void testRemoveNull() {
        assertFalse(binaryHeap.remove(null), "Remove should return false when trying to remove null");
    }

    @Test
    @DisplayName("Lamees A. testing removeAt(T elem) CC=4: Binary heap remove should return true for an existing element")
    void testRemoveExistingElement() {
        binaryHeap.add(10);
        binaryHeap.add(20);
        binaryHeap.add(30);
        assertTrue(binaryHeap.remove(20), "Remove should return true for an existing element in the heap");
    }

    @Test
    @DisplayName("Lamees A. testing removeAt(T elem) CC=4: Binary heap remove should return false for a non-existing element")
    void testRemoveNonExistingElement() {
        binaryHeap.add(10);
        binaryHeap.add(20);
        binaryHeap.add(30);
        assertFalse(binaryHeap.remove(40), "Remove should return false for a non-existing element in the heap");
    }

    @Test
    @DisplayName("Lamees A. testing removeAt(T elem) CC=4: Binary heap should have the correct size after removal")
    void testSizeAfterRemoval() {
        binaryHeap.add(10);
        binaryHeap.add(20);
        binaryHeap.add(30);
        binaryHeap.remove(20);
        assertEquals(2, binaryHeap.size(), "Heap size should decrease after removing an element");
    }


}