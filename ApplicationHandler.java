package com.intfc;

public class ApplicationHandler implements MyMessage,MyCalculator { 

	@Override                                    // it will override the abstract method from MyMessage interface
	public String sendMessage(String name) {
		return "Welcome to "+name;   // we are returning some string to that abstract method.
	}

	public static void main(String[] args) {
		ApplicationHandler app=new ApplicationHandler();
		System.out.println(app.sendMessage("Vijay"));      // we called abstract method from MyMessage interface with passed "Vijay" as argument.       
		int arr[]= {10,20,30,40,50};                       //we have created array named as arr 
		System.out.println("Sum of values "+ app.sum(arr));  //we called abstract method from MyCalculator interface 
		                                                     //with passed arr array as argument.

	}

	@Override
	public int sum(int... arg) {
		int total=0;
		for(int n:arg) {
			total+=n;
		}
		return total;                // we are doing summation of all element in that arg array list
	}

	@Override
	public int square(int n) {
		return n*n;                       // we are returning value multiply by itself
	}

}
