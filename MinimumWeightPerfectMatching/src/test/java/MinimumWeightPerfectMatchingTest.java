package com.gsd.algorithms.dp.MinimumWeightPerfectMatching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Dean - MinimumWeightPerfectMatching Tests")
class MinimumWeightPerfectMatchingTest {

    MinimumWeightPerfectMatching mwpm;

    @BeforeEach
    void setUp() {
        mwpm = new MinimumWeightPerfectMatching();
    }

    @Test
    @DisplayName("MinimumWeightPerfectMatching.include should correctly include the element")
    void testInclude() {
        mwpm.include(5);  // Example element
        assertTrue(mwpm.contains(5), "Element 5 should be included in the matching");
    }
}
