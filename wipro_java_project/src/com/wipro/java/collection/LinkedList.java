/**
 * 
 */
package com.wipro.java.collection;

import java.util.*;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;//declaring an integer variable n and initializing it to 5
		
		List<Integer> l1=new ArrayList<Integer>();//creating an array list of integers
		
		for (int i=1;i<=n;i++)//add numbers from 1 to 5 into the list
		
			l1.add(i);//add elements 1 to 5 to list
		
		System.out.println(l1);//print list l1
		
		l1.remove(3);//remove element at index 3
		
		System.out.println(l1);//print list l1
		
		for(int i=0;i<l1.size();i++)//iterating through the list and printing each element
		
			System.out.println(l1.get(i)+" ");//retrieving elements one by one
	}

}
