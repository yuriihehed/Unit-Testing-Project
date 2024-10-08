package com.gsd.algorithms.datastructures.balancedtree;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;
@DisplayName("Vanessa's test")
public class TreapTreeTest {

    private TreapTree<Integer> treap;

    @BeforeEach
    public void setup(){
        treap = new TreapTree<>();
    }
    @Test
    @DisplayName("Vanessa: test for insert")
    void testForInsert(){
        assertThat(treap.insert(1, 1)).isTrue(); // insert should be true for new elements 
        assertThat(treap.size()).isEqualTo(1); // the size should be 1 after we insert ((value)1,(priority)1)
        assertThat(treap.contains(1)).isTrue(); // should contain the variable we just inserted 

        assertThat(treap.insert(3, 20)).isTrue();
        assertThat(treap.size()).isEqualTo(2); // should be 2 because we just inserted 2 things 
        assertThat(treap.contains(3)).isTrue(); 

        assertThat(treap.insert(7, 5)).isTrue();
        assertThat(treap.size()).isEqualTo(3); // should be 3 now....
        assertThat(treap.contains(7)).isTrue();

        assertThat(treap.insert(1, 1)).isFalse(); // You shouldnt be able to insert duplicates 
        assertThat(treap.size()).isEqualTo(3); // make sure the insertions is still 3...

        // if the tree structure is correct this should work
        assertThat(treap.root.value).isEqualTo(3);
        assertThat(treap.root.left.value).isEqualTo(1);
        assertThat(treap.root.right.value).isEqualTo(7);
    }

}
