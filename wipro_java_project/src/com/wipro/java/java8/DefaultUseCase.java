package com.wipro.java.java8;


interface TestInterface1
{
	/*
	 * Default method in interface introduced from Java 1.8v onwards
	 */
	
	default void display()
	{
		System.out.println("Default method from 1st Interface");
	}
}


interface TestInterface2
{
	/*
	 * Default method in interface introduced from Java 1.8v onwards
	 */
	
	default void display()
	{
		System.out.println("Default method from 2nd Interface");
	}
}


public class DefaultUseCase implements TestInterface1,TestInterface2 
{
	
	@Override
	public void display() 
	{
		/*
		 * Calling display method of 1st Interface using
		 * super keyword
		 */
		TestInterface1.super.display();
		
		/*
		 * Calling display method of 2nd Interface using
		 * super keyword
		 */
		TestInterface2.super.display();
		
		
	}
	
	public static void main(String[] args) 
	{
		DefaultUseCase obj1 = new DefaultUseCase();
		obj1.display();
	}
}