package com.wipro.java.designpattern.factory.buttons;
	/**
	 * All products families have the same varieties (MacOS/Windows).
	 *
	 * This is another variant of a button.
	 */
	public class WindowsButton implements Button {//Implements Button for Windows.

	    @Override
	    public void paint() {
	        System.out.println("You have created WindowsButton.");
	    }
	}


