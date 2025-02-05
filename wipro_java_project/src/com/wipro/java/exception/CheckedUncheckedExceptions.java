package com.wipro.java.exception;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;

public class CheckedUncheckedExceptions {

	public static void main(String a[]) {
		
		//checked exception example
		//IOException
		
		try {
			
			File file=new File("file1.txt");// Creating a new File object with the name "file1.txt
			
			FileReader fileReader=new FileReader(file);//read the file using FileReader
			
			fileReader.read();// Reading the contents of the file
		
			}catch(IOException e) {// Catching any IOException if the file doesn't exist
			
			System.out.println(e.getMessage());// Printing the exception message
		}
		
		//unchecked exception example
		//Arithmetic exception
		
		try {
			
			int result=1/0;//division by zero, which will throw ArithmeticException
			
		} catch ( ArithmeticException e) {// Catching the ArithmeticException 
			
				System.out.println(e.getMessage());// Printing the exception message
		}
	}
}
	


