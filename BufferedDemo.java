package com.training.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a, b, c;

		try {

			System.out.println("enter first number");
			a = Integer.parseInt(br.readLine());
			System.out.println("enter second number");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("Result=" + c);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
