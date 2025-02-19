package com.wipro.java.collection.hashmap;
import java.util.*;

class CustomHashMap<K, V> {
    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] table;
    
    public CustomHashMap() {
        table = new LinkedList[SIZE];
    }
    
    private int getIndex(K key) {
        return (key.hashCode() & 0x7fffffff) % SIZE;
    }
    
    public void put(K key, V value) {
        int index = getIndex(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        
        table[index].add(new Entry<>(key, value));
    }
    
    public V get(K key) {
        int index = getIndex(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }
    
    public void remove(K key) {
        int index = getIndex(key);
        if (table[index] != null) {
            table[index].removeIf(entry -> entry.key.equals(key));
        }
    }
    
    private static class Entry<K, V> {
        K key;
        V value;
        
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class HashMapDesign {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of entries:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter age:");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            map.put(name, age);
        }
        
        System.out.println("Enter name to fetch age:");
        String query = scanner.nextLine();
        System.out.println(query + "'s Age: " + map.get(query));
        
        System.out.println("Enter name to remove:");
        String removeName = scanner.nextLine();
        map.remove(removeName);
        System.out.println(removeName + " removed.");
        
        scanner.close();
    }
}