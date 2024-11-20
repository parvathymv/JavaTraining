package com.training.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo{
    public static void main(String[] args) {
        // BiFunction to add two integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Function to square the result
        Function<Integer, Integer> square = result -> result * result;

        // Using andThen() to first add and then square the result
        int result = add.andThen(square).apply(4, 5);

        System.out.println("Result: " + result); // Output: 81 (because (4 + 5)^2 = 81)
    }
}

