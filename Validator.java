package com.training.junit;

public class Validator {
    public void validate(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
    }
}

