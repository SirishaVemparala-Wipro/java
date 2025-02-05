package com.wipro.java.oops.test.polymorphism;

public class Vehicle {
    // Parent class method
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {
        Vehicle myVehicle=new Car();  // Parent class reference, but Car object
        myVehicle.start();  // Car is starting
        myVehicle = new Bike();// Parent class reference, but Bike object
        myVehicle.start();  // Bike is starting
    }
}
