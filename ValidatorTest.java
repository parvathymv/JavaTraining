package com.training.junit;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void testValidateThrowsException() {
        Validator validator = new Validator();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(-1));
    }
}


