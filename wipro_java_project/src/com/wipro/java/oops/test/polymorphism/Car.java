package com.wipro.java.oops.test.polymorphism;

public class Car extends Vehicle {
    // Overriding the start method for Car
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}
