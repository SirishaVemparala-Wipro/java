/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 *  * No constructor
 * Getters have no return value
 * Setters have no return value
 * Properties are determined using private fields
 * Values or behaviors are determined through setters
 * toString will convert entire Employee class with properties and behaviors
 */

public class Employee {
	//private access specifier states that it cannot be accessed directly from outside the class
	private int id;// id of the employee
	private String name;// Name of the employee
	private String department;//Department in which the employee works
	private float salary;//Salary of the employee
	//retrieves the employee id
	public int getId() {
		return id;
	}
	//sets the employee id
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
		public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", department=" + department+ ",salary="+salary+"]";
		}
}
