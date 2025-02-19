package com.wipro.java.collection.linkedlistsorting;

/*
 * design a user created linkedin list 
 */
import java.util.*;

class User {
	private String name;
	private String email;
	private String linkedInProfile;

	public User(String name, String email, String linkedInProfile) {
		this.name = name;
		this.email = email;
		this.linkedInProfile = linkedInProfile;
	}

	@Override
	public String toString() {
		return "\nName: " + name + "\nEmail: " + email + "\nLinkedIn: " + linkedInProfile + "\n";
	}
}

public class UserLinkedInList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<User> userList = new ArrayList<>();

		System.out.println("-------LinkedIn User List--------");
		while (true) {
			System.out.print("\nEnter Name: ");
			String name = scanner.nextLine();

			System.out.print("Enter Email: ");
			String email = scanner.nextLine();

			System.out.print("Enter LinkedIn Profile URL: ");
			String linkedInProfile = scanner.nextLine();

			// Add new user to the list
			userList.add(new User(name, email, linkedInProfile));

			System.out.print("\nDo you want to add another user? (yes/no): ");
			String choice = scanner.nextLine().trim().toLowerCase();

			if (choice.equals("no")) {
				break;
			}
		}

		// Display all users
		System.out.println("\n------ User List -------");
		for (User user : userList) {
			System.out.println(user);
		}

		scanner.close();
	}
}
