package com.wipro.java.usecase;

import java.util.LinkedList;
import java.util.Scanner;

class Stack<T> {
	private LinkedList<T> list = new LinkedList<>();

	public void push(T item) {
		list.addFirst(item);
	}

	public T pop() {
		return list.isEmpty() ? null : list.removeFirst();
	}

	public T peek() {
		return list.isEmpty() ? null : list.getFirst();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}

// Non-editable part starts here
public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> integerStack = new Stack<>();
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int userInput = scanner.nextInt();
			integerStack.push(userInput);
		}

		System.out.println("Peek:" + integerStack.peek());
		System.out.println("Pop:" + integerStack.pop());
		System.out.println("Is Empty:" + integerStack.isEmpty());
		System.out.println("Pop:" + integerStack.pop());
		System.out.println("Pop:" + integerStack.pop());
		System.out.println("Is Empty:" + integerStack.isEmpty());

		Stack<String> stringStack = new Stack<>();
		scanner.nextLine();
		while (scanner.hasNextLine()) {
			String userInput = scanner.nextLine();
			if (userInput.isEmpty()) {
				break;
			}
			stringStack.push(userInput);
		}

		System.out.println("Peek: " + stringStack.peek());
		scanner.close();
	}
}