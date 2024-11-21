package com.training.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingExample {
	public static void main(String[] args) {
		String dateString = "15-11-2024";

		// Define the pattern for parsing String to Date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate parsedDate = LocalDate.parse(dateString, formatter);

		System.out.println("Parsed Date: " + parsedDate);

		// Format date to string
		LocalDate now = LocalDate.now();
        System.out.println("Default format "+now);
		// Define a custom format
		formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = now.format(formatter);

		System.out.println("Formatted Date  " + formattedDate);
	}
}
