/**
 * 
 */
package com.wipro.java.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Year implements Comparator<MovieComparator> {

	public int compare(MovieComparator m1,MovieComparator m2) {
		return Integer.compare(m1.getY(),m2.getY());
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MovieComparator> m1=new ArrayList<>();
		m1.add(new MovieComparator("The Social Network", 8.5, 2010));
        m1.add(new MovieComparator("Take Down", 8.0, 2000));
        m1.add(new MovieComparator("Pirates of Silicon Valley", 8.2, 1999));
        Collections.sort(m1, new Year());
        System.out.println("Movies sorted by rating:");
        for(MovieComparator m : m1) {
        System.out.println(m.getR()+" "+m.getN()+" "+m.getY());
	}

}
}