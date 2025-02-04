package com.wipro.java.oops.test.polymorphism;

class MathOperations {
    
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args) {
        
        MathOperations math = new MathOperations();

        // Calling the method with two integers
        System.out.println("Sum of 2 integers: " + math.add(5, 10)); // Calls add(int, int)
        
        // Calling the method with three integers
        System.out.println("Sum of 3 integers: " + math.add(5, 10, 15)); // Calls add(int, int, int)
    }
}


	


