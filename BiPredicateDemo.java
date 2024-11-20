package com.training.java8;

import java.util.function.BiPredicate;

public class BiPredicateDemo{
    public static void main(String[] args) {
        // BiPredicate to check if the sum of two integers is even
        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;

        System.out.println(isSumEven.test(2, 4)); // Output: true
        System.out.println(isSumEven.test(3, 4)); // Output: false
    }
}

