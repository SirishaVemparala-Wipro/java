/**
 * 
 */
package com.wipro.java.collection;
import java.util.*;
import java.util.Collections;

/**
 * It implements the Comparable interface to define a natural ordering
 * based on the animal names in alphabetical order.
 */
class AnimalComparable implements Comparable<AnimalComparable> {
    private String name; // Movie name
    private int age;    // Release year

    //Constructor to initialize movie details.
    public AnimalComparable(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(AnimalComparable a) {
    	return this.name.compareTo(a.name); // Sorting by name (alphabetical order)
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        // Creating a list of movies
        ArrayList<AnimalComparable> a = new ArrayList<>();
        a.add(new AnimalComparable("Elephant", 15));
        a.add(new AnimalComparable("Tiger", 22));

        // Sorting movies based on names (alphabetical order)
        Collections.sort(a);

        // Displaying sorted animals
        System.out.println("Sorted animals by name:");
        for (AnimalComparable m : a) {
            System.out.println(m.getName() + " " + m.getAge());
        }
    }
}
