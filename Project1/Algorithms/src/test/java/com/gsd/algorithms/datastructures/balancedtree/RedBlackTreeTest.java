package com.gsd.algorithms.datastructures.balancedtree;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static com.google.common.truth.Truth.assertThat;

public class RedBlackTreeTest {
    private RedBlackTree<Integer> rbt;

    @BeforeEach
    public void setup(){
        rbt = new RedBlackTree<>();
    }
    
    @Test
    @DisplayName("Vanessa: test empty tree")
    void testForEmptyTree(){ 
        assertEquals(0,rbt.height(), "Height of the tree should be 0");
    }

    @Test
    @DisplayName("Vanessa: testheight")
    void testHeight(){
        rbt.insert(1);
        rbt.insert(2);
        rbt.insert(3);

        assertThat(rbt.height()).isEqualTo(2);

        rbt.insert(4);
        rbt.insert(5);
        rbt.insert(6);

        assertThat(rbt.height()).isEqualTo(4);
    }


}
