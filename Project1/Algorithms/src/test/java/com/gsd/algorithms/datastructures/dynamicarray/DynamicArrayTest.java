package com.gsd.algorithms.datastructures.dynamicarray;

import com.gsd.algorithms.datastructures.queue.ArrayQueue;
import org.junit.jupiter.api.*;

import static com.google.common.truth.Truth.assertThat;

public class DynamicArrayTest {

    private DynamicArray<Integer> da;

    @BeforeEach
    public void setUp() {
        da = new DynamicArray<>(0);
    }

    @AfterEach
    void tearDown() {
        da = null;
    }

    @Test
    @DisplayName("Test Add to array with capacity zero")
    public void testAddWithCapacityZero() {
        DynamicArray<Integer> da = new DynamicArray<>(0);
        da.add(0);
        assertThat(da.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("Test Add to array with capacity one")
    public void testAddWithCapacityOne() {
        DynamicArray<Integer> da = new DynamicArray<>(1);
        da.add(0);
        da.add(1);
        assertThat(da.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("Test Add to array with standard capacity of 16")
    public void testAddWithStandardCapacity() {
        DynamicArray<Integer> da = new DynamicArray<>();
        da.add(0);
        da.add(1);
        da.add(2);
        da.add(4);
        assertThat(da.size()).isEqualTo(4);
    }
}