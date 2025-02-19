package com.wipro.java.collection.hashmap;

import java.util.*;

public class StudentHashMap {
    public static void main(String[] args) {
        //  Creating a HashMap
        Map<String, List<Integer>> studentMap = new HashMap<>();

        // Adding students with duplicate names and roll numbers
        addStudent(studentMap, "Sirisha", 1);
        addStudent(studentMap, "Niharika", 2);
        addStudent(studentMap, "Ananya",3);
        addStudent(studentMap, "Ramya", 4);
        addStudent(studentMap, "Jyoshika", 5); 
        addStudent(studentMap, "Ramya", 6);
        addStudent(studentMap, "Gayatri", 7);    
        addStudent(studentMap, "Niharika", 8);
        addStudent(studentMap, "Deepthi", 9);
        addStudent(studentMap, "Sirisha", 10); 

        // Displaying student details
        for (Map.Entry<String, List<Integer>> entry : studentMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " -> Roll Numbers: " + entry.getValue());
        }
    }

   
    private static void addStudent(Map<String, List<Integer>> map, String name, int rollNumber) {
    	// Check if the student name already exists in the HashMap
        map.putIfAbsent(name, new ArrayList<>());// If not, initialize an empty list
        map.get(name).add(rollNumber); // Add the roll number to the list
    }
}
