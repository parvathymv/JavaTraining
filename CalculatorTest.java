package com.training.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	static Calculator obj ;

	@BeforeAll
	static void initAll() {
     System.out.println("Before all");
		obj = new Calculator();
		System.out.println(obj);
	}

	@Test
	public void testAdd() {

		// assertEquals("9 is not a even number", false, meo.isEvenNumber(9));

		// assertEquals(true, obj.isEvenNumber(9));

		assertEquals(10, obj.add(5, 5));
		assertEquals(8, obj.add(3, 5));
		//assertEquals(6, obj.add(3, 4));
		assertEquals(5, obj.add(3, 2));

	}

	@Test
	public void testMultiply() {
		// Calculator obj=new Calculator();
		// assertEquals("9 is not a even number", false, meo.isEvenNumber(9));

		// assertEquals(true, obj.isEvenNumber(9));
		assertEquals(25, obj.multiply(5, 5));
		assertEquals(15, obj.multiply(3, 5));

	}
	@AfterAll
	static void releaseAll() {

		obj = null;
	}


}
