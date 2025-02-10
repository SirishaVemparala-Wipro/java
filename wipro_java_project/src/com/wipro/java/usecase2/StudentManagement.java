package com.wipro.java.usecase2;

import java.util.*;
import java.util.stream.*;

// Abstract class representing a Student
abstract class Student {
    private String id;
    private String name;
    private int age;
    private String department;

    // Constructor to initialize student details(encapsulation)
    public Student(String id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter methods to access private attributes(encapsulation)
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // Abstract method to be implemented by subclasses
    public abstract void showDetails();
}

// Undergraduate Student class extending Student(Inheritance)
class Undergraduate extends Student {
    private String year;

    // Constructor using super() to call parent class constructor
    public Undergraduate(String id, String name, int age, String department, String year) {
        super(id, name, age, department);
        this.year = year;
    }

    // Overriding abstract method to display Undergraduate student details (Polymorphism)
    @Override
    public void showDetails() {
        System.out.println("Undergraduate Student: " + getName() + ", ID: " + getId() +
                ", Age: " + getAge() + ", Department: " + getDepartment() + ", Year: " + year);
    }
}

// Postgraduate Student class extending Student (Inheritance)
class Postgraduate extends Student {
    private String specialization;

    public Postgraduate(String id, String name, int age, String department, String specialization) {
        super(id, name, age, department); // Calls the constructor of the parent class (Student)
        this.specialization = specialization;
    }

    // Overriding abstract method to display Post-graduate student details
    @Override
    public void showDetails() {
        System.out.println("Postgraduate Student: " + getName() + ", ID: " + getId() +
                ", Age: " + getAge() + ", Department: " + getDepartment() + ", Specialization: " + specialization);
    }
}

// StudentManager class for managing students(encapsulation)
class StudentManager {
    private List<Student> students = new ArrayList<>(); // List to store students

    // Method to add a student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to remove a student by ID
    public void removeStudent(String id) {
        boolean removed = students.removeIf(student -> student.getId().equals(id));
        if (removed) {
            System.out.println("Student with ID " + id + " removed successfully.");
        } else {
            System.out.println("Student ID " + id + " does not exist.");
        }
    }

    // Method to display all students in the system
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            students.forEach(Student::showDetails);
        }
    }

    // Method to fetch a student by ID
    public Optional<Student> getStudentById(String id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst();
    }

    // Method to filter students by department
    public List<Student> filterByDepartment(String department) {
        return students.stream()
                .filter(student -> student.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    // Method to sort students by name
    public void sortStudentsByName() {
        if (students.isEmpty()) {
            System.out.println("No students available to sort.");
        } else {
            students.sort(Comparator.comparing(Student::getName));
            System.out.println("Students sorted by name successfully.");
        }
    }

    // Method to count students in a particular department
    public long countStudentsByDepartment(String department) {
        return students.stream().filter(student -> student.getDepartment().equalsIgnoreCase(department)).count();
    }
}

// Main class to test the Student Management System
public class StudentManagement {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager(); // Creating StudentManager object

        // Adding Undergraduate and Post-graduate students
        manager.addStudent(new Undergraduate("UG101", "Sireesha", 19, "Computer Science", "First Year"));
        manager.addStudent(new Postgraduate("PG201", "Prathyusha", 24, "Electrical Engineering", "Machine Learning"));
        manager.addStudent(new Undergraduate("UG102", "Surya", 20, "Mechanical", "Final Year"));
        manager.addStudent(new Postgraduate("PG202", "Padma", 26, "Computer Science", "Cybersecurity"));

        // Display all students
        System.out.println("\nAll Students:");
        manager.displayAllStudents();

        // Fetch and display a specific student by ID
        System.out.println("\nFetching Student by ID (UG101):");
        manager.getStudentById("UG101").ifPresent(Student::showDetails);

        // Removing a student by ID
        manager.removeStudent("PG201");
        System.out.println("\nAfter Removing PG201:");
        manager.displayAllStudents();

        // Filtering students by department
        System.out.println("\nFiltering Students in Computer Science:");
        List<Student> csStudents = manager.filterByDepartment("Computer Science");
        csStudents.forEach(Student::showDetails);

        // Sorting students by name and displaying them
        System.out.println("\nSorting Students by Name:");
        manager.sortStudentsByName();
        manager.displayAllStudents();

        // Counting and displaying the number of students in a specific department
        System.out.println("\nNumber of Students in Computer Science: " + manager.countStudentsByDepartment("Computer Science"));
    }
}
