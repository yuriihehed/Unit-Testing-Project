package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CC1Test {

    @Test
    public void testRemoveRight() {
        CC1 instance = new CC1();
        String result = instance.removeRight("abcdef", 2);
        assertEquals("abcd", result);  // Expecting "abcd" after removing 2 characters from the right
    }

    @Test
    public void testRemoveLeft() {
        CC1 instance = new CC1();
        String result = instance.removeLeft("abcdef", 2);
        assertEquals("cdef", result);  // Expecting "cdef" after removing 2 characters from the left
    }

    @Test
    public void testToString() {
        CC1 instance = new CC1();
        assertEquals("CC1 implementation", instance.toString());  // Expecting custom string representation
    }
}
