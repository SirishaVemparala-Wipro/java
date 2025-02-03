package com.wipro.java.oops.inheritance;

public class Car {
    private String brand;
    private String model;
    private float price;

    // Setters and Getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Method to be overridden in subclasses (polymorphism)
    public void display() {
        System.out.println("Car brand: " + getBrand());
        System.out.println("Car model: " + getModel());
        System.out.println("Car price: " + getPrice());
    }
}
