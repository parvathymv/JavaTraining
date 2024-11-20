package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//           int sum=0;
//	        for(int var:numbers)
//	        {
//	        	sum+=var;
//	        }
	        // Calculate the sum of all numbers
	        int sum = numbers.stream()
	                         .reduce(1, (a, b) -> a * b);

	        System.out.println("Sum: " + sum); // Output: Sum: 15
	        
	        Stream<Integer> intStream = Stream.of(1,2,3,4); 
	    	Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
	    	System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}

	        
	        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
	        System.out.println("Stream contains all elements less than 10? "+numbers4.allMatch(i -> i<10)); 
	        
	        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5); 
	        System.out.println("Stream contains 4? "+numbers3.anyMatch(i -> i==4)); 

	        Stream<Integer> numbers5 = Stream.of(10,2,3,4,5); 
	        System.out.println("Stream doesn't contain 10? "+numbers5.noneMatch(i -> i==10)); 


	    }
	}


