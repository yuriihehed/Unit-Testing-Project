package com.gsd.algorithms.datastructures.binarysearchtree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Dean: SplayTree Tests")
class SplayTreeTest {

    private SplayTree<Integer> splayTree;

    @BeforeEach
    @DisplayName("Dean: Setup for SplayTree Tests")
    void setUp() {
        splayTree = new SplayTree<>();
    }

    @AfterEach
    @DisplayName("Dean: Cleanup after SplayTree Tests")
    void tearDown() {
        splayTree = null;
    }

    @Test
    @DisplayName("Dean: Delete Method with Complexity Level 3")
    void delete() {
        // Insert some elements
        splayTree.insert(10);
        splayTree.insert(20);
        splayTree.insert(30);

        // Delete one element and check if it's deleted
        assertNotNull(splayTree.delete(20));
        assertNull(splayTree.search(20));  // 20 should be deleted, so search should return null

        // The root may not be 10, so check that it's either 10 or 30 (based on splaying)
        assertTrue(splayTree.getRoot().getData() == 10 || splayTree.getRoot().getData() == 30);

        // Check that 10 and 30 are still in the tree
        assertNotNull(splayTree.search(10));
        assertNotNull(splayTree.search(30));
    }

    @Test
    @DisplayName("Dean: Insert and Delete Multiple Elements")
    void insertAndDeleteMultiple() {
        splayTree.insert(10);
        splayTree.insert(5);
        splayTree.insert(15);

        assertNotNull(splayTree.delete(5));
        assertNull(splayTree.search(5)); // 5 should be deleted

        assertNotNull(splayTree.search(10)); // 10 should still be present
        assertNotNull(splayTree.search(15)); // 15 should still be present
    }
}