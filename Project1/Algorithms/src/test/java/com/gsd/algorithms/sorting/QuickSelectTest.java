package com.gsd.algorithms.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Saad - QuickSelectTest")
class QuickSelectTest {

    QuickSelect quickSelect;

    @BeforeEach
    void setUp() {
        quickSelect = new QuickSelect();
    }

    @Test
    @DisplayName("Test when array is null")
    void testArrayIsNull() {
        int[] arr = null;
        Integer result = quickSelect.quickSelect(arr, 1);
        assertNull(result, "quickSelect should return null when the array is null");
    }

    @Test
    @DisplayName("Test when k is greater than the array length")
    void testKGreaterThanLength() {
        int[] arr = {1, 2, 3};
        Integer result = quickSelect.quickSelect(arr, 5);
        assertNull(result, "quickSelect should return null when k is greater than the array length");
    }

    @Test
    @DisplayName("Test when k is less than 1")
    void testKLessThanOne() {
        int[] arr = {1, 2, 3};
        Integer result = quickSelect.quickSelect(arr, 0);
        assertNull(result, "quickSelect should return null when k is less than 1");
    }

    @Test
    @DisplayName("Test quickSelect with valid input")
    void testValidInput() {
        int[] arr = {3, 2, 1, 5, 4};
        Integer result = quickSelect.quickSelect(arr, 3);
        assertEquals(3, result, "quickSelect should return the 3rd smallest element");
    }


    @Test
    @DisplayName("Test quickSelect with negative numbers")
    void testWithNegativeNumbers() {
        int[] arr = {-10, 4, 6, 4, 8, -13, 1, 3};
        Integer result = quickSelect.quickSelect(arr, 3);
        assertEquals(1, result, "quickSelect should return the 3rd smallest element with negative numbers");
    }
}
