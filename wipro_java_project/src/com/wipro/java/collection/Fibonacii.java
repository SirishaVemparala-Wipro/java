package com.wipro.java.collection;

import java.util.*;

public class Fibonacii {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);// create scanner obj to take user input
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();// read user input
		sc.close();
		TreeMap<Integer, Long> fibonaciiMap = new TreeMap<>();
		generateFibonacii(n, fibonaciiMap);// generate Fibonacii series and store it in tree map
		System.out.println("Fibonacii Series: ");
		for (long value : fibonaciiMap.values()) {// iterate through tree map and print key-value pairs
			System.out.print(value + " ");

		}

	}

	private static void generateFibonacii(int n, TreeMap<Integer, Long> map) {
		long a = 0, b = 1;
		for (int i = 1; i <= n; i++) {
			map.put(i, a);// store the fibonacii number in tree map with it's term index
			long next = a + b;
			a = b;
			b = next;
		}
	}

}
