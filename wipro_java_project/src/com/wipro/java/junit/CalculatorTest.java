/**
 * 
 */
package com.wipro.java.junit;


import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit is a way of testing the code
 * 
 */
public class CalculatorTest {
	private final Calculator calculator=new Calculator();
	@Test
	public void testAdd() {
		int result=calculator.add(4, 5);
		assertEquals(9,result);
		
	}
	@Test
	public void testSubtract() {
		int result=calculator.subtract(9, 3);
		assertEquals(6,result);
	}
	public void testAddWithNegativeNumbers() {
		int result=calculator.add(-3, -2);
		assertEquals(-5,result);
	}
	@Test
	public void testSubtractWithNegativeNumbers() {
		int result=calculator.subtract(-8, -9);
		assertEquals(1,result);
	}
	
}
