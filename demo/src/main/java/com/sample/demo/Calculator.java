package com.sample.demo;

public class Calculator 
{
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}	

	public int factorial(int a)
	{		
		if (a == 1)
			return 1;
		
		else 
		return a * factorial (a-1);
	}
}
