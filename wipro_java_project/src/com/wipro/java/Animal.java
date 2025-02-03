/**
 * 
 */
package com.wipro.java;

/**
 * No constructor
 * Getters have no return value
 * Setters have no return value
 * Properties are determined using private fields
 * Values or behaviors are determined through setters
 * toString will convert entire animal class with properties and behaviors
 * 
 */
//private properties--structure(to store data)
//public methods for accessing or modifying data(gives controlled access)

public class Animal {
	private String name;//name of the animal
	private int lifespan;//lifespan of the animal
	private float weight;//weight of the animal
	//Retrieves the name of the animal
	public String getName() {
		return name;
	}

	//Sets the name of the animal.
	public void setName(String name) {
		this.name = "lion";
	}

	//Retrieves the age of the animal
	public int getLifeSpan() {
		return lifespan;
	}

	//Sets the age of the animal.
	public void setLifeSpan(int lifespan) {
		this.lifespan = 10;
	}

	//Retrieves the weight of the animal
	public float getWeight() {
		return weight;
	}

	//Sets the weight of the animal.
	public void setWeight(float weight) {
		this.weight = 25f;
	}


	/**
	 * 
	 */
	

	/**
	 * @param args
	 */
	public String toString() {
        return "Animal [name=" + name + ", lifespan=" + lifespan + ", weight=" + weight+ "]";
	}

}
