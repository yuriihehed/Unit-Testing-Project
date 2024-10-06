package com.gsd.algorithms.datastructures.fibonacciheap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Vinod : method with cc:3")
class FibonacciHeapTest {

    private FibonacciHeap<Integer>  heap;

    @BeforeEach
    void setUp(){
        heap = new FibonacciHeap<>();
    }
    @AfterEach
    void teardown(){
        heap = new FibonacciHeap<>();
    }

    @Test
    @DisplayName("Test adding elements to the heap")
    void testAddMultipleElements() {

        assertTrue(heap.add(20));
        assertEquals(1,heap.size());

        heap.add(30);
        heap.add(40);

        assertEquals(3,heap.size());

        assertFalse(heap.isEmpty());

    }

    @Test
    @DisplayName("Test adding null element to the heap")
    void TestAddingNullElement(){
        assertThrows(IllegalArgumentException.class,()->{
           heap.add(null);
        });
    }



    @Test
    @DisplayName("Test clear function")
    void clear() {
        heap.add(10);
        heap.add(20);

        heap.add(30);

        heap.clear();
        assertEquals(heap.size(),0);
    }

    static Stream<Collection<Integer>> collectionStreamForAddAll(){

        return Stream.of(
                new HashSet<>(Arrays.asList(10,20,30)),
                Arrays.asList(59,76,66),
                Arrays.asList(60,90,80),
                Arrays.asList()
        );
    }

    @ParameterizedTest
    @MethodSource("collectionStreamForAddAll")
    @DisplayName("Test adding collection to the heap")
    public void testAddAll(Collection<Integer> collection){
        assertTrue(heap.addAll(collection));

        assertEquals(heap.size(),collection.size());
    }
}