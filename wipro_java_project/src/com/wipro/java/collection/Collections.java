package com.wipro.java.collection;

import java.util.*;
public class Collections
{

	    public static void main(String[] args) {
	        // 1. ArrayList Operations
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        System.out.println("ArrayList: " + arrayList);
	        arrayList.remove(1); // Remove "Banana"
	        System.out.println("After removing index 1: " + arrayList);

	        // 2. LinkedList Operations
	        List<Integer> l1 = new ArrayList<>();
	        l1.add(10);
	        l1.add(20);
	        l1.add(30);
	        System.out.println("\nLinkedList: " +l1);
	        l1.removeFirst(); // Remove first element
	        System.out.println("After removing first element: " + l1);

	        // 3. HashMap Operations
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");
	        System.out.println("\nMap: " + map);
	        map.remove(2); // Remove key 2
	        System.out.println("After removing key 2: " + map);

	        // Iterating over a Map
	        System.out.println("\nIterating over Map:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}