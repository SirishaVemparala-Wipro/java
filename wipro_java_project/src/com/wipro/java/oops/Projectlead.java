/**
 * 
 */
package com.wipro.java.oops;

/**
 * parent class=Employee
 * child class=Projectlead
 * extends=keyword
 */
public class Projectlead extends Employee{

	/**
	 * 
	 */
	public Projectlead() {
		
	}
		// TODO Auto-generated constructor stub
		public static void main(String a[]) {
			//child object is instantiated from the child constructor
			//parent class consumes the props and behaviors of child class
			/*Projectlead projectlead=new Projectlead();
			Projectlead projectLead1=(Projectlead) new Employee();*/
			Employee employee=new Projectlead();//create a Projectlead object and set its properties inherited from Employee
			employee.setId(1234);//Setting Employee's ID
			employee.setName("andrew");//setting employee's name
			employee.setDepartment("Marketing");//setting employee's department
			employee.setSalary(35000f);//setting employee's salary
			
			System.out.println(employee.getId());//retrieving Employee's ID
			System.out.println(employee.getName());//retrieving employee's name
			System.out.println(employee.getDepartment());//retrieving employee's department
			System.out.println(employee.getSalary());//retrieving employee's salary
			
		
	}

}

