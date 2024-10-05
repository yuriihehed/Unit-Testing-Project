package com.gsd.algorithms.datastructures.balancedtree;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

public class TreapTreeTest {

    private TreapTree<Integer> treap;

    @BeforeEach
    public void setup(){
        treap = new TreapTree<>();
    }
    @Test
    @DisplayName("We want to test if the insert method works properly")
    void testForInsert(){
        assertThat(treap.insert(1, 1)).isTrue();
        assertThat(treap.size()).isEqualTo(1);
        assertThat(treap.contains(1)).isTrue();

        assertThat(treap.insert(3, 20)).isTrue();
        assertThat(treap.size()).isEqualTo(2);
        assertThat(treap.contains(3)).isTrue();

        assertThat(treap.insert(7, 5)).isTrue();
        assertThat(treap.size()).isEqualTo(3);
        assertThat(treap.contains(7)).isTrue();

        assertThat(treap.insert(1, 1)).isFalse(); // test a duplicate value
        assertThat(treap.size()).isEqualTo(3);

        // if the tree structure is correct this should work
        assertThat(treap.root.value).isEqualTo(3);
        assertThat(treap.root.left.value).isEqualTo(1);
        assertThat(treap.root.right.value).isEqualTo(7);
    }

}
