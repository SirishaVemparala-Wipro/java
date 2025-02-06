/**
 * 
 */
/**
 * 
 */
package com.wipro.java.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class NameComparator implements Comparator<AnimalComparator>{
	public int compare(AnimalComparator a1,AnimalComparator a2) {
		return a1.getName().compareTo(a2.getName());	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AnimalComparator> a1=new ArrayList<>();
		a1.add(new AnimalComparator("Tiger", 22));
        a1.add(new AnimalComparator("Elephant", 15));
        a1.add(new AnimalComparator("Horse",7));
        Collections.sort(a1,new NameComparator());
        System.out.println("\nAnimals sorted by name:");
        for(AnimalComparator a : a1)  {
        	System.out.println(a.getName()+" "+a.getAge());
        }
		

	}

}
