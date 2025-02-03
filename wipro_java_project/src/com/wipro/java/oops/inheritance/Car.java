package com.wipro.java.oops.inheritance;

public class Car {
	 //variables to store the brand, model, and price
    private String brand;
    private String model;
    private float price;

    // Setters and Getters
    public String getBrand() {//Getter method for the brand of the car
        return brand;
    }

    public void setBrand(String brand) {//Setter method for the brand of the car
        this.brand = brand;
    }

    public String getModel() {// Getter method for the model of the car
        return model;
    }

    public void setModel(String model) {
        this.model = model;// setter method for the model of the car
    }

    public float getPrice() {// Getter method for the price of the car
        return price;
    }

    public void setPrice(float price) {// setter method for the price of the car
        this.price = price;
    }

    //Method to display the car's details
    public void display() {
    	// Prints the details of the car, including brand, model, and price
        System.out.println("Car brand: " + getBrand());
        System.out.println("Car model: " + getModel());
        System.out.println("Car price: " + getPrice());
    }
}
