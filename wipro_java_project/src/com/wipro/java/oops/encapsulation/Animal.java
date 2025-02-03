package com.wipro.java.oops.encapsulation;
 
public class Animal {
	// Private fields to encapsulate the data
	private String name;
	private int age;
	// Constructor to initialize the name and age of the animal
	public Animal(String name,int age) {
		super();// Calls the constructor of the parent class
		this.name=name;// Initialize the name field with the provided value
		this.age=age;// Initialize the age field with the provided value
	}
	public String getName() {// Getter method for the name
		return name;
	}
	public void setName(String name) {// Setter method for the name
		this.name = name;
	}
	public int getAge() {// Getter method for the age
		return age;
	}
	public void setAge(int age) {// Setter method for the age
		if (age > 0) { // Check if the age is a positive value
            this.age = age;// Sets the age field if the value is valid
        } else {
            System.out.println("Age must be positive.");// If the age is not positive, print an error message
	}
	}
		public static void main(String a[]) {
			Animal animal1 = new Animal("Lion",15);
			System.out.println(animal1.getName()); // Print the name and age of the animal using getter methods
			System.out.println(animal1.getAge());
			animal1.setName("Tiger");// Change the name to "Tiger" and the age to 6 using setter methods
	        animal1.setAge(6);
	        System.out.println(animal1.getName());
	        System.out.println(animal1.getAge());
	        animal1.setAge(-1);// Expected Output: Age must be positive.
			
		}
	}
	