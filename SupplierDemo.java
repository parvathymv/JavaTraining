package com.training.java8;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Supplier to provide a heavy computation result
        Supplier<Double> randomValueSupplier = () -> {
            System.out.println("Generating random value...");
            return Math.random();
        };

        System.out.println("Random value (first call): " + randomValueSupplier.get());
        System.out.println("Random value (second call): " + randomValueSupplier.get());
    }
}
