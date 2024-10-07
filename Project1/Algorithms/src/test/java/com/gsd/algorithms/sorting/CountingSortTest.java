package com.gsd.algorithms.sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Yurii - CountingSortTest")
class CountingSortTest {

    private CountingSort sorter;

    @BeforeEach
    @DisplayName("Yurii - Set up CountingSort instance")
    void setUp() {
        sorter = new CountingSort();
    }

    @AfterEach
    @DisplayName("Yurii - Tear down CountingSort instance")
    void tearDown() {
        sorter = null;
    }

    @Test
    @DisplayName("Yurii - Sorting an array with positive, negative, and zero values")
    void sort() {
        int[] values = {4, -10, 0, 6, 1, -5, -5, 1, 1, -2, 0, 6, 8, -7, 10};
        sorter.sort(values);

        int[] expected = {-10, -7, -5, -5, -2, 0, 0, 1, 1, 1, 4, 6, 6, 8, 10};
        assertArrayEquals(expected, values, "The array should be correctly sorted in ascending order");
    }

    @Test
    @DisplayName("Yurii - Sorting an empty array")
    void sortEmptyArray() {
        int[] values = {};
        sorter.sort(values);

        int[] expected = {};
        assertArrayEquals(expected, values, "An empty array should remain empty after sorting");
    }

    @Test
    @DisplayName("Yurii - Sorting an array with all identical elements")
    void sortIdenticalElements() {
        int[] values = {3, 3, 3, 3, 3};
        sorter.sort(values);

        int[] expected = {3, 3, 3, 3, 3};
        assertArrayEquals(expected, values, "An array with all identical elements should remain unchanged after sorting");
    }

    @Test
    @DisplayName("Yurii - Sorting an already sorted array")
    void sortAlreadySorted() {
        int[] values = {-5, -2, 0, 1, 4, 6, 8, 10};
        sorter.sort(values);

        int[] expected = {-5, -2, 0, 1, 4, 6, 8, 10};
        assertArrayEquals(expected, values, "An already sorted array should remain unchanged after sorting");
    }

    @Test
    @DisplayName("Yurii - Sorting an array with a single element")
    void sortSingleElement() {
        int[] values = {7};
        sorter.sort(values);

        int[] expected = {7};
        assertArrayEquals(expected, values, "An array with a single element should remain unchanged after sorting");
    }
}
