package com.wipro.java.collection.hashmap;
/*Develop a collections based application that shall fetch the data 
 * from a TreeMap and store it in a HashMSap*/
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseCase2 {
	public static void main(String a[]) {
		//entries are sorted by keys
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(4, "Java");
		treeMap.put(2,"JavaEE");
		treeMap.put(1, "Springboot");
		treeMap.put(3, "Hibernate");
		HashMap<Integer,String> hashMap=new HashMap<>();
		//entrySet() returns a set of key-value pairs from the TreeMap
		for(Map.Entry<Integer,String> entry: treeMap.entrySet()) {
		hashMap.put(entry.getKey(),entry.getValue());
	}
	System.out.println("Hashmap: "+hashMap);

}
}