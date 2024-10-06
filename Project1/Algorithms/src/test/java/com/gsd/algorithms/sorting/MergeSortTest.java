package com.gsd.algorithms.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Vinod : method with cc:5")
class MergeSortTest {

    private  final MergeSort mergeSort = new MergeSort();

    static  Object[][] data(){
        return new Object[][]{
                {new int[]{4,3,7,6,8,9,5}, new int[]{3,4,5,6,7,8,9}},
                {new int[]{-7,10,44,73,-20}, new int[]{-20,-7,10,44,73}},
                {new int[]{10, 4, 6, 4, 8, -13, 2, 3}, new int[]{-13, 2, 3, 4, 4, 6, 8, 10}},
                {new int[]{-13, 0, 1, 2, 3, 4, 4, 6, 8, 10}, new int[]{-13, 0, 1, 2, 3, 4, 4, 6, 8, 10}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    @DisplayName("Test the sorting Algorithm")
    void testMergeSort(int[] input, int[] expected) {
        mergeSort.sort(input);
        assertArrayEquals(input,expected);
    }
}