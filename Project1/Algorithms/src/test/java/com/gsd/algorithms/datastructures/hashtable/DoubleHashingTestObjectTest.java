package com.gsd.algorithms.datastructures.hashtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleHashingTestObjectTest {

    @Test
    void testEqualsSameInt() {
        DoubleHashingTestObject obj1 = new DoubleHashingTestObject(42);
        DoubleHashingTestObject obj2 = new DoubleHashingTestObject(42);
        assertTrue(obj1.equals(obj2)); // Expecting true for same int values
    }

    @Test
    void testEqualsSameIntArray() {
        DoubleHashingTestObject obj1 = new DoubleHashingTestObject(new int[]{1, 2, 3});
        DoubleHashingTestObject obj2 = new DoubleHashingTestObject(new int[]{1, 2, 3});
        assertTrue(obj1.equals(obj2)); // Expecting true for same int arrays
    }

    @Test
    void testEqualsSameString() {
        DoubleHashingTestObject obj1 = new DoubleHashingTestObject("test");
        DoubleHashingTestObject obj2 = new DoubleHashingTestObject("test");
        assertTrue(obj1.equals(obj2)); // Expecting true for same strings
    }

    @Test
    void testNotEqualsDifferentInt() {
        DoubleHashingTestObject obj1 = new DoubleHashingTestObject(42);
        DoubleHashingTestObject obj2 = new DoubleHashingTestObject(43);
        assertFalse(obj1.equals(obj2)); // Expecting false for different int values
    }

    @Test
    void testNotEqualsDifferentIntArray() {
        DoubleHashingTestObject obj1 = new DoubleHashingTestObject(new int[]{1, 2, 3});
        DoubleHashingTestObject obj2 = new DoubleHashingTestObject(new int[]{1, 2, 4});
        assertFalse(obj1.equals(obj2)); // Expecting false for different int arrays
    }

    @Test
    void testNotEqualsDifferentString() {
        DoubleHashingTestObject obj1 = new DoubleHashingTestObject("test");
        DoubleHashingTestObject obj2 = new DoubleHashingTestObject("different");
        assertFalse(obj1.equals(obj2)); // Expecting false for different strings
    }
}
