package com.training.junit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class LifecycleTest {

    @BeforeAll
    static void initAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        System.out.println("Before each test");
    }

    @Test
    void test1() {
        System.out.println("Test 1 executed");
    }

    @Test
    void test2() {
        System.out.println("Test 2 executed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After all tests");
    }
}
