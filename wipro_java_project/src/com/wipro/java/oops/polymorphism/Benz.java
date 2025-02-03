/**
 * 
 */
package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inheritance.Car;

public class Benz extends Car {

    @Override
    public void display() {
        // Polymorphism: Overriding display() to add customized behavior
        System.out.println("Swift Car brand: " + getBrand());
        System.out.println("Swift Car model: " + getModel());
        System.out.println("Swift Car price: " + getPrice());
    }

    public static void main(String[] args) {
        // Polymorphism: Creating an object of type Car but instantiating it with Swift
        Car benz = new Benz();
        benz.setBrand("Bentley");
        benz.setModel("Toyoto");
        benz.setPrice(900000);
        
        benz.display();  // Calls the overridden display() method in Swift
    }
}

