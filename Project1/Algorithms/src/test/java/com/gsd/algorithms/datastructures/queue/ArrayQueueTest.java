package com.gsd.algorithms.datastructures.queue;

import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayQueueTest {

    private ArrayQueue<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new ArrayQueue<>(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
    }

    @AfterEach
    void tearDown() {
        queue = null;
    }

    @Test
    @DisplayName("Test array queue is full")
    public void testQueueIsFull() {
        assertThat(queue.isFull()).isTrue();
    }

    @Test
    @DisplayName("Test array queue is not full")
    public void testFullQueueIsNotFull() {
        queue.poll();

        assertThat(queue.isFull()).isFalse();
    }

    @Test
    @DisplayName("Test array queue size")
    public void testQueueSize() {
        assertThat(queue.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("Test array queue peek when queue is empty. Throws RuntimeException.")
    public void testPeekException() {
        queue.poll();
        queue.poll();
        queue.poll();
        assertThrows(RuntimeException.class, ()->{queue.peek();});
    }

    @Test
    @DisplayName("Test array queue peek first element")
    public void testPeekFirstElement() {
        assertThat(queue.peek()).isEqualTo(1);
    }

    @Test
    @DisplayName("Test array queue peek last element")
    public void testPeekLastElement() {
        queue.poll();
        queue.poll();
        assertThat(queue.peek()).isEqualTo(3);
    }

}