/**
 * 
 */
package com.wipro.java.java8;

/**
 * 
 * The For-each class demonstrates the use of the enhanced for-each loop in Java.
 * The for-each loop is a simplified way to iterate over arrays or collections 
 * without requiring explicit initialization, condition checking, or incrementing.
 **/
public class Foreach {

	/**
	 * 
	 */
	public Foreach() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and initialize an integer array
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int e : arr) {         // Using a for-each loop to iterate over the array
			System.out.println(e);  // Print each element of the array
		}	

	}

}
