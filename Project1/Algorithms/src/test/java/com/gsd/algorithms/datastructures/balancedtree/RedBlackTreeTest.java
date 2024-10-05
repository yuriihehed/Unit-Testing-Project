package com.gsd.algorithms.datastructures.balancedtree;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

public class RedBlackTreeTest {
    private RedBlackTree<Integer> rbt;

    @BeforeEach
    public void setup(){
        rbt = new RedBlackTree<>();
    }
    @Test
    @DisplayName("We want to test for the height of an empty tree")
    void testForEmptyTree(){
        assertThat(rbt.isEmpty()).isTrue();
        assertThat(rbt.size()).isEqualTo(0);
    }
    @Test
    void testHeightBalancedTree(){
        rbt.insert(1);
        rbt.insert(2);
        rbt.insert(3);

        assertThat(rbt.height()).isEqualTo(2);
    }
    @Test
    void testHeightUnBalancedTree(){
        rbt.insert(1);// should be the left child of the root
        rbt.insert(2); // Should be the root 
        rbt.insert(3); // should be the left child of teh right childof the root
        rbt.insert(4); // Should be the right child of the root
        rbt.insert(5);// should be the right child of of the right child of the root
        
        assertThat(rbt.height()).isEqualTo(3); //
    }


}
