/**
 * 
 */
package com.wipro.java.collection;

import java.util.*;

/**
 * The entrySet() method of Map returns a Set containing all the key-value pairs (entries) of the map.
 * 
 */
public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<>();//creating hash map with integer keys and string values
		
		map.put(1,"Apple");//key value pairs
		
		map.put(2,"Banana");
		
		map.put(3,"orange");//values can be similar not keys
		
		System.out.println("Key 1: "+map.get(1));//retrieving and printing the values using keys
		
		System.out.println("Key 2: "+map.get(2));//banana
		
		if(map.containsKey(3)) { //checking if key 3 exists
		
			System.out.println("Key 3 exists with value:"+map.get(3));//retrieving the value of key 3
		}
		
		System.out.println("\nIterating through the map:");
		
		for(Map.Entry<Integer,String> entry:map.entrySet()) {//iterating through hashmap using entry set
		
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
		map.remove(2);//removing the entry with key 2 from the hash map
		
		System.out.println("\nMap after removal of key 2:");//printing after removing
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
		
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
