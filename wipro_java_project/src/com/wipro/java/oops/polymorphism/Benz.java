/**
 * 
 */
package com.wipro.java.oops.polymorphism;
//Importing the Car class from inheritance package
import com.wipro.java.oops.inheritance.Car;

public class Benz extends Car {
	// Overriding the display method from the Car class
    @Override
    public void display() {
    	// Displaying the details of the Benz car
        System.out.println("Benz Car brand: " + getBrand());
        System.out.println("Benz Car model: " + getModel());
        System.out.println("Benz Car price: " + getPrice());
    }

    public static void main(String[] args) {
    	 // Creating an object of Benz, which is a subclass of Car
        Car benz = new Benz();
     // Setting the brand, model, and price for the Benz object using setter methods
        benz.setBrand("Bentley");
        benz.setModel("Toyoto");
        benz.setPrice(900000);
        // Calling the overridden display method of Benz class
        benz.display();  
    }
}

