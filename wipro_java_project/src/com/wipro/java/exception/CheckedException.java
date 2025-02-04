package com.wipro.java.exception;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("file1.txt");  // File not found
            file.read();
        } catch (IOException e) {
            System.out.println("IOException: An error occurred while reading the file.");
        }
    }
}
