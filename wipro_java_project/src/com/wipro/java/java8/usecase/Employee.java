/**
 * 
 */
package com.wipro.java.java8.usecase;

/**
 * 
 */
import java.time.LocalDate;
public class Employee {
	private int empId;
	private String empName;
	private String empDept;
	private double empSal;
	private LocalDate empJoiningDate;
	public Employee(int id, String name, String department, double salary, LocalDate joiningDate)
	{
		this.empId = id;
		this.empName = name;
		this.empDept = department;
		this.empSal = salary;
		this.empJoiningDate = joiningDate;
	}
// Getters and Setters
	
	public int getId() {
		return empId;
	}

	public void setId(int id) {
		this.empId = id;
	}

	public String getName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public String getDepartment() {
		return empDept;
	}

	public void setDepartment(String department) {
		this.empDept = department;
	}

	public double getSalary() {
		return empSal;
	}

	public void setSalary(double salary) {
		this.empSal = salary;
	}

	public LocalDate getJoiningDate() {
		return empJoiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.empJoiningDate = joiningDate;
	}

	@Override
	//Returns a string representation of the Employee object.
	public String toString() {
		return "Employee { " + "ID=" + empId + ", Name='" + empName + '\'' +
				", Dept='" + empDept + '\'' + ", Salary=" + empSal +
				", JoiningDate=" + empJoiningDate + " }";
	}
}