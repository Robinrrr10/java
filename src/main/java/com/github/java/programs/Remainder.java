package com.github.java.programs;

public class Remainder {

	public static void main(String[] args) {
		Remainder rem = new Remainder();
		int result = rem.remaining(23, 10);
		System.out.println("Result is: "+result);
	}
	
	private int remaining(int a, int b) {
		return a % b;
	}
	
}
