package com.training.java8;

//Reference to an Instance Method of an Arbitrary Object of a Particular Type


import java.util.function.BiFunction;
import java.util.function.Predicate;

public class ArbitraryObjectMethodReferenceDemo {
    public static void main(String[] args) {
        // Using lambda expression
        Predicate<String> isEmptyLambda = s -> s.isEmpty();

        // Using method reference
        Predicate<String> isEmptyMethodRef = String::isEmpty;

        System.out.println(isEmptyLambda.test(""));    // Output: true
        System.out.println(isEmptyMethodRef.test("Hi")); // Output: false
    }
}
//String::isEmpty is a method reference to the isEmpty method of the String class.
//It refers to the method of an arbitrary object of type String.

