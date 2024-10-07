package com.gsd.algorithms.datastructures.binarysearchtree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplayTreeTest {
    private SplayTree<Integer> tree;

    @BeforeEach
    void setUp() {
        tree = new SplayTree<>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

    }
    @Test
    void getRoot() {
        assertEquals(3,tree.getRoot().getData(),"Root should be the last accessed element.");
    }

    @Test
    void getData(){
        assertEquals(2, tree.search(2).getData(), "Search should return node with data 2.");
        assertEquals(3, tree.search(3).getData(), "Search should return node with data 3.");

    }
}