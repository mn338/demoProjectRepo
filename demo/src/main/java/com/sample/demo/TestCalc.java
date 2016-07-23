package com.sample.demo;

public class TestCalc {

	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		int a = 5;
		int b = 10;
		int result = c.add(a, b);
		
		System.out.println("Result is: " + result);
	}

}
