package com.github.java.programs;

public class Multiplication {
	public static void main(String[] args) {
		Multiplication mul = new Multiplication();
		int result = mul.multiply(23, 2);
		System.out.println("Result is: "+result);
	}
	
	private int multiply(int a, int b) {
		return a * b;
	}
}

