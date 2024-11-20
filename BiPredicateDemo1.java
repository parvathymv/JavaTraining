package com.training.java8;

import java.util.function.BiPredicate;

public class BiPredicateDemo1 {
    public static void main(String[] args) {
        // BiPredicate to check if both numbers are positive
        BiPredicate<Integer, Integer> areBothPositive = (a, b) -> a > 0 && b > 0;

        // BiPredicate to check if both numbers are even
        BiPredicate<Integer, Integer> areBothEven = (a, b) -> a % 2 == 0 && b % 2 == 0;

        // Chaining with 'and()'
        boolean result1 = areBothPositive.and(areBothEven).test(4, 2);
        System.out.println("Both positive and even: " + result1); // Output: true

        // Chaining with 'or()'
        boolean result2 = areBothPositive.or(areBothEven).test(3, -2);
        System.out.println("Either positive or even: " + result2); // Output: true

        // Using 'negate()' to reverse the result
        boolean result3 = areBothPositive.negate().test(-1, -2);
        System.out.println("Both not positive: " + result3); // Output: true
    }
}

