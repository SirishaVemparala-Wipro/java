package com.wipro.java.exception;

public class UncheckedException {

	public static void main(String a[]) {
		String str=null;
		try {
			//attempting to call a method on null object
			int length = str.length();	//throws NullPointeException
		}catch(NullPointerException e) {
			System.out.println("cannot call methods on null object");
		}
	}
}
