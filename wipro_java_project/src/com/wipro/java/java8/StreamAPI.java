/**
 * 
 */
package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The StreamAPI class demonstrates various Stream operations in Java 8.
 * It includes filtering elements, converting strings to upper case, 
 * sorting numbers, and finding the minimum and maximum values in a list.
 */
public class StreamAPI {

	/**
	 * 
	 */
	public StreamAPI() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Sirisha","Prathyusha","Padma");// Creating a list of strings
		List<String> stream=list.stream().
				filter(name->name.startsWith("P")).// Filtering names that start with "P" using Stream API
				collect(Collectors.toList());
		System.out.println(stream);
		List<String> stream1=list.stream().// Converting all names to upper-case using map()
				map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream1);
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3); // Creating a list of integers
		List<Integer> sortedNumbers = numbers.stream()// Sorting the list of numbers
		   .sorted()
		   .collect(Collectors.toList());
		System.out.println(sortedNumbers);
		List<Integer> newnumbers = Arrays.asList(10, 20, 5, 25, 30);// Creating another list of integers
		int min = newnumbers.stream().min(Integer::compare).get();// Finding the minimum value in the list
		int max = newnumbers.stream().max(Integer::compare).get();// Finding the maximum value in the list
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

	}

}
