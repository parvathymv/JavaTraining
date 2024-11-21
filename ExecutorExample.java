package com.training.threads;
import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Define tasks
        Runnable task1 = () -> {
            System.out.println("Task 1 is running by " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 is running by " + Thread.currentThread().getName());
        };

        Runnable task3 = () -> {
            System.out.println("Task 3 is running by " + Thread.currentThread().getName());
        };

        Runnable task4 = () -> {
            System.out.println("Task 4 is running by " + Thread.currentThread().getName());
        };

        // Submit tasks to the executor
        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);
        executor.execute(task4);

        // Shut down the executor gracefully
        executor.shutdown();
    }
}

