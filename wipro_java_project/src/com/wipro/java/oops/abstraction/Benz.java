package com.wipro.java.oops.abstraction;
//Benz class extends the abstract Car class
public class Benz extends Car{
	// Implementation of the abstract method 'mileage' from the Car class.
	public void mileage() {
		System.out.println("Mileage:9 kmpl");// Prints the mileage of the Benz car
		
	}
	//Implementation of the abstract method 'engineCapacity' from the Car class
	public void engineCapacity() {
		System.out.println("Engine Capacity: 6.2L");
	}
	public static void main(String a[]) {
		// Creating an object of Benz using the Car reference
		Car benz=new Benz();
		benz.mileage();// Calls the mileage method and prints the mileage of the Benz
		benz.engineCapacity();// Calls the engineCapacity method and prints the engine capacity of the Benz
	}

	/**
	 * 
	 */

}


