package com.wipro.java.collection.linkedlistsorting;

/*program to sort a LinkedList using the Comparator interface
  */
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "{Name: " + name + ", Age: " + age + "}";
	}
}

//Comparator class to compare two Person objects by their age
class AgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.age, p2.age);
	}
}

public class PersonComparator {
	public static void main(String a[]) {
		// Creating a LinkedList to store Person objects
		LinkedList<Person> people = new LinkedList<>();
		people.add(new Person("Alexa", 35));
		people.add(new Person("Jennif", 29));
		people.add(new Person("James", 14));
		people.add(new Person("Thomas", 19));
		System.out.println("Before sorting:");
		for (Person person : people) {
			System.out.println(person);
		}
		Collections.sort(people, new AgeComparator());
		System.out.println("After sorting by age:");
		for (Person person : people) {
			System.out.println(person);
		}
	}

}
