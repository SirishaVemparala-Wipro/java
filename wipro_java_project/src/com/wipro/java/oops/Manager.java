/**
 * 
 */
package com.wipro.java.oops;

/**
 * parent class=Employee
 * child class=Manager
 * extends=keyword
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String a[]) {
		Employee employee=new Manager();//create a Manager object and set its properties inherited from Employee
		employee.setId(5678);//Setting Employee's ID
		employee.setName("mark");//setting employee's name
		employee.setDepartment("Testing");//setting employee's department
		employee.setSalary(40000f);//setting employee's salary
		
		System.out.println(employee.getId());//retrieving Employee's ID
		System.out.println(employee.getName());//retrieving employee's name
		System.out.println(employee.getDepartment());//retrieving employee's department
		System.out.println(employee.getSalary());//retrieving employee's salary
	}

}
