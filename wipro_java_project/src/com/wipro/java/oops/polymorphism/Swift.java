package com.wipro.java.oops.polymorphism;
// Importing the Car class from the inheritance package
import com.wipro.java.oops.inheritance.Car;

public class Swift extends Car {
	// Overriding the display method from the Car class
    @Override
 // Displaying the details of the Swift car
    public void display() {
        
        System.out.println("Swift Car brand: " + getBrand());
        System.out.println("Swift Car model: " + getModel());
        System.out.println("Swift Car price: " + getPrice());
    }

    public static void main(String[] args) {
    	 // Creating an object of Swift, which is a subclass of Car
        Car swift = new Swift();
        swift.setBrand("Tesla"); // Setting the brand, model, and price for the Swift object using setter methods
        swift.setModel("Mahindra");
        swift.setPrice(500000);
        
        swift.display();  // Displaying the details of the car
    }
}

