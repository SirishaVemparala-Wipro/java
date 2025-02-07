package com.wipro.java.collection;

/**
 * MovieComparator class to represent movie details.
 * This class stores the movie's name, rating, and release year.
 */
class MovieComparator {
    private String name;   // Movie name
    private double rating; // Movie rating
    private int year;      // Release year

    //Constructor to initialize movie details.
     
    public MovieComparator(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    /**
     * Getter methods
     *
     */
    public String getN() {
        return name;
    }

   
    public double getR() {
        return rating;
    }

    public int getY() {
        return year;
    }
}
