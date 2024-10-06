package com.gsd.algorithms.datastructures.stack;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.EmptyStackException;
import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Vinod : method with cc:1-2")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ArrayStackTest {

    private ArrayStack<Integer> stackArray;


    @BeforeEach
    void setUp(){
        stackArray = new ArrayStack<>();
    }


    @AfterEach
    void teardown(){
        stackArray = null;
    }

    static Stream<Integer> pushData() {
        return Stream.of(1, 2, 3, 4, 5);
    }


    static Stream<Integer> popData() {
        return Stream.of(5, 4, 3, 2, 1);
    }

    @Test
    @DisplayName("Ensure Stack Size is Zero")
    void TestEmptyStackSize() {

        assertEquals(stackArray.size(),0,"Stack of Size: 0 ");

    }

    @Test
    @DisplayName("Ensure Stack is Empty")
    void TestIsEmptyStack() {

        assertEquals(stackArray.size(),0,"Stack of Size: 0 ");
        assertThat(stackArray.isEmpty()).isTrue();

    }

    @Test
    @DisplayName("Testing the push")
    void testPushWithInputs() {
//        stackArray = new ArrayStack<>();
        int size =50;
        for (int i =0;i<size;i++){
            stackArray.push(i*3);
        }
        assertEquals(size,stackArray.size(),"All elements updated!!");
    }

    @Test
    @DisplayName("Testing the pop")
    void testPop() {
        testPushWithInputs();
        for(int i =0;i<50;i++){
            stackArray.pop();
        }
        assertTrue(stackArray.isEmpty(),"All elements were popped out and Stack is empty now!");

    }


    @ParameterizedTest
    @MethodSource("pushData")
    @DisplayName("Testing the peek with Parameterized test")
    void verifyElementsInStackWithPeek(int value){

        stackArray.push(value);
        assertEquals(value, stackArray.peek(), "Top of stack should be the last pushed value");
    }

    @ParameterizedTest
    @MethodSource("popData")
    @DisplayName("Testing the pop with Parameterized test")
    void verifyPopElements(int expectedValue){

        stackArray.push(expectedValue);
        int actualValue = stackArray.pop();
        assertEquals(expectedValue,actualValue,"Valued popped!!");

    }

    @Test
    @DisplayName("Testing Peek Exception on empty stack")
    public void testPeekOnEmptyStack() {
        Assertions.assertThrows(EmptyStackException.class, () -> {
            stackArray.peek();
        });
    }
    @Test
    @DisplayName("Testing Pop Exception on empty stack")
    public void testPopOnEmptyStack() {
        Assertions.assertThrows(EmptyStackException.class, () -> {
            stackArray.pop();
        });
    }



}