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
    @DisplayName("We want to test if the contains method works this also indirectly tests the constructor  ")
    void testsForContains(){
        bst.add(1); // the root
        bst.add(2); // the left node of the root
        bst.add(3); // the left.left node of the root

        // testing if the contains method works
        assertThat(bst.contains(1)).isTrue();
        assertThat(bst.contains(2)).isTrue();
        assertThat(bst.contains(3)).isTrue();
        assertThat(bst.contains(6)).isFalse();
        
    }
    @Test
    @DisplayName("We are testing the height method separately for potential error reasons")
    void testHeight(){
        bst.add(1);
        bst.add(2);
        bst.add(3);
      
        assertThat(bst.height()).isEqualTo(3);
    }
    

}

