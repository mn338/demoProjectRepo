package com.sample.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addMethodTest1() 
	{
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		assertEquals(30, result);
	}

	@Test
	public void addMethodTest2() 
	{
		Calculator c = new Calculator();
		int result = c.add(-5, -20);
		assertEquals(-25, result);
	}	
	
	@Test
	public void addMethodTest3() 
	{
		Calculator c = new Calculator();
		int result = c.add(-5, 20);
		assertEquals(15, result);
	}		

	@Test
	public void factorialMethodTest1() 
	{
		Calculator c = new Calculator();
		int result = c.factorial(3);
		assertEquals(6, result);
	}

	@Test
	public void factorialMethodTest2() 
	{
		Calculator c = new Calculator();
		int result = c.factorial(1);
		assertEquals(1, result);
	}	

	@Test
	public void factorialMethodTest3() 
	{
		Calculator c = new Calculator();
		int result = c.factorial(5);
		assertEquals(120, result);
	}
}
