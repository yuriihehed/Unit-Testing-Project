package com.gsd.algorithms.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWeightPerfectMatchingTest {

    private MinimumWeightPerfectMatching matchingAlgorithm;

    @BeforeEach
    void setUp() {
        matchingAlgorithm = new MinimumWeightPerfectMatching();
    }

    @Test
    void testMinWeightCostForSmallGraph() {
        // Example 2x2 cost matrix
        int[][] costMatrix = {
                {4, 1},
                {2, 3}
        };

        int result = matchingAlgorithm.getMinWeightCostMatching(costMatrix);
        assertEquals(3, result);  // Minimum matching cost should be 3
    }

    @Test
    void testMinWeightCostForLargerGraph() {
        // Example 3x3 cost matrix
        int[][] costMatrix = {
                {9, 11, 14},
                {6, 15, 13},
                {12, 13, 6}
        };

        int result = matchingAlgorithm.getMinWeightCostMatching(costMatrix);
        assertEquals(18, result);  // Minimum matching cost should be 18
    }

    @Test
    void testMinWeightCostForIdenticalCosts() {
        // Example 3x3 matrix where all costs are the same
        int[][] costMatrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int result = matchingAlgorithm.getMinWeightCostMatching(costMatrix);
        assertEquals(3, result);  // Since all matchings have the same cost, the min will be 3
    }

    @Test
    void testMinWeightCostWithZeros() {
        // Example where some elements are zero
        int[][] costMatrix = {
                {0, 2, 9},
                {1, 0, 3},
                {6, 7, 0}
        };

        int result = matchingAlgorithm.getMinWeightCostMatching(costMatrix);
        assertEquals(0, result);  // Minimum matching cost should be 0
    }

    @Test
    void testMinWeightCostForSingleElementMatrix() {
        // Edge case: 1x1 matrix
        int[][] costMatrix = {
                {42}
        };

        int result = matchingAlgorithm.getMinWeightCostMatching(costMatrix);
        assertEquals(42, result);  // Only one matching possible, so the result should be 42
    }
}