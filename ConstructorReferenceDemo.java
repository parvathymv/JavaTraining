package com.training.java8;

//Reference to a Constructor

import java.util.function.Supplier;

class Person {
    String name;

    Person() {
        this.name = "Default Name";
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        // Using lambda expression
        Supplier<Person> personLambda = () -> new Person();

        // Using constructor reference
        Supplier<Person> personConstructorRef = Person::new;

        System.out.println(personLambda.get());       // Output: Person{name='Default Name'}
        System.out.println(personConstructorRef.get()); // Output: Person{name='Default Name'}
    }
}
/*Person::new is a reference to the Person class constructor.
This replaces the lambda expression () -> new Person().*/

