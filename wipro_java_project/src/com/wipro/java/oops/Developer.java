/**
 * 
 */
package com.wipro.java.oops;

/**
 * parent class=Employee
 * child class=Developer
 * extends=keyword
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee employee=new Developer();//create a Developer object and set its properties inherited from Employee
		employee.setId(1245);//Setting Employee's ID
		employee.setName("james");//setting employee's name
		employee.setDepartment("Development");//setting employee's department
		employee.setSalary(50000f);//setting employee's salary
		
		System.out.println(employee.getId());//retrieving Employee's ID
		System.out.println(employee.getName());//retrieving employee's name
		System.out.println(employee.getDepartment());//retrieving employee's department
		System.out.println(employee.getSalary());//retrieving employee's salary
	}

}
