package com.training.java8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Using a Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(4)); // Output: true
        System.out.println(isEven.test(5)); // Output: false
    }
}

