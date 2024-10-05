package com.example;

public class CC1 {

    // Method to remove n characters from the right of the string
    public String removeRight(String input, int n) {
        if (n > input.length()) return input;
        return input.substring(0, input.length() - n);
    }

    // Method to remove n characters from the left of the string
    public String removeLeft(String input, int n) {
        if (n > input.length()) return input;
        return input.substring(n);
    }

    @Override
    public String toString() {
        // Custom string representation
        return "CC1 implementation";
    }
}
