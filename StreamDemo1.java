package com.training.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


     
public class StreamDemo1 {

	public static void main(String[] args) {
		   List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David","Arun");

	        // Filter names starting with 'A', convert to uppercase, and collect to a list
	        List<String> result = names.stream()
	                                   .filter(name -> name.startsWith("A"))
	                                   .map(String::toUpperCase)
	                                   .collect(Collectors.toList());

	        System.out.println(result); 
	    }
	}


//filter: Filters elements based on a predicate.
//map: Transforms each element using a function.
//collect: Collects the processed stream into a collection (e.g., List, Set).