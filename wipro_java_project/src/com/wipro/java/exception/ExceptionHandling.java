package com.wipro.java.exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};  // Array with 5 elements

        try {
            System.out.println("Number with index 10: " + num[10]);  // Index 10 does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } finally {
            System.out.println("Execution Finished");
        }
    }
}
