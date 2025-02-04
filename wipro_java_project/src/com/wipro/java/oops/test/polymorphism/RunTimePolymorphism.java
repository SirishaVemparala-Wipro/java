package com.wipro.java.oops.test.polymorphism;

class Vehicle {
    // Parent class method
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    // Overriding the start method for Car
    void start() {
        System.out.println("Car is starting");
    }
}

public class RunTimePolymorphism { // Renamed class to TestVehicle
    public static void main(String[] args) {
        // Demonstrating Runtime Polymorphism
        Vehicle myVehicle = new Car();  // Parent class reference, but child class object
        myVehicle.start();  // Output: Car is starting
    }
}



