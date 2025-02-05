/**
 * 
 */
package com.wipro.java.collection;

class Array {

	/**
	 * Declare and initialize an array of size 5
	 * Assign values to the array elements
	 * Iterate through the array and print each element with its index
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int[] arr=new int[5];
				
		arr[0]=10;
				
		arr[1]=20;
				
		arr[2]=30;
				
		arr[3]=40;
				
		arr[4]=50;
				
		for (int i=0;i<arr.length;i++) {
					
			System.out.println("Element at index "+i+":"+arr[i]);
			}

		}

	}

