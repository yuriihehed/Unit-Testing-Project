package com.gsd.algorithms.datastructures.unionfind;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Yurii - UnionFindTest")
class UnionFindTest {

    private UnionFind uf;

    @BeforeEach
    void setUp() {
        // Initialize UnionFind instance with a size of 10
        uf = new UnionFind(10);
    }

    @AfterEach
    void tearDown() {
        // Clean up resources
        uf = null;
    }

    @Test
    @DisplayName("Find method should return the element itself when no unions are performed")
    void testFindSelfRoot() {
        for (int i = 0; i < 10; i++) {
            assertEquals(i, uf.find(i), "Each element should initially be its own root");
        }
    }

    @Test
    @DisplayName("Find method should return the correct root after unification")
    void testFindAfterUnification() {
        uf.unify(0, 1);
        uf.unify(1, 2);
        uf.unify(3, 4);

        assertEquals(uf.find(0), uf.find(2), "Elements 0, 1, and 2 should have the same root after unification");
        assertEquals(uf.find(3), uf.find(4), "Elements 3 and 4 should have the same root after unification");
    }

    @Test
    @DisplayName("Find method should apply path compression")
    void testFindWithPathCompression() {
        uf.unify(0, 1);
        uf.unify(1, 2);
        uf.unify(2, 3);

        // Initial find should compress the path
        int rootBeforeCompression = uf.find(3);
        assertEquals(uf.find(0), rootBeforeCompression, "Element 3 should point to the root of the unified set after path compression");

        // Verify if path compression worked: after finding, the path should be compressed
        int rootAfterCompression = uf.find(3);
        assertEquals(rootBeforeCompression, rootAfterCompression, "Find method should compress the path to the root");
    }

    @Test
    @DisplayName("Find method should return correct root after multiple independent unifications")
    void testFindMultipleIndependentUnions() {
        uf.unify(0, 1);
        uf.unify(2, 3);
        uf.unify(4, 5);

        assertNotEquals(uf.find(0), uf.find(2), "Root of element 0 should be different from root of element 2 before unifying");
        assertNotEquals(uf.find(2), uf.find(4), "Root of element 2 should be different from root of element 4 before unifying");
    }
}
