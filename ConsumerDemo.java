package com.training.java8;


	import java.util.Arrays;
	import java.util.List;
	import java.util.function.Consumer;

	public class ConsumerDemo  {
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

	        // Consumer to print each name in uppercase
	        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());

	        // Using forEach with Consumer
	        names.forEach(printUpperCase);
	        // Output:
	        // ALICE
	        // BOB
	        // CHARLIE
	    }
	}


