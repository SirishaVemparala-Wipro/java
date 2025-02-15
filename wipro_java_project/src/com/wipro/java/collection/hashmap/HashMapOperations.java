package com.wipro.java.collection.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapOperations {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "C");
        languages.put(2, "Java");
        languages.put(3, "Python");
        System.out.println("HashMap: " + languages);

        // Access elements
        String value = languages.get(2);
        System.out.println("Value at index 2: " + value);

        // Add elements
        languages.put(4, "Kotlin");
        languages.put(5, "HTML");
        languages.put(6, "CSS");
        System.out.println("HashMap after adding elements: " + languages);

        // Replacing an element
        languages.replace(2, "C#");
        System.out.println("After replacing: " + languages);

        System.out.println("Keys: " + languages.keySet());
        System.out.println("Values: " + languages.values());
        System.out.println("Key value mappings: " + languages.entrySet());

        // Remove element associated with key 2
        languages.remove(2);
        System.out.println("Removed value: " + value);
        System.out.println("Updated HashMap: " + languages);

        // Iterate through keys
        System.out.print("Keys: ");
        for (Integer key : languages.keySet()) {
            System.out.print(key + ", ");
        }

        // Iterate through values only
        System.out.print("\nValues: ");
        for (String val : languages.values()) {
            System.out.print(val + ", ");
        }

        // Iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : languages.entrySet()) {
            System.out.print(entry + ", ");
        }

        // Convert HashMap to TreeMap (Sorting by Key)
        TreeMap<Integer, String> sortedLanguages = new TreeMap<>(languages);
        System.out.println("\nConverted TreeMap (Sorted by Key): " + sortedLanguages);
    }
}
