/**
 * 
 */
package com.wipro.java.java8;

/**
 * /**
 * The StringAPI class demonstrates various String operations in Java 8.
 * It includes methods for calculating string length, extracting characters,
 * checking substring existence, splitting strings.
 */

public class StringAPI {


	public StringAPI() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and initialize a string variable
		String str="Name xyz";
		System.out.println(str.length());//print length of string
		System.out.println(str.charAt(2)); // Print the character at index 2 (0-based index)
		System.out.println(str.substring(1,3));//Extract a substring from index 1 to 3
		System.out.println(str.contains("a"));//check if string contains letter a
		String[] a= str.split(" ");//Split the string based on spaces and store the result in an array
		for(String str1:a) {
			System.out.println(str1);//Iterate over the array and print each word
		}

	}

}
