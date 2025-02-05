/**
 * 
 */
package com.wipro.java.collection;
import java.util.*;
/**
 * 
 */
class ListOperations {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1=new ArrayList<Integer>();//creating an array list of integers
		
		l1.add(0,1);//adding 1 at index 0
		
		l1.add(1,2);//adding 2 at index 1
		
		l1.add(2,3);//adding 3 at index 2
		
		System.out.println(l1);//prints the list l1
		
		List<Integer> l2=new ArrayList<Integer>();//creating another list of integers
		
		l2.add(1);//adding 1
		
		l2.add(2);//adding 2
		
		l2.add(3);//adding 3
		
		l1.addAll(1,l2);//adding all the elements of l2 into l1 starting at index 1
		
		System.out.println(l1);//printing l1 after adding
		
		l1.remove(1);//removing element at index 1
		
		System.out.println(l1);//printing list after removing
		
		System.out.println(l1.get(3));//retrieving the value of element at index 3
		
		l1.set(0, 5);//setting the value of 5 at index 0
		
		System.out.println(l1);//printing after setting the value

	}

}
