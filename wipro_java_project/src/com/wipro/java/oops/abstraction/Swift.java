/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Swift extends Car{
	public void mileage() {
		System.out.println("Mileage:24.8 kmpl");
		
	}
	public void engineCapacity() {
		System.out.println("Engine Capacity: 1197 cc");
	}
	public static void main(String a[]) {
		Car swift=new Swift();
		swift.mileage();
		swift.engineCapacity();
	}

	/**
	 * 
	 */

}
