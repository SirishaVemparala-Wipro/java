/**
 * 
 */
package com.wipro.java.java8.usecase;

/**
 * 
 */
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
	public class EmployeeManagement {
		public static void main(String[] args) {
			EmployeeService service = new EmployeeService();
			Scanner scanner = new Scanner(System.in);
			// Adding some employees for testing
			service.addEmployee(new Employee(1, "Sirisha", "IT", 50000, LocalDate.of(2020, 5, 10)));
			service.addEmployee(new Employee(2, "Prathyusha", "HR", 60000, LocalDate.of(2019, 3, 15)));
			service.addEmployee(new Employee(3, "Padma", "Finance", 70000, LocalDate.of(2021, 8,
					22)));
			while (true) {
				System.out.println("\n------ Employee Management System ------");
				System.out.println("1. Add Employee");
				System.out.println("2. Remove Employee");
				System.out.println("3. Search Employee");
				System.out.println("4. Update Salary");
				System.out.println("5. Display All Employees");
				System.out.println("6. Filter by Department");
				System.out.println("7. Sort by Name");
				System.out.println("8. Get Average Salary");
				System.out.println("9. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					try{
						System.out.print("Enter ID: ");
					
					int id = scanner.nextInt();
					scanner.nextLine(); 
					System.out.print("Enter Name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Department: ");
					String dept = scanner.nextLine();
					System.out.print("Enter Salary: ");
					double salary = scanner.nextDouble();
					if(salary<0) 
						throw new IllegalArgumentException("Salary cannot be negative");
						service.addEmployee(new Employee(id, name, dept, salary, LocalDate.now()));
						}catch(Exception e) {
							System.out.println("Salary cannot be negative");
					}
					break;
				case 2:
					try {
					System.out.print("Enter Employee ID to Remove: ");
					int removeId = scanner.nextInt();
					Optional<Employee> empToRemove=service.searchEmployee(removeId);
					if(empToRemove.isEmpty()) {
						throw new IllegalArgumentException("Employee ID:"+removeId+" Not Exists");
					}service.removeEmployee(removeId);
					System.out.println("Employee with id"+removeId+"is removed");
					}catch(IllegalArgumentException e) {
						System.out.println("Error:"+e.getMessage());
					}
					break;
					
				case 3:
					System.out.print("Enter Employee ID to Search: ");
					int searchId = scanner.nextInt();
					Optional<Employee> emp = service.searchEmployee(searchId);
					System.out.println(emp.orElse(null));
					break;
				case 4:
					System.out.print("Enter Employee ID to Update Salary: ");
					int updateId = scanner.nextInt();
					System.out.print("Enter New Salary: ");
					double newSalary = scanner.nextDouble();
					service.updateSalary(updateId, newSalary);
					break;
				case 5:
					service.displayEmployees();
					break;
				case 6:
					try {
					System.out.print("Enter Department: ");
					scanner.nextLine();
					String department = scanner.nextLine();
					List<Employee> filtered = service.filterByDepartment(department);
					if(filtered.isEmpty()) {
						throw new Exception("Employee with Department "+department+" Does not exits");
					}filtered.forEach(System.out::println);
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 7:
					List<Employee> sorted = service.sortByName();
					sorted.forEach(System.out::println);
					break;
				case 8:
					System.out.println("Average Salary: " + service.getAverageSalary());
					break;
				case 9:
					System.out.println("Exiting...");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice! Try again.");
				}
			}
		}
	}
