package com.training.java8;

//Reference to an Instance Method of a Particular Object

import java.util.function.Consumer;

public class InstanceMethodReferenceDemo{
    public static void main(String[] args) {
        String message = "Hello, Method References!";

        // Using lambda expression
        Consumer<String> printLambda = s -> System.out.println(s);

        // Using method reference
        Consumer<String> printMethodRef = System.out::println;

        // Calling accept() method
        printLambda.accept(message);   // Output: Hello, Method References!
        printMethodRef.accept(message); // Output: Hello, Method References!
    }
}
/*
System.out::println is a method reference to the instance method println of System.out.
This is equivalent to the lambda expression s -> System.out.println(s).*/
