package com.wipro.java.oops.test.polymorphism;

public class Bike extends Vehicle {
    // Overriding the start method for Bike
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}
