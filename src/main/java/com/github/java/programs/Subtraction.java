package com.github.java.programs;

public class Subtraction {

	public static void main(String[] args) {
		Subtraction sub = new Subtraction();
		System.out.println("Subtraction result is:" + sub.subtract(24, 16));
	}
	
	private int subtract(int a, int b) {
		return a - b;
	}
	
}
