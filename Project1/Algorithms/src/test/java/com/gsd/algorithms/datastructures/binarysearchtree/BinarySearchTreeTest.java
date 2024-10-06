package com.gsd.algorithms.datastructures.binarysearchtree;

import com.gsd.algorithms.datastructures.queue.ArrayQueue;
import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> bst;

    @BeforeEach
    public void setUp() {
        bst = new BinarySearchTree<>();
    }

    @AfterEach
    void tearDown() {
        bst = null;
    }

    @Test
    @DisplayName("Test Add to empty tree")
    public void testAddToEmptyTree() {
        assertThat(bst.add(5)).isTrue();
    }

    @Test
    @DisplayName("Test Add duplicate element")
    public void testAddDuplicateElement() {
        bst.add(5);
        assertThat(bst.add(5)).isFalse();
    }

    @Test
    @DisplayName("Test Add to left tree")
    public void testAddLeftTree() {
        bst.add(5);
        assertThat(bst.add(1)).isTrue();
    }

    @Test
    @DisplayName("Test Add to right tree")
    public void testAddRightTree() {
        bst.add(5);
        assertThat(bst.add(7)).isTrue();
    }
}