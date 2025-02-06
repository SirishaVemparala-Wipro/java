/**
 * 
 */
package com.wipro.java.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Name implements Comparator<MovieComparator>{
	public int compare(MovieComparator m1,MovieComparator m2) {
		return m1.getN().compareTo(m2.getN());	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MovieComparator> m1=new ArrayList<>();
		m1.add(new MovieComparator("The Social Network", 8.5, 2010));
        m1.add(new MovieComparator("Take Down", 8.0, 2000));
        m1.add(new MovieComparator("Pirates of Silicon Valley", 8.2, 1999));
        Collections.sort(m1,new Name());
        System.out.println("\nMovies sorted by name:");
        for(MovieComparator m : m1)  {
        	System.out.println(m.getN()+" "+m.getR()+" "+m.getY());
        }
		

	}

}
