package com.wipro.java.collection;

import java.util.*;
import java.util.Collections;

/**
 * It implements the Comparable interface to define a natural ordering
 * based on the movie rating in ascending order.
 */
class MovieComparable implements Comparable<MovieComparable> {
    private String n; // Movie name
    private double r; // Movie rating
    private int y;    // Release year

    //Constructor to initialize movie details.
    public MovieComparable(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    @Override
    public int compareTo(MovieComparable m) {
        return Double.compare(this.r, m.r); // Sorting by rating (ascending order)
    }

    
    public String getName() {
        return n;
    }

   
    public double getRating() {
        return r;
    }

    
    public int getYear() {
        return y;
    }

    
    public static void main(String[] args) {
        // Creating a list of movies
        ArrayList<MovieComparable> l = new ArrayList<>();
        l.add(new MovieComparable("The Social Network", 8.5, 2010));
        l.add(new MovieComparable("Take Down", 8.0, 2000));
        l.add(new MovieComparable("Pirates of Silicon Valley", 8.2, 1999));

        // Sorting movies based on rating (ascending order)
        Collections.sort(l);

        // Displaying sorted movies
        System.out.println("Movies after sorting by rating:");
        for (MovieComparable m : l) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}
