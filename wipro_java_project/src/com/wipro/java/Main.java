/**
 * 
 */
package com.wipro.java;

class MyClass {
    int num = 5;
 
    public void changeValue(int num) {
        this.num = num;
    }
}
 
public class Main {
    public static void main(String[] args) {
    	//creating instance of MyClass and assign it to obj
        MyClass obj = new MyClass();
        //calling changeValue method on obj and passing the value 10
        obj.changeValue(10);
        //print the value of num to the console
        System.out.println(obj.num);
    }
}


