package com.training.java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> optionalValue = Optional.of("Hello, World!");
        System.out.println("Optional Value: " + optionalValue);

        // Creating an Optional with a nullable value
        Optional<String> nullableOptional = Optional.ofNullable(null);
        System.out.println("Nullable Optional: " + nullableOptional);

        // Creating an empty Optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Empty Optional: " + emptyOptional);
        
        //Optional<String> op= Optional.of(null);
        //System.out.println("Null optional="+op);
        
        Optional<String> optional = Optional.ofNullable(null);
        //Optional<String> optional = Optional.of("hello");
        // Provide a default value if the Optional is empty
        //String value = optional.orElse("Default Value");
        //value = optional.orElseGet(() -> "Computed Value");
        //System.out.println("Value: " + value);
        
       String value = optional.orElseThrow(() -> new RuntimeException("No value present"));
         System.out.println("Value: " + value);
        Optional<String> optional1= Optional.of("Java Optional");

        // Perform an action if a value is present
        optional1.ifPresent(val -> System.out.println("Value is: " + val));
    }
}
/*In Java, Optional is a container class introduced in Java 8 that is used to
represent the presence or absence of a value. 
It helps to avoid NullPointerException by explicitly 
specifying whether a value is present or not. 
It is part of the java.util package.*/
