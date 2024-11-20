package com.training.java8;

//Reference to a Static Method

import java.util.function.Function;

public class StaticMethodReferenceExample {
    public static void main(String[] args) {
        // Using lambda expression
        Function<String, Integer> parseIntLambda = s -> Integer.parseInt(s);

        // Using method reference
        Function<String, Integer> parseIntMethodRef = Integer::parseInt;

        System.out.println(parseIntLambda.apply("123")); // Output: 123
        System.out.println(parseIntMethodRef.apply("456")); // Output: 456
    }
}

//Integer::parseInt is a method reference to the static method parseInt of the Integer class.
//This replaces the lambda expression s -> Integer.parseInt(s).
