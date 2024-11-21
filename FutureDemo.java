package com.training.threads;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a task that returns a result
        Callable<Integer> task = () -> {
            System.out.println("Computing...");
            Thread.sleep(2000); // Simulate a long computation
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        // Perform other tasks while waiting for the result
        System.out.println("Doing something else...");

        // Get the result of the computation
        Integer result = future.get(); // Blocks until the task is done
        System.out.println("Result: " + result);

        executor.shutdown();
    }
}

