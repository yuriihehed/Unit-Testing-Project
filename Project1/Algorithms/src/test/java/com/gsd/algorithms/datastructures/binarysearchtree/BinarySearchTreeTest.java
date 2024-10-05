package com.gsd.algorithms.datastructures.binarysearchtree;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;
/*  What im responsible for testing

1. com.gsd.algorithms.datastructures.binarysearchtree.BinarySearchTree.Node.Node(Node,Node,T)
2.  com.gsd.algorithms.datastructures.binarysearchtree.BinarySearchTree.contains(T)
3.com.gsd.algorithms.datastructures.binarysearchtree.BinarySearchTree.height()
 */
@DisplayName("Vanessa's TestClass")
public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> bst;

    @BeforeEach
    public void setup() {
        bst = new BinarySearchTree<>();
    }

    @Test
    @DisplayName("Test if tree is empty")
    public void testEmpty() {
        assertThat(bst.isEmpty()).isTrue();
        assertThat(bst.size()).isEqualTo(0);
    }
    @Test
    @DisplayName("We want to test if the contains method works this also indirectly tests the constructor and the height method so im not doing a separate test for that ")
    void testsForContainsAndHeight(){
        bst.add(1); // should be the left node
        bst.add(2); // should be the root node
        bst.add(3); // should be the right node

        // testing if the contains method works
        assertThat(bst.contains(1)).isTrue();
        assertThat(bst.contains(2)).isTrue();
        assertThat(bst.contains(3)).isTrue();
        assertThat(bst.contains(6)).isFalse();
        assertThat(bst.contains(null)).isFalse();

        assertThat(bst.height()).isEqualTo(2);
    }
}

