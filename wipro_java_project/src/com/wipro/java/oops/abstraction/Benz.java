package com.wipro.java.oops.abstraction;

public class Benz extends Car{
	
	public void mileage() {
		System.out.println("Mileage:9 kmpl");
		
	}
	public void engineCapacity() {
		System.out.println("Engine Capacity: 6.2L");
	}
	public static void main(String a[]) {
		Car benz=new Benz();
		benz.mileage();
		benz.engineCapacity();
	}

	/**
	 * 
	 */

}


